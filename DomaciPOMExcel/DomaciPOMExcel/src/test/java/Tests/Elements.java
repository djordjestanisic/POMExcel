package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Elements extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void userCanFillFormWithExcelFile() {
        String firstName = excelReader.getStringData("Sheet1", 1, 0);
        String lastName = excelReader.getStringData("Sheet1", 1, 1);
        String email = excelReader.getStringData("Sheet1", 1, 2);
        String age = String.valueOf(excelReader.getIntegerData("Sheet1", 1, 3));
        String salary = String.valueOf(excelReader.getIntegerData("Sheet1", 1, 4));
        String department = excelReader.getStringData("Sheet1", 1, 5);


        homePage.clickOnCard("Elements");
        sidebarPage.clickOnSidebarButton("Web Tables");
        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName(firstName);
        webTablesPage.inputLastName(lastName);
        webTablesPage.inputEmail(email);
        webTablesPage.inputAge(age);
        webTablesPage.inputSalary(salary);
        webTablesPage.inputDepartment(department);
        webTablesPage.clickOnSubmit();
    }
}
