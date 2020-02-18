package DemoTest;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;

public class Hooks {
    public AndroidDriver driver;
    public static final int DEFAULT_ACTION_DELAY = 2;
    public static final String ANDROID_ROOT_ID = "kz.rahmet.app";
    public static final String ANDROID_LAUNCH_ACTIVITY_ID = "kz.rahmet.app.mvp.root.ActivityMain";
    public static final String ANDROID_ROOT_CLASSNAME = "android.widget.";

    @BeforeTest
    public void setup() throws MalformedURLException {

        /**Настройка нужных возможностей  Android и пакет приложений в Appium*/
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Galaxy J7");

        capabilities.setCapability("platformName", "Android");

//        capabilities.setCapability("noReset", "true");
//
//        capabilities.setCapability("fullReset", "false");

        /**Это название пакета вашего приложения (вы можете получить его из приложения apk info app)*/
        capabilities.setCapability("appPackage", ANDROID_ROOT_ID);

        capabilities.setCapability("appActivity", ANDROID_LAUNCH_ACTIVITY_ID);

        /**Подключение к серверу Appium*/
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        System.out.println("Successful");

    }

    /**Ожидание при поиске элемента*/
    public void waitForOneSec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void waitForTwoSec(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForFiveSec(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void waitForFortySec(){
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**Поиск элемента по ID*/
    AndroidElement newAndroidWebEl(String id) {
        return (AndroidElement) new WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT).until(
                ExpectedConditions.elementToBeClickable(MobileBy.id((ANDROID_ROOT_ID + ":id/" + id)))
        );
    }

    AndroidElement newAndroidWebElement(String id) {
        return (AndroidElement) new  WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.linkText("+text+")));

    }

    /**Поиск элемента по тексту*/
    public AndroidElement newAndroidText(String text) {
        return (AndroidElement) new  WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.linkText("+text+")));
    }





    /**Поиск элемента по классу и тексту*/
    AndroidElement newAndroidClassName(String className, String TextView) {
        return (AndroidElement) new  WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//"+ANDROID_ROOT_CLASSNAME + className + "[@text='"+TextView+"']"))
        );
    }


    /**Поиск элемента по content desc*/
    public AndroidElement newAndroidContentDesc(String className,  String TextView) {
        return (AndroidElement) new  WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//"+className+"[@content-desc='"+TextView+"']"))
        );
    }



    /**
     *Поиск элемента по классу и индексу
     */
    AndroidElement newAndroidIndex(String className, String TextView) {
        return (AndroidElement) new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//"+ANDROID_ROOT_CLASSNAME + className +"[@index='"+TextView+"']"))
        );
    }



    void verticalSwipe()
    {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width/2;
        int starty = (int)(height*0.80);
        int endy = (int)(height*0.20);
        driver.swipe(x, starty, x, endy, 500);

    }

    void swipeUp()
    {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width/2;
        int starty = (int)(height*0.20);
        int endy = (int)(height*0.80);
        driver.swipe(x, starty, x, endy, 500);

    }

    public void hortizonalSwipe()
    {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int y = (int)(height*0.20);
        int startx = (int)(width*0.75);
        int endx = (int)(width*0.35);
        driver.swipe(startx, y, endx, y, 500);
    }



/**кнопки нажатия 'Home','Back','Menu'*/

//    driver.pressKeyCode(AndroidKeyCode.HOME);
//    driver.pressKeyCode(AndroidKeyCode.BACK);
//    driver.pressKeyCode(AndroidKeyCode.MENU);
//    driver.pressKeyCode(AndroidKeyCode.KEYCODE_LANGUAGE_SWITCH);










    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public static class FailTapMessage {

        public static void failTapMessage(String s, NoSuchElementException e){
            Assert.fail("Невозможно кликнуть на кнопку '"+s+"', элемент отсутствует или заблокирован.", e);
        }
    }
}

