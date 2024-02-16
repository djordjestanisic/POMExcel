package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class WebTablesPage {

    WebDriver driver;

    WebElement addButton, firstName, lastName, age, email, salary, department, submitButton;


    public WebTablesPage(WebDriver driver) {
        this.driver = driver;


    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));


    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));

    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void clickOnAddButton() {
        getAddButton().click();
    }

    public void inputFirstName(String firstName) {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
        }

    public void inputAge(String age) {
        getAge().clear();
        getAge().sendKeys(age);
        }

    public void inputSalary(String salary) {
        getSalary().clear();
        getSalary().sendKeys(salary);
        }

    public void inputDepartment(String department) {
        getDepartment().clear();
        getDepartment().sendKeys(department);
        }

    public void clickOnSubmit() {
        getSubmitButton().click();
    }
}


