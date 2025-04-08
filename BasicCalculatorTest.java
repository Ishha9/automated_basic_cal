package basic_cal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCalculatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        // ---------------------- Test 1: Add 2 + 3 = 5 ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys("2");
        driver.findElement(By.id("number2Field")).sendKeys("3");
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Add");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result1 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Addition Result: " + result1);

        // ---------------------- Test 2: Subtract 5 - 2 = 3 ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys("5");
        driver.findElement(By.id("number2Field")).sendKeys("2");
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Subtract");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result2 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Subtraction Result: " + result2);

        // ---------------------- Test 3: Multiply 4 * 6 = 24 ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys("4");
        driver.findElement(By.id("number2Field")).sendKeys("6");
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Multiply");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result3 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Multiplication Result: " + result3);

        // ---------------------- Test 4: Divide 10 / 2 = 5 ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys("10");
        driver.findElement(By.id("number2Field")).sendKeys("2");
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Divide");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result4 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Division Result: " + result4);

        // ---------------------- Test 5: Invalid Input ("abc") ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys("abc");
        driver.findElement(By.id("number2Field")).sendKeys("3");
        driver.findElement(By.id("number2Field")).sendKeys(Keys.TAB); // trigger field validation
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Add");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result5 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Invalid Input Result: " + result5);

        // ---------------------- Test 6: Empty Fields ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys(Keys.TAB); // to force re-evaluation
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Add");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result6 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Empty Fields Result: " + result6);

        // ---------------------- Test 7: Negative & Decimal -5.5 + 2.5 = -3 ----------------------
        driver.findElement(By.id("number1Field")).clear();
        driver.findElement(By.id("number2Field")).clear();
        driver.findElement(By.id("number1Field")).sendKeys("-5.5");
        driver.findElement(By.id("number2Field")).sendKeys("2.5");
        driver.findElement(By.id("selectOperationDropdown")).sendKeys("Add");
        Thread.sleep(1000);
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(1500);
        String result7 = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        System.out.println("Negative & Decimal Result: " + result7);

        driver.quit();
    }
}
