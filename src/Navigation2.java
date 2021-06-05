import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Navigation2 {


    private final String ACCOUNT_SID = "AC0eb791d41c820afbb86dff885522c36d";
    private final String AUTH_TOKEN = "23245f0eb657b9d56675cef06e101711";
    private final String bookedDate = "";
    private final String floorLevel = "";
    WebDriver uniweb = new ChromeDriver();
    Actions tomoveit = new Actions(uniweb);
    private String seatNumber = "";


    public Navigation2() {
        this.seatNumber = "";
    }

    public void goToWebsite(String website) {

        uniweb.manage().window().maximize();

        uniweb.get(website);
    }


    public void findOptionsandSelectonPage1() {


        //select location
        Select dropdownslc = new Select(uniweb.findElement(By.id("s-lc-location")));
        dropdownslc.selectByVisibleText("Student Centre");


        Select zone = new Select(uniweb.findElement(By.id("s-lc-zone")));
        zone.selectByVisibleText("Third Floor");

        //select category
        Select pickpcLocation = new Select(uniweb.findElement(By.id("s-lc-group")));
        pickpcLocation.selectByVisibleText("PC Desk");


        //zone


        //click show availbility button
        uniweb.findElement(By.id("s-lc-go")).click();


    }


    public int getAmountOfRows() {

        //loops through the amount of rows, if it is impossible to go to next row loop breaks

        int counterToChangeXpath = 0;

        int rowsCounter = 0;

        while (true) {

            try {

                counterToChangeXpath++;

                uniweb.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[" + counterToChangeXpath + "]/td/div/div/a[1]"));

                rowsCounter++;


            } catch (Exception e) {

                break;


            }


        }


        return rowsCounter;


    }


    public void clickSubmit() {

        try {
            TimeUnit.SECONDS.sleep(2);
            uniweb.findElement(By.xpath("//*[@id=\"submit_times\"]")).click();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


//        public void selectBookingSlottime1() {
//
//
//            int amountOfAvailableSlots = 0;
//
//
////
//
//
//            for (int i = 1; i <= getAmountOfRows(); i++) {
//
//
//                // loops through the seat number to check if it exists
//                String sn = uniweb.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr["+i+"]/td/div/div/a[8]")).getAttribute("title");
//
//
//                System.out.println(sn);
//
//                if (sn.contains("360") && sn.contains("Available")){
//
//                    uniweb.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr["+i+"]/td/div/div/a[8]")).click();
//
//
//                }
//
//                else {
//                    backup();
//                    break;
//                }
//
//            }}


    //body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[" + i + "]/td/div/div/a[1]

//                if (sn.contains(seatNumber)) {
//                    System.out.println("Your seat " + seatNumber + " was found, checking if seat is available at the time");
//
//
//                    if (uniweb.findElement(By.xpath("//body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[\" + i + \"]/td/div/div/a[1]")).getAttribute("title").contains("Available")) {
//
//                        System.out.println("Seat number " + seatNumber + " is available, selecting");
//                        uniweb.findElement(By.xpath("//body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[\" + i + \"]/td/div/div/a[1]")).click();
//                        break;
//                    } else {
//                        System.out.println("Seat number unavailable selecting another one");
//                        break;
//
//                    }


    public void selectBookingSlottime1() {


        for (int i = 1; i <= getAmountOfRows(); i++) {


            // loops through the seat number to check if it exists


            if (uniweb.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[1]/div[1]/div[1]/a[8]")).getAttribute("title").contains("Available")) {


                uniweb.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[1]/div[1]/div[1]/a[8]")).click();

                break;

//                        }
//                    }
////
//
            }


        }
    }


    public void backup() {


        for (int i = 1; i <= getAmountOfRows(); i++) {


            // loops through the seat number to check if it exists


            if (uniweb.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[" + i + "]/td/div/div/a[8]")).getAttribute("title").contains("Available")) {


                uniweb.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[1]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[" + i + "]/td/div/div/a[8]")).click();

                break;

//                        }
//                    }
////
//
            }


        }
    }


    public void selectBookingSlottime2() {


    }


    public void submitTimes() {
        uniweb.findElement(By.id("submit_times")).click();
    }


    public void goToDesiredDate(int val) {

        //move the dates by desired amount (usually 3) as that is the university limit and the lecture is on that day


        for (int i = 0; i < val; i++) {

            uniweb.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[1]/div[1]/div/button[2]")).click();

            try {

                TimeUnit.SECONDS.sleep(3);


            } catch (Exception e) {
                System.out.println("Error in changing date: Exception is added below" + e);

            }


        }

        String dayname = uniweb.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[1]/div[1]/h2")).getText();
        System.out.println(dayname);


    }


    public void typeInLogin() {

        try {

            TimeUnit.SECONDS.sleep(1);


            // username
            uniweb.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");


//                TimeUnit.SECONDS.sleep(3);

            //password

            uniweb.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");

            // both username and password were removed for privacy


        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public void clickLoginButton() {

        try {
            TimeUnit.SECONDS.sleep(3);
            uniweb.findElement(By.xpath("/html/body/div/div/div/div[1]/article/form/div/button")).click();

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public void submitBooking() {
        uniweb.findElement(By.xpath("//*[@id=\"s-lc-eq-bform-submit\"]")).click();
    }


    public void clickTermsContinue() {

        try {

            TimeUnit.SECONDS.sleep(1);
            uniweb.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[2]/div[2]/button")).click();

        } catch (Exception e) {
            System.out.println(e);
        }


    }


    public void finalSubmitBooking() {
        uniweb.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[3]/form/fieldset/div[4]/div/button")).click();
    }


    public void testifworks() {
        String test = uniweb.findElement(By.xpath("//*[@id=\"s-lc-eq-bform\"]/div[1]/p[2]")).getText();
        System.out.println(test);

        String floororseat = uniweb.findElement(By.xpath("//*[@id=\"s-lc-eq-bform\"]/div[1]/p[2]/strong")).getText();
        System.out.println(floororseat);


    }


    public String scrapeMessage() {


        try {

            TimeUnit.SECONDS.sleep(2);


            String[] seatfloorlevelong = uniweb.findElement(By.xpath("//*[@id=\"s-lc-eq-bform\"]/div[1]/p[2]/strong")).getText().split("-");


//        System.out.println(Arrays.toString(seatfloorlevelong));

            String seatNumber = seatfloorlevelong[0];
            String levelNumber = seatfloorlevelong[1].replace("(", "");
            String levelNumberNew = levelNumber.replace(")", "");

//        String levelnumberNew = se

//        System.out.println(seatNumber);
//        System.out.println(levelNumber);


            String[] seperateFloorsAndDate = uniweb.findElement(By.xpath("//*[@id=\"s-lc-eq-bform\"]/div[1]/p[2]")).getText().split("el:");

//        System.out.println(seperateFloorsAndDate[1]);


            String[] splitTheTimeAndDate = seperateFloorsAndDate[0].split(",");


            String[] thenewTimeandDate = seperateFloorsAndDate[0].split(":", 2);


//        System.out.println(thenewTimeandDate[1]); // dont change above this


            String[] splittedTimeAndDate22 = thenewTimeandDate[1].split(",", 2);


            String time = splittedTimeAndDate22[0];


            String moe = "U+1F680";


            String messageToSend = "Library Session has been booked Below are the following details: " + System.lineSeparator() + System.lineSeparator() + "Building Name: Student Centre" + System.lineSeparator() + "Floor Level:" + levelNumberNew + System.lineSeparator() + "Seat Number: " + seatNumber + System.lineSeparator() + "Date: " + splitTheTimeAndDate[1] + ", " + splitTheTimeAndDate[2] + ", " + splitTheTimeAndDate[3] + System.lineSeparator() + "Time: " + time;

//        System.out.println(messageToSend);


//        System.out.println(Arrays.toString(seperateFloorsAndDate));

            System.out.println(messageToSend);


            return messageToSend;

        } catch (Exception e) {
            System.out.println("Error booking, this has also been sent through SMS");
            return "Error booking or something went wrong scraping booking details, check university email and book manually ASAP";
        }


    }


    public void sendSMS() {


        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);


        Message message = Message.creator(new PhoneNumber(""), new PhoneNumber("+18708608697"), scrapeMessage()).create();


        //phone number was removed for privacy

    }


    public void quit() {

        try {
            System.out.println("Script ended, result pushed to sms");
            TimeUnit.SECONDS.sleep(3);
            uniweb.quit();
        } catch (Exception e) {
            System.out.println("Unable to close");
        }


    }
}











