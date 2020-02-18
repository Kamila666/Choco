package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends Hooks {
    @Test
    public void comment() {

        AndroidElement close = newAndroidWebEl("tvClose");
        close.click();

        AndroidElement positive = newAndroidWebEl("btnPositive");
        positive.click();

        AndroidElement allow = newAndroidClassName("Button", "РАЗРЕШИТЬ");
        allow.click();

        AndroidElement history = newAndroidWebEl("ivIconProfile");
        history.click();
        System.out.println("Заходим в аккаунт");

        AndroidElement phoneNumber = newAndroidWebEl("metPhoneNumber");
        phoneNumber.click();
        phoneNumber.click();
        phoneNumber.sendKeys("77769726968");
        System.out.println("Вводим номер");

        AndroidElement password = newAndroidWebEl("metPassword");
        password.sendKeys("KTasybekova2");
        System.out.println("Вводим пароль");

        AndroidElement Continue = newAndroidWebEl("btnContinue");
        Continue.click();

        AndroidElement tv1 = newAndroidWebEl("tv1");
        AndroidElement tv2 = newAndroidWebEl("tv2");

        tv1.click();
        tv2.click();
        tv1.click();
        tv2.click();
        System.out.println("Код доступа к приложению");

        tv1.click();
        tv2.click();
        tv1.click();
        tv2.click();
        System.out.println("Подтверждаем код");

        AndroidElement message = newAndroidWebEl("ivIconMessenger");
        message.click();
        System.out.println("Заходим в сообщения");

        AndroidElement cash = newAndroidClassName("TextView", "#Рахмет Кэшбэк");
        cash.click();

        AndroidElement title = newAndroidClassName("TextView", "Ecosmoke.kz в ТРЦ АЛМА-АТА \n" +
                "Кэшбэк: 5% (+105) \n" +
                "Баланс: 105");
        boolean flag1 = (title.getText()).equals("Ecosmoke.kz в ТРЦ АЛМА-АТА \n" +
                "Кэшбэк: 5% (+105) \n" +
                "Баланс: 105");
        Assert.assertTrue(flag1, "Элементы страницы 'История' отображаются некорректно");




    }

}