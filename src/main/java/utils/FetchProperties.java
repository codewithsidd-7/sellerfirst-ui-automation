package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchProperties {
    public static Properties fetchConfigValues(){
        Properties properties = new Properties();
        String path = "src/main/resources/config/config.properties";
        try (FileInputStream inputStream = new FileInputStream(path)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to load properties file: " + path);
        }
        return properties;
    }
    public static String fetchAbsoluteFilePath(String relative){
        File file=new File(relative);
        return file.getAbsolutePath();
    }
}
