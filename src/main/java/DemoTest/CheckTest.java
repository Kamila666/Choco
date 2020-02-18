package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTest extends Hooks {
    @Test
    public void history() {

        AndroidElement close = newAndroidWebEl("tvClose");
        close.click();

        AndroidElement positive = newAndroidWebEl("btnPositive");
        positive.click();

        AndroidElement allow = newAndroidClassName("Button", "РАЗРЕШИТЬ");
        allow.click();

        AndroidElement history = newAndroidWebEl("ivIconHistory");
        history.click();
        System.out.println("Заходим в аккаунт");

        AndroidElement phoneNumber = newAndroidWebEl("metPhoneNumber");
//        phoneNumber.click();
        phoneNumber.sendKeys("77769726968");
        System.out.println("Вводим номер");

        AndroidElement password = newAndroidWebEl("metPassword");
        password.click();
        password.sendKeys("KTasybekova2");
        System.out.println("Вводим пароль");

        AndroidElement btnContinue = newAndroidWebEl("btnContinue");
        btnContinue.click();
        System.out.println("Заходим в аккаунт");

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



        AndroidElement tvHint = newAndroidWebEl("tvName");
        boolean flag = (tvHint.getText()).equals("Burger Station");
        Assert.assertTrue(flag, "Элементы страницы 'История' отображаются некорректно");




    }






}
