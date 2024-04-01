package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties pro;
    public ReadConfig(){
        File src = new File("src/main/java/config/config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public String getAppUrl(){
        String appUrl = pro.getProperty("url");
        return appUrl;
    }

    public String getEmail(){
        String appUsername = pro.getProperty("username");
        return appUsername;
    }

    public String getPassword(){
        String appPassword = pro.getProperty("password");
        return appPassword;
    }

    public String getDriver(){
        String dri = pro.getProperty("chromeDriver");
        return dri;
    }
}

