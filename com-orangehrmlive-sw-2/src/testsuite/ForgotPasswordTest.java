package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        String actualText=driver.findElement(By.xpath("//button[@type='submit']")).getText();
        System.out.println(actualText);
        String expectedText="Reset Password";
        Assert.assertEquals("Reset password link not displayed",actualText,expectedText);
    }
}