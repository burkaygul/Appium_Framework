package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C01_Deneme extends BaseClass{




    @Test
    public void test01() throws MalformedURLException {

        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723"),options);

        androidDriver.findElement(AppiumBy.accessibilityId("1")).click();

    }
}
