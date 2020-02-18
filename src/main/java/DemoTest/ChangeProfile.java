package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeProfile extends Hooks {

    @Test
    public void profile() {

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

        AndroidElement profile = newAndroidWebEl("ivIconProfile");
        profile.click();
        System.out.println("Заходим в профиль");

        AndroidElement change = newAndroidWebEl("tvChange");
        change.click();
        System.out.println("Редактируем профиль");

        AndroidElement firstName = newAndroidWebEl("metFirstName");
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Kamila");

        AndroidElement lastName = newAndroidWebEl("metLastName");
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Tasybekova");

        AndroidElement gender = newAndroidWebEl("metGender");
        gender.click();

        AndroidElement gender2 = newAndroidClassName("TextView", "Женский");
        gender2.click();
        verticalSwipe();
        verticalSwipe();


        AndroidElement save = newAndroidWebEl("buttonSave");
        save.click();


        AndroidElement name = newAndroidWebEl("tvNameOrEmail");
        boolean flag = (name.getText()).equals("Kamila Tasybekova");
        Assert.assertTrue(flag, "Элементы страницы 'История' отображаются некорректно");

    }



}
