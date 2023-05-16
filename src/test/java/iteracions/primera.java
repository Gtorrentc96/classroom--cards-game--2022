package iteracions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class primera {

    static String packageName = "com.drpicox.game";
    static String outputDirShort = "com.drpicox.tests";
    static String outputDir = "src/test/java/" + outputDirShort;

    public static void main(String[] args) {
        try {
            List<String> packageNames = getPackagesFromPackage(packageName);
            for (String pkg : packageNames) {
                List<Class<?>> classes = getClassesFromPackage(pkg);
                for (Class<?> clazz : classes) {
                    String junitCode = generateJUnitForClass(clazz);
                    String fileName = outputDir + "/" + clazz.getSimpleName() + "Test.java";
                    writeFile(fileName, junitCode);
                }
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }

    private static List<String> getPackagesFromPackage(String packageName)
    throws ClassNotFoundException, IOException {
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
        junitCode += "import org.junit.Test;\n\n";
        junitCode += "public class " + className + "Test {\n\n";
        junitCode += "    @Test\n";
        junitCode += "    public void test() {\n";
        junitCode += "        // Add test code here\n";
        junitCode += "    }\n\n";
        junitCode += "}\n";
        return junitCode;
    }

    private static void writeFile(String fileName, String content) throws IOException {
        File file = new File(fileName);
        file.getParentFile().mkdirs();
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }
}
