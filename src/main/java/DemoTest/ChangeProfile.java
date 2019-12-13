package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeProfile extends BeforeAfterTest {

    @Test
    public void profile() {
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

        AndroidElement profile = newAndroidWebEl("kz.rahmet.app:id/ivIconProfile", this.DefaultTimeout);
        profile.click();
        System.out.println("Заходим в профиль");

        AndroidElement change = newAndroidWebEl("kz.rahmet.app:id/tvChange", this.DefaultTimeout);
        change.click();
        System.out.println("Редактируем профиль");

        AndroidElement firstName = newAndroidWebEl("kz.rahmet.app:id/metFirstName", this.DefaultTimeout);
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Kamila");

        AndroidElement lastName = newAndroidIndex("android.widget.EditText", "1");
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Tasybekova");

        AndroidElement gender = newAndroidWebEl("kz.rahmet.app:id/metGender", this.DefaultTimeout);
        gender.click();

        AndroidElement gender2 = newAndroidXpath("android.widget.TextView", "Женский");
        gender2.click();
        verticalSwipe();
        verticalSwipe();



        AndroidElement save = newAndroidWebEl("kz.rahmet.app:id/buttonSave", this.DefaultTimeout);
        save.click();

        AndroidElement name = newAndroidWebEl("kz.rahmet.app:id/tvNameOrEmail", this.DefaultTimeout);
        boolean flag = (name.getText()).equals("Kamila Tasybekova");
        Assert.assertTrue(flag, "Элементы страницы 'История' отображаются некорректно");





    }
}
