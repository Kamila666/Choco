package DemoTest;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends BeforeAfterTest {
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

        AndroidElement message = newAndroidWebEl("kz.rahmet.app:id/ivIconMessenger", this.DefaultTimeout);
        message.click();
        System.out.println("Заходим в сообщения");

        AndroidElement cash = newAndroidXpath("android.widget.TextView", "#Рахмет Кэшбэк");
        cash.click();

        AndroidElement title = newAndroidXpath("android.widget.TextView", "Burger Station \n" +
                "Кэшбэк: 5% (+58) \n" +
                "Баланс: 558");
        boolean flag1 = (title.getText()).equals("Burger Station \n" +
                "Кэшбэк: 5% (+58) \n" +
                "Баланс: 558");
        Assert.assertTrue(flag1, "Элементы страницы 'История' отображаются некорректно");

        AndroidElement rate = newAndroidWebEl("kz.rahmet.app:id/mBtnEditRate", this.DefaultTimeout);
        rate.click();
        System.out.println("Редактируем отзыв");

        AndroidElement rating = newAndroidWebEl("kz.rahmet.app:id/ratingBar", this.DefaultTimeout);
        rating.click();
        rating.click();

        AndroidElement comm = newAndroidWebEl("kz.rahmet.app:id/etComment", this.DefaultTimeout);
        comm.click();
        comm.sendKeys("Good");
        System.out.println("Оставляем комментарий");

        AndroidElement send = newAndroidWebEl("kz.rahmet.app:id/mBtnSend", this.DefaultTimeout);
        send.click();

        AndroidElement feedback = newAndroidXpath("android.widget.TextView", "Good");
        boolean flag = (feedback.getText()).equals("Good");
        Assert.assertTrue(flag, "Элементы страницы 'История' отображаются некорректно");

    }
}