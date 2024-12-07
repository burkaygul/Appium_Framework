package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class BaseClass {


    AppiumDriverLocalService serviceBuilder;
    UiAutomator2Options options;
    AndroidDriver androidDriver;

    @BeforeClass
    public void setup(){

        serviceBuilder= new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\Burkay9\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("0.0.0.0")
                .usingPort(4723)
                .build();

        serviceBuilder.start();

        options= new UiAutomator2Options();
        options.setDeviceName("Pixel 7");
        options.setApp("C:\\Users\\Burkay9\\IdeaProjects\\Appium_AboneSepeti\\Apps\\Calculator_8.4 (503542421)_APKPure.apk");

    }

    @AfterClass
    public void teardown(){
        androidDriver.quit();
        serviceBuilder.stop();
    }
}
