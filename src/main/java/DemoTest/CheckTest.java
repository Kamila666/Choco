package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTest extends BeforeAfterTest{
    @Test
    public void history() {
        AndroidElement close = newAndroidWebEl("kz.rahmet.app:id/tvClose", this.DefaultTimeout);
        close.click();

        AndroidElement positive = newAndroidWebEl("kz.rahmet.app:id/btnPositive", this.DefaultTimeout);
        positive.click();

        AndroidElement allow = newAndroidWebEl("com.android.packageinstaller:id/permission_allow_button", this.DefaultTimeout);
        allow.click();

        AndroidElement history = newAndroidWebEl("kz.rahmet.app:id/ivIconHistory", this.DefaultTimeout);
        history.click();
        System.out.println("Заходим в аккаунт");

        AndroidElement phoneNumber = newAndroidWebEl("kz.rahmet.app:id/metPhoneNumber", this.DefaultTimeout);
//        phoneNumber.click();
        phoneNumber.sendKeys("77769726968");
        System.out.println("Вводим номер");

        AndroidElement password = newAndroidWebEl("kz.rahmet.app:id/metPassword", this.DefaultTimeout);
        password.click();
        password.sendKeys("KTasybekova2");
        System.out.println("Вводим пароль");

        AndroidElement btnContinue = newAndroidWebEl("kz.rahmet.app:id/btnContinue", this.DefaultTimeout);
        btnContinue.click();
        System.out.println("Заходим в аккаунт");

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

        AndroidElement tvHint = newAndroidWebEl("kz.rahmet.app:id/tvHint", this.DefaultTimeout);
        boolean flag = (tvHint.getText()).equals("Соверши свою первую покупку с помощью QR-кода!");
        Assert.assertTrue(flag, "Элементы страницы 'История' отображаются некорректно");












    }
}
