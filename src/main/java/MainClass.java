import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class MainClass {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anna\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        Thread.sleep(2000);

        WebElement block = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", block);
        block.click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        element.click();

        // заполняется поле userName
        driver.findElement(By.xpath("//*[@id=\"userName\"]"))
                .sendKeys("Петр Петров");

        // заполняется поле Email
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]"))
                .sendKeys("petr@mail.ru");

        // заполняется поле currentAddress
        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"))
                .sendKeys("Текущий адрес");

        // запоняется поле permanentAddress
        driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"))
                .sendKeys("Постоянный адрес");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", submit);
        executor.executeScript("arguments[0].click();", submit);


        }
    }