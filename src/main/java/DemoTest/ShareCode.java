package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShareCode extends Hooks {
    @Test
    public void ShareCode() {

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

        AndroidElement referral = newAndroidWebEl("clReferralProgram");
        referral.click();
        System.out.println("Заходим в реферальную программу");

        AndroidElement description = newAndroidWebEl("tvReferralDescription");
        boolean flag = (description.getText()).equals("Отправь друзьям свой личный код. Они получат 1000 тенге на баланс РАХМЕТА, а ты 1000 тенге за каждого, кто совершит свою первую покупку РАХМЕТом (не меньше, чем на 1500 тг)");
        Assert.assertTrue(flag, "Элементы страницы 'Реферальная программа' отображаются некорректно");
        System.out.println("Элементы страницы 'Реферальная программа' отображаются корректно");


        AndroidElement messenger = newAndroidWebEl("btnShareCode");
        messenger.click();
        System.out.println("Поделиться");

        AndroidElement gmail = newAndroidClassName("TextView","Gmail");
        gmail.click();
        System.out.println("Поделиться Gmail");


        AndroidElement to = newAndroidWebElement("com.google.android.gm:id/to");
        to.click();
        to.sendKeys("ktasybekova66@gmail.com");

        AndroidElement send = newAndroidWebElement("com.google.android.gm:id/send");
        send.click();
        System.out.println("Отправляем ссылку");

        AndroidElement code = newAndroidWebEl("tvLongRahmet");
        boolean flag2 = (code.getText()).equals("Твоему другу отправлен код");
        Assert.assertTrue(flag2, "Элементы страницы 'История' отображаются некорректно");

        AndroidElement success = newAndroidWebEl("btnCloseReferralSuccess");
        success.click();
        System.out.println("Код отправлен успешно");
    }





}
