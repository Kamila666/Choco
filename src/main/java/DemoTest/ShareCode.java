package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShareCode extends BeforeAfterTest {
    @Test
    public void ShareCode() {
        MainMenu();

        LoginAccount();

        ReferralProgram();

        Share();


    }

    private void Share() {
        AndroidElement messenger = newAndroidWebEl("kz.rahmet.app:id/btnShareCode", this.DefaultTimeout);
        messenger.click();
        System.out.println("Поделиться");

        AndroidElement gmail = newAndroidXpath("android.widget.TextView","Gmail");
        gmail.click();
        System.out.println("Поделиться Gmail");


        AndroidElement to = newAndroidWebEl("com.google.android.gm:id/to", this.DefaultTimeout);
        to.click();
        to.sendKeys("ktasybekova66@gmail.com");

        AndroidElement send = newAndroidWebEl("com.google.android.gm:id/send", this.DefaultTimeout);
        send.click();
        System.out.println("Отправляем ссылку");

        AndroidElement code = newAndroidWebEl("kz.rahmet.app:id/tvLongRahmet", this.DefaultTimeout);
        boolean flag2 = (code.getText()).equals("Твоему другу отправлен код");
        Assert.assertTrue(flag2, "Элементы страницы 'История' отображаются некорректно");

        AndroidElement success = newAndroidWebEl("kz.rahmet.app:id/btnCloseReferralSuccess", this.DefaultTimeout);
        success.click();
        System.out.println("Код отправлен успешно");
    }

    private void ReferralProgram() {
        AndroidElement referral = newAndroidWebEl("kz.rahmet.app:id/clReferralProgram", this.DefaultTimeout);
        referral.click();
        System.out.println("Заходим в реферальную программу");

        AndroidElement description = newAndroidWebEl("kz.rahmet.app:id/tvReferralDescription", this.DefaultTimeout);
        boolean flag = (description.getText()).equals("Отправь друзьям свой личный код. Они получат 1000 тенге на баланс РАХМЕТА, а ты 1000 тенге за каждого, кто совершит свою первую покупку РАХМЕТом (не меньше, чем на 1500 тг)");
        Assert.assertTrue(flag, "Элементы страницы 'Реферальная программа' отображаются некорректно");
        System.out.println("Элементы страницы 'Реферальная программа' отображаются корректно");
    }

    private void LoginAccount() {
        AndroidElement history = newAndroidWebEl("kz.rahmet.app:id/ivIconProfile", this.DefaultTimeout);
        history.click();
        System.out.println("Заходим в аккаунт");

        AndroidElement phoneNumber = newAndroidWebEl("kz.rahmet.app:id/metPhoneNumber", this.DefaultTimeout);
        phoneNumber.click();
        phoneNumber.click();
        phoneNumber.sendKeys("77769726968");
        System.out.println("Вводим номер");

        AndroidElement password = newAndroidWebEl("kz.rahmet.app:id/metPassword", this.DefaultTimeout);
        password.sendKeys("KTasybekova2");
        System.out.println("Вводим пароль");

        AndroidElement Continue = newAndroidWebEl("kz.rahmet.app:id/btnContinue", this.DefaultTimeout);
        Continue.click();

        AndroidElement tv1 = newAndroidWebEl("kz.rahmet.app:id/tv1", this.DefaultTimeout);
        AndroidElement tv2 = newAndroidWebEl("kz.rahmet.app:id/tv2", this.DefaultTimeout);

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
    }

    private void MainMenu() {
        AndroidElement close = newAndroidWebEl("kz.rahmet.app:id/tvClose", this.DefaultTimeout);
        close.click();

        AndroidElement positive = newAndroidWebEl("kz.rahmet.app:id/btnPositive", this.DefaultTimeout);
        positive.click();

        AndroidElement allow = newAndroidWebEl("com.android.packageinstaller:id/permission_allow_button", this.DefaultTimeout);
        allow.click();
    }
}
