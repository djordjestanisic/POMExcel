package Base;

import Pages.HomePage;
import Pages.SidebarPage;
import Pages.WebTablesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import static org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes.Duration;

public class BaseTest {

    public WebDriver driver;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public WebTablesPage webTablesPage;
    public ExcelReader excelReader;


    @BeforeClass
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
        excelReader = new ExcelReader("C:\\Users\\HP\\Desktop\\TestData.xlsx");

        homePage = new HomePage(driver);
        sidebarPage = new SidebarPage(driver);
        webTablesPage = new WebTablesPage(driver);
    }
}
