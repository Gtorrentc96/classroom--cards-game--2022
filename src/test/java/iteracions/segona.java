package iteracions;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class segona {

    static String packageName = "com.drpicox.game"; // insert the package name here
    static String outputDirShort = "com.drpicox.tests"; // insert the output directory here
    static String outputDir = "src/test/java/" + outputDirShort;

    public static void main(String[] args) {
        try {
            List<String> packageNames = getPackagesFromPackage(packageName);
            for (String pkg : packageNames) {
                List<Class<?>> classes = getClassesFromPackage(pkg);
                for (Class<?> clazz : classes) {
                    if (!clazz.isInterface()) {
                        String junitCode = generateJUnitForClass(clazz);
                        junitCode += "}\n";
                        String fileName = outputDir + "/" + clazz.getSimpleName() + "Test.java";
                        writeFile(fileName, junitCode);
                    }
                }
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }

    private static List<String> getPackagesFromPackage(String packageName) throws ClassNotFoundException, IOException {
        List<String> packages = new ArrayList<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        for (File file : new File(classLoader.getResource(path).getFile()).listFiles()) {
            if (file.isDirectory()) {
                String subPackage = packageName + "." + file.getName();
                packages.add(subPackage);
                packages.addAll(getPackagesFromPackage(subPackage));
            }
        }
        return packages;
    }

    private static List<Class<?>> getClassesFromPackage(String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        for (File file : new File(classLoader.getResource(path).getFile()).listFiles()) {
            if (file.isFile() && file.getName().endsWith(".class")) {
                String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                classes.add(Class.forName(className));
            }
        }
        return classes;
    }

    private static String generateJUnitForClass(Class<?> clazz) {
        String className = clazz.getSimpleName();
        String junitCode = "package " + outputDirShort + ";\n";
        junitCode += "import " + clazz.getPackageName() + "." + className + ";\n";
        junitCode += "import org.junit.Test;\n\n";
        junitCode += "public class " + className + "Test {\n\n";
        Constructor[] constructors = clazz.getConstructors();
        int i = 1;
        for (Constructor constructor : constructors){
            if (i == 1)
                junitCode += "\t" +className + " instance";
            else
                junitCode += "\t" +className + " instance" + i;
            junitCode += ";\n\n";
            i++;
        }
        i = 1;
        for (Constructor constructor : constructors){
            junitCode += "\t@Test\n";
            junitCode += "\tpublic void " + className + "Test";
            for (Class<?> paramType : constructor.getParameterTypes()){
                String param = paramType.getSimpleName();
                junitCode += param.replace("[]", "$$");
            }
            junitCode += "() {\n";
            junitCode += "\t\ttry{\n";
            if (i == 1)
                junitCode += "\t\t\tinstance = new " + className + "(";
            else
                junitCode += "\t\t\tinstance" + i + " = new " + className + "(";
            junitCode += constructorParametrType(constructor);
            junitCode += ");\n";
            junitCode += "\t\t} catch (Exception e) {}\n";
            junitCode += "\t}\n\n";
            i++;
        }
        return junitCode;
    }

    private static String constructorParametrType(Constructor constructor) {
        String junitCode = "";
        Class[] parameters = constructor.getParameterTypes();
        int i = 0;
        for (Class parameter : parameters) {
            switch(parameter.getSimpleName()) {
                case "byte": junitCode += "0";
                    break;
                case "short": junitCode += "0";
                    break;
                case "int": junitCode += "0";
                    break;
                case "long": junitCode += "0.0L";
                    break;
                case "float": junitCode += "0.0f";
                    break;
                case "double": junitCode += "0.0d";
                    break;
                case "char": junitCode += "\' \'";
                    break;
                case "String": junitCode += "\" \"";
                    break;
                case "boolean": junitCode += "false";
                    break;
                default: junitCode += "null";
            }
            if (i < constructor.getParameterCount() - 1) {
                junitCode += ", ";
            }
            i++;
        }
        return junitCode;
    }


    private static void writeFile(String fileName, String content) throws IOException {
        File file = new File(fileName);
        file.getParentFile().mkdirs();
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }
}
