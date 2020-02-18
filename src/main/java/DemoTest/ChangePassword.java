package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

public class ChangePassword extends Hooks {
    @Test
    public void password() {
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

        AndroidElement setting = newAndroidWebEl("ivBtnSettings");
        setting.click();
        System.out.println("заходим в настройки");

        AndroidElement change = newAndroidClassName("TextView", "Сменить пароль");
        change.click();

        AndroidElement current = newAndroidWebEl("metCurrentPassword");
        current.click();
        current.sendKeys("KTasybekova2");
        System.out.println("Вводим текущий пароль");

        AndroidElement newPassword = newAndroidWebEl("metNewPassword");
        newPassword.click();
        newPassword.sendKeys("KTasybekova1");
        System.out.println("Вводим новый пароль");

        AndroidElement repeat = newAndroidWebEl("metRepeatPassword");
        repeat.click();
        repeat.sendKeys("KTasybekova1");
        System.out.println("Повтор нового пароля");

        AndroidElement save = newAndroidWebEl("btnSave");
        save.click();
        System.out.println("Сохраняем");

        AndroidElement save2 = newAndroidWebEl("md_buttonDefaultNegative");
        save2.click();

        AndroidElement logOut = newAndroidWebEl("tvLogOut");
        logOut.click();
        System.out.println("Выходим с аккаунта");

        AndroidElement profile = newAndroidWebEl("ivIconProfile");
        profile.click();

        AndroidElement phone = newAndroidWebEl("metPhoneNumber");
        phone.click();
        phone.sendKeys("77769726968");
        System.out.println("Вводим телефон");

        AndroidElement password2 = newAndroidWebEl("metPassword");
        password2.click();
        password2.sendKeys("KTasybekova2");
        System.out.println("Вводим старый телефон");

        AndroidElement btnContinue = newAndroidWebEl("btnContinue");
        btnContinue.click();

        AndroidElement password3 = newAndroidWebEl("metPassword");
        password3.click();
        password3.sendKeys("KTasybekova1");
        System.out.println("Вводим новый пароль");

        AndroidElement btnContinue2 = newAndroidWebEl("btnContinue");
        btnContinue2.click();

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

        AndroidElement profile2 = newAndroidWebEl("ivIconProfile");
        profile2.click();

        AndroidElement settings = newAndroidWebEl("ivBtnSettings");
        settings.click();

        change.click();
        System.out.println("Меняем пароль на старый");

        current.click();
        current.sendKeys("KTasybekova1");
        System.out.println("Вводим текущий пароль");

        newPassword.click();
        newPassword.sendKeys("KTasybekova2");
        System.out.println("Вводим новый пароль");

        repeat.click();
        repeat.sendKeys("KTasybekova2");
        System.out.println("Повтор нового пароля");

        save.click();
        System.out.println("Сохраняем");

        save2.click();



    }
}
