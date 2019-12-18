package DemoTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class ChangePassword extends BeforeAfterTest {
    @Test
    public void password() {
        AndroidElement close = newAndroidWebEl("kz.rahmet.app:id/tvClose", this.DefaultTimeout);
        close.click();

        AndroidElement positive = newAndroidWebEl("kz.rahmet.app:id/btnPositive", this.DefaultTimeout);
        positive.click();

        AndroidElement allow = newAndroidWebEl("com.android.packageinstaller:id/permission_allow_button", this.DefaultTimeout);
        allow.click();

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

        AndroidElement setting = newAndroidWebEl("kz.rahmet.app:id/ivBtnSettings", this.DefaultTimeout);
        setting.click();
        System.out.println("заходим в настройки");

        AndroidElement change = newAndroidXpath("android.widget.TextView", "Сменить пароль");
        change.click();

        AndroidElement current = newAndroidWebEl("kz.rahmet.app:id/metCurrentPassword", this.DefaultTimeout);
        current.click();
        current.sendKeys("KTasybekova2");
        System.out.println("Вводим текущий пароль");

        AndroidElement newPassword = newAndroidWebEl("kz.rahmet.app:id/metNewPassword", this.DefaultTimeout);
        newPassword.click();
        newPassword.sendKeys("KTasybekova1");
        System.out.println("Вводим новый пароль");

        AndroidElement repeat = newAndroidWebEl("kz.rahmet.app:id/metRepeatPassword", this.DefaultTimeout);
        repeat.click();
        repeat.sendKeys("KTasybekova1");
        System.out.println("Повтор нового пароля");

        AndroidElement save = newAndroidWebEl("kz.rahmet.app:id/btnSave", this.DefaultTimeout);
        save.click();
        System.out.println("Сохраняем");

        AndroidElement save2 = newAndroidWebEl("kz.rahmet.app:id/md_buttonDefaultNegative", this.DefaultTimeout);
        save2.click();

        AndroidElement logOut = newAndroidWebEl("kz.rahmet.app:id/tvLogOut", this.DefaultTimeout);
        logOut.click();
        System.out.println("Выходим с аккаунта");

        AndroidElement profile = newAndroidWebEl("kz.rahmet.app:id/ivIconProfile", this.DefaultTimeout);
        profile.click();

        AndroidElement phone = newAndroidWebEl("kz.rahmet.app:id/metPhoneNumber", this.DefaultTimeout);
        phone.click();
        phone.sendKeys("77769726968");
        System.out.println("Вводим телефон");

        AndroidElement password2 = newAndroidWebEl("kz.rahmet.app:id/metPassword", this.DefaultTimeout);
        password2.click();
        password2.sendKeys("KTasybekova2");
        System.out.println("Вводим старый телефон");

        AndroidElement btnContinue = newAndroidWebEl("kz.rahmet.app:id/btnContinue", this.DefaultTimeout);
        btnContinue.click();

        AndroidElement password3 = newAndroidWebEl("kz.rahmet.app:id/metPassword", this.DefaultTimeout);
        password3.click();
        password3.sendKeys("KTasybekova1");
        System.out.println("Вводим новый пароль");

        AndroidElement btnContinue2 = newAndroidWebEl("kz.rahmet.app:id/btnContinue", this.DefaultTimeout);
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

        AndroidElement profile2 = newAndroidWebEl("kz.rahmet.app:id/ivIconProfile", this.DefaultTimeout);
        profile2.click();

        AndroidElement settings = newAndroidWebEl("kz.rahmet.app:id/ivBtnSettings", this.DefaultTimeout);
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
