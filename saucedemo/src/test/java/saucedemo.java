import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

public class saucedemo {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        try {
            System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mans\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("✅ تم تشغيل المتصفح بنجاح.");
        } catch (Exception e) {
            System.out.println("❌ فشل تشغيل المتصفح: " + e.getMessage());
        }
    }

    @Test(priority = 1)
    public void openSauceDemo() {
        try {
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            Assert.assertEquals(driver.getTitle(), "Swag Labs", "❌ العنوان غير متطابق!");
            System.out.println("✅ تم فتح الموقع والتحقق من العنوان.");
        } catch (Exception e) {
            System.out.println("❌ فشل فتح الموقع: " + e.getMessage());
        }
    }

    @Test(priority = 2)
    public void logIn() {
        try {
            WebElement usernameField = driver.findElement(By.name("user-name"));
            usernameField.sendKeys("standard_user");
            Thread.sleep(2000);
            System.out.println("✅ تم إدخال اسم المستخدم.");
        } catch (Exception e) {
            System.out.println("❌ فشل في إدخال اسم المستخدم: " + e.getMessage());
        }

        try {
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("secret_sauce");
            Thread.sleep(2000);
            System.out.println("✅ تم إدخال كلمة المرور.");
        } catch (Exception e) {
            System.out.println("❌ فشل في إدخال كلمة المرور: " + e.getMessage());
        }

        try {
            WebElement loginButton = driver.findElement(By.name("login-button"));
            loginButton.click();
            Thread.sleep(2000);
            System.out.println("✅ تم الضغط على زر تسجيل الدخول.");
        } catch (Exception e) {
            System.out.println("❌ فشل الضغط على زر تسجيل الدخول: " + e.getMessage());
        }
    }

    @Test(priority = 3)
    public void addtocart() {
        try {
            WebElement addButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            addButton.click();
            Thread.sleep(2000);
            System.out.println("✅ تم  اضافه المنتج الي السله .");
        } catch (Exception e) {
            System.out.println("❌ فشل في اضافه المنتج الي السله: " + e.getMessage());
        }

    }


    @Test(priority = 4)
    public void CartMenue() {
        try {

            WebElement cartBadge = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
            String cartCount = cartBadge.getText();
            Assert.assertEquals(cartCount, "1", "❌ العدد في السلة غير صحيح!");
            System.out.println("✅ تم التحقق بنجاح من أن المنتج تم اضافته الي السلة : ");

            WebElement CartLink = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
            CartLink.click();
            Thread.sleep(2000);


        } catch (Exception e) {
            System.out.println("❌ فشل اختبار إضافة عنصر إلى السلة: " + e.getMessage());
        }
    }


    @Test(priority = 5)
    public void checkout() {
        try {
            WebElement CheckItem = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]"));
            String ItemsInCart = CheckItem.getText();


            if (ItemsInCart.equals("1")) {
                System.out.println("✅ تم التحقق بنجاح من أن العدد في السلة هو: " + ItemsInCart);
                driver.findElement(By.id("checkout")).click();

                try {
                    WebElement FirstName = driver.findElement(By.id("first-name"));
                    FirstName.sendKeys("mansour");
                    Thread.sleep(2000);

                    WebElement LastName = driver.findElement(By.id("last-name"));
                    LastName.sendKeys("atia");
                    Thread.sleep(2000);

                    WebElement PostalCode = driver.findElement(By.id("postal-code"));
                    PostalCode.sendKeys("11788");
                    Thread.sleep(2000);

                    WebElement Continue = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
                    Continue.click();
                    Thread.sleep(2000);

                    WebElement Finish = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
                    Finish.click();
                    Thread.sleep(2000);

                    WebElement BackHome = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
                    BackHome.click();
                    Thread.sleep(2000);

                    System.out.println("✅ تم إدخال معلومات التوصيل والطلب بنجاح .");
                } catch (Exception e) {
                    System.out.println("❌ فشل في إدخال معلومات التوصيل : " + e.getMessage());
                }


            } else {
                System.out.println("❌ العدد في السلة غير صحيح! العدد الحالي: " + ItemsInCart);
            }
        } catch (NoSuchElementException e) {
            System.out.println("❌ لم يتم العثور على العنصر في السلة: " + e.getMessage());
        }
    }

    @Test(priority = 6)
    public void openSideMenu() {
        try {
            WebElement sideButton = driver.findElement(By.id("react-burger-menu-btn"));
            sideButton.click();
            Thread.sleep(2000);
            System.out.println("✅ تم فتح القائمة الجانبية.");
        } catch (Exception e) {
            System.out.println("❌ فشل في فتح القائمة الجانبية: " + e.getMessage());
        }
    }

    @Test(priority = 7)
    public void logOut() {
        try {
            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            logoutButton.click();
            Thread.sleep(2000);
            System.out.println("✅ تم تسجيل الخروج بنجاح.");
        } catch (Exception e) {
            System.out.println("❌ فشل في تسجيل الخروج: " + e.getMessage());
        }
    }

    @AfterTest
    public void teardown () {
        try {
            driver.quit();
            System.out.println("✅ تم إغلاق المتصفح بنجاح.");
            } catch (Exception e) {
            System.out.println("❌ فشل في إغلاق المتصفح: " + e.getMessage());
            }
        }
    }
