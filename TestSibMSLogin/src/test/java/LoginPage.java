import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




        public class LoginPage extends PageObject{

            private final String Username = "Username";
            private final String Password = "Password";



            @FindBy(id = "mat-input-3")
            private WebElement username;

            @FindBy(id = "mat-input-4")
            private WebElement password;

            @FindBy(xpath = "//a[contains(text(),'Submit')]")
            private WebElement loginbutton;

            public LoginPage(WebDriver driver) {
                super(driver);
            }

            public void enterUsername(){
                this.username.sendKeys(Username);
            }

            public void enterPassword(){
                this.password.sendKeys(Password);
            }

            public void pressLoginButton(){
                this.loginbutton.click();
            }
        }



