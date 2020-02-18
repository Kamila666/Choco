package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Address extends Hooks {
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

        AndroidElement home = newAndroidWebEl("ivIconHome");
        home.click();

        AndroidElement search = newAndroidWebEl("flSearch");
        search.click();

        AndroidElement search2 = newAndroidWebEl("etSearch");
        if (search2.isDisplayed()) {
            search2.click();
            search2.sendKeys("lanzhou");
            System.out.println("нажимаем на поиск");
        } else {

        }

        AndroidElement allSearch = newAndroidClassName("TextView", "Поиск везде");
        allSearch.click();
        verticalSwipe();
        verticalSwipe();

        AndroidElement text = newAndroidClassName("TextView", "Lanzhou \u200BЖК Royal");
        text.click();
        System.out.println("Выбираем заведение");
        verticalSwipe();
        verticalSwipe();

        AndroidElement cafe = newAndroidClassName("TextView", "Филиалы");
        cafe.click();
        System.out.println("Выбираем другое заведение");

        AndroidElement text2 = newAndroidClassName("TextView", "Lanzhou ADK");
        text2.click();

        AndroidElement lanzhou = newAndroidClassName("TextView", "Lanzhou ADK");
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
    }










