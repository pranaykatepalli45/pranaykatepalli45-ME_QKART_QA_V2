package QKART_SANITY_LOGIN.Module1;

<<<<<<< ours
import java.sql.Driver;
import java.util.List;
import java.util.ArrayList;
=======
import java.util.List;

>>>>>>> theirs
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult {
    WebElement parentElement;

    public SearchResult(WebElement SearchResultElement) {
        this.parentElement = SearchResultElement;
    }

    /*
<<<<<<< ours
     * Return title of the parentElement denoting the card content section of a search result
     */
    public String getTitleofResult() {
        String titleOfSearchResult = "";
        // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 03: MILESTONE 1
        // Find the element containing the title (product name) of the search result and
        // assign the extract title text to titleOfSearchResult
        WebElement ele = parentElement.findElement(By.xpath("p[1]"));
        titleOfSearchResult = ele.getText();
        // System.out.println(titleOfSearchResult);

=======
     * Return title of the parentElement denoting the card content section of a
     * search result
     */
    public String getTitleofResult() {
        String titleOfSearchResult = "";
>>>>>>> theirs
        return titleOfSearchResult;
    }

    /*
     * Return Boolean denoting if the open size chart operation was successful
     */
    public Boolean openSizechart() {
        try {

<<<<<<< ours
            // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 04: MILESTONE 2
            // Find the link of size chart in the parentElement and click on it
            WebElement sizeChart = parentElement.findElement(By.xpath("//button[text()='Size chart']"));
            sizeChart.click();
            Thread.sleep(3000);
            return true;

=======
            return true;
>>>>>>> theirs
        } catch (Exception e) {
            System.out.println("Exception while opening Size chart: " + e.getMessage());
            return false;
        }
    }

    /*
     * Return Boolean denoting if the close size chart operation was successful
     */
    public Boolean closeSizeChart(WebDriver driver) {
        try {
            Thread.sleep(2000);
            Actions action = new Actions(driver);

            // Clicking on "ESC" key closes the size chart modal
            action.sendKeys(Keys.ESCAPE);
            action.perform();
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            System.out.println("Exception while closing the size chart: " + e.getMessage());
            return false;
        }
    }

    /*
     * Return Boolean based on if the size chart exists
     */
    public Boolean verifySizeChartExists() {
        Boolean status = false;
        try {
<<<<<<< ours
            // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 04: MILESTONE 2
            /*
             * Check if the size chart element exists. If it exists, check if the text of the
             * element is "SIZE CHART". If the text "SIZE CHART" matches for the element, set status
             * = true , else set to false
             */
            WebElement sizeChartlink = parentElement.findElement(By.xpath("button"));
            if (sizeChartlink.getText().equalsIgnoreCase("SIZE CHART")) {
                status = true;
            }
=======
            /*
             * Check if the size chart element exists. If it exists, check if the text of
             * the element is "SIZE CHART". If the text "SIZE CHART" matches for the
             * element, set status = true , else set to false
             */
>>>>>>> theirs
            return status;
        } catch (Exception e) {
            return status;
        }
    }

    /*
<<<<<<< ours
     * Return Boolean if the table headers and body of the size chart matches the expected values
     */
    public Boolean validateSizeChartContents(List<String> expectedTableHeaders,
            List<List<String>> expectedTableBody, WebDriver driver) {
        Boolean status = true;
        try {
            // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 04: MILESTONE 2
            /*
             * Locate the table element when the size chart modal is open
             * 
             * Validate that the contents of expectedTableHeaders is present as the table header in
             * the same order
             * 
             * Validate that the contents of expectedTableBody are present in the table body in the
             * same order
             */

            WebElement tablElement =
                    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/table"));
            List<WebElement> tableHeader = tablElement.findElements(By.xpath("thead/tr/th"));

            List<String> actualHeader = new ArrayList<>();

            for (WebElement element : tableHeader) {
                actualHeader.add(element.getText());
            }

            if (!actualHeader.equals(expectedTableHeaders)) {
                status = false;
            }

            for (int i = 0; i < expectedTableBody.size(); i++) {
                List<String> tableBodyRow = expectedTableBody.get(i);

                for (int j = 0; j < tableBodyRow.size(); j++) {
                    String expectedBody = tableBodyRow.get(j);
                    int row = i + 1;
                    int col = j + 1;

                    WebElement actualBodyElement = driver
                            .findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
                    String actualBody = actualBodyElement.getText();
                    if (!actualBody.equals(expectedBody)) {
                        status = false;
                    }
                }
            }

=======
     * Return Boolean if the table headers and body of the size chart matches the
     * expected values
     */
    public Boolean validateSizeChartContents(List<String> expectedTableHeaders, List<List<String>> expectedTableBody,
            WebDriver driver) {
        Boolean status = true;
        try {
            /*
             * Locate the table element when the size chart modal is open
             * 
             * Validate that the contents of expectedTableHeaders is present as the table
             * header in the same order
             * 
             * Validate that the contents of expectedTableBody are present in the table body
             * in the same order
             */
>>>>>>> theirs
            return status;

        } catch (Exception e) {
            System.out.println("Error while validating chart contents");
            return false;
        }
    }

    /*
     * Return Boolean based on if the Size drop down exists
     */
    public Boolean verifyExistenceofSizeDropdown(WebDriver driver) {
        Boolean status = false;
        try {
<<<<<<< ours
            // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 04: MILESTONE 2
            // If the size dropdown exists and is displayed return true, else return false
            WebElement sizeDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div"));
            status = sizeDropdown.isDisplayed();
            return status;

=======
            return status;
>>>>>>> theirs
        } catch (Exception e) {
            return status;
        }
    }
<<<<<<< ours
}
=======
}
>>>>>>> theirs
