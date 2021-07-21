# LibraryBooker


## Library Space Booking Project

## Language used: Java

## Libraries used:
- Selenium
- Twilio



## :rocket:How it works:rocket::
- Begins by detecting OS, as selenium web driver works differently on Mac and Windows, and if else statement is added after the os has been detected using 'System.getPropery();'
- Loads up university library page
- Selects the seats that I want and the location and other extras such as (PC desk or study Space).
- Then goes through a table by scraping the information on it, and looping through each row until it finds one that is available. (add picture of uni table)
- The for loop knows when to stop by using another method that gets the number of rows, this is done by using a counter variable within a while loop that increments until there is an error using a try/catch block, once that error occurs the maximum number of rows has been reached and the method returns the counter.
- Once a seat has been picked, the web driver goes through all the pages that confirm and logs into my university portal with my details.
- On the last page, it then scrapes the relevant details of the booking and is then put into String variables which is used to be sent as an SMS using Twilio.



## Screenshot of Text message

<img src="https://github.com/moe399/LibrarySpaceBooker/blob/master/screenshotTwillio.jpg" width="e00" height="300">



