import java.util.Scanner;

public class Execution {


    Thread thread1 = new Thread() {

        public void run() {

            Scanner scanner = new Scanner(System.in);


            String osName = System.getProperty("os.name").toLowerCase();


            if (osName.contains("windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

            }


            //object creation


            Navigation navthru = new Navigation();


//        DateAndTimeCreator theDay = new DateAndTimeCreator();
//
//
//
//
//
//
//
//
//
//
//        System.out.println(theDay);
//
//


            try {


                navthru.goToWebsite("https://library-calendars.ucl.ac.uk/r/new");


                navthru.findOptionsandSelectonPage1();
//
//
////select how many days to skip
                navthru.goToDesiredDate(3);


//// select booking slot

                navthru.getAmountOfRows();
                navthru.selectBookingSlottime1();


                navthru.clickSubmit();


                navthru.typeInLogin();


                navthru.clickLoginButton();


                navthru.clickTermsContinue();


                navthru.finalSubmitBooking();


                navthru.scrapeMessage();

                navthru.sendSMS();

                navthru.testifworks();

                navthru.quit();

            } catch (Exception e) {

                System.out.println("Error with booking, most likely no spots available at time/date selected");


//                navthru.sendSMS();

                navthru.quit();
                navthru.sendSMS();


            }


        }
    };


    Thread thread2 = new Thread() {

        public void run() {

            Scanner scanner = new Scanner(System.in);


            String osName = System.getProperty("os.name").toLowerCase();


            if (osName.contains("windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

            }


            //object creation


            Navigation2 nav2 = new Navigation2();


//        DateAndTimeCreator theDay = new DateAndTimeCreator();
//
//
//        System.out.println(theDay);
//
//


            try {


//
//
                nav2.goToWebsite("https://library-calendars.ucl.ac.uk/r/new/");


                nav2.findOptionsandSelectonPage1();
////
////
//////select how many days to skip
                nav2.goToDesiredDate(3);


//// select booking slot

                nav2.getAmountOfRows();
                nav2.selectBookingSlottime1();


                nav2.clickSubmit();


                nav2.typeInLogin();


                nav2.clickLoginButton();


                nav2.clickTermsContinue();


                nav2.finalSubmitBooking();


                nav2.scrapeMessage();

                nav2.sendSMS();

                nav2.quit();

            } catch (Exception e) {
                System.out.println("Error with book");

                nav2.sendSMS();


                nav2.quit();
            }


        }
    };


}
