package DemoTest;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Address extends BeforeAfterTest{
    @Test
    public void password() {
        MainMenu();

        LoginAccount();

        OneTimePassword();

        Search();

        FirstPlace();


        SecondPlace();


    }

    private void SecondPlace() {
        AndroidElement cafe = newAndroidXpath("android.widget.TextView", "Филиалы");
        cafe.click();
        System.out.println("Выбираем другое заведение");

        AndroidElement text2 = newAndroidXpath("android.widget.TextView", "Lanzhou ADK");
        text2.click();

        AndroidElement lanzhou = newAndroidWebEl("kz.rahmet.app:id/tvName", this.DefaultTimeout);
        boolean flag2 = (lanzhou.getText()).equals("Lanzhou ADK");
        Assert.assertTrue(flag2, "Элементы страницы  отображаются некорректно");

        /**Реферальная программа не работает*/
//        AndroidElement howWork = newAndroidWebEl("kz.rahmet.app:id/tvHowGradingWorks", this.DefaultTimeout);
//        howWork.click();
//
//        AndroidElement title = newAndroidWebEl("kz.rahmet.app:id/tvTitle", this.DefaultTimeout);
//        boolean flag1 = (title.getText()).equals("Начни покупать и повышай свой уровень в заведении");
//        Assert.assertTrue(flag1, "Элементы страницы 'История' отображаются некорректно");
    }

    private void FirstPlace() {
        AndroidElement text = newAndroidXpath("android.widget.TextView", "Lanzhou \u200BЖК Royal");
        text.click();
        System.out.println("Выбираем заведение");
        verticalSwipe();
        verticalSwipe();
    }

    private void Search() {
        AndroidElement home = newAndroidWebEl("kz.rahmet.app:id/ivIconHome", this.DefaultTimeout);
        home.click();

        AndroidElement search = newAndroidWebEl("kz.rahmet.app:id/flSearch", this.DefaultTimeout);
        search.click();

        AndroidElement search2 = newAndroidWebEl("kz.rahmet.app:id/etSearch", this.DefaultTimeout);
        if (search2.isDisplayed()){
        search2.click();
        search2.sendKeys("lanzhou");
        System.out.println("нажимаем на поиск");}
        else {

        }

        AndroidElement allSearch = newAndroidXpath("android.widget.TextView", "Поиск везде");
        allSearch.click();
        verticalSwipe();
        verticalSwipe();
    }

    private void OneTimePassword() {
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
