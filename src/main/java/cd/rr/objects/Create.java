package cd.rr.objects;

public class Create {

    // Create 1
    // Create a class named Date. Choose what attributes and methods it should have.
class Date{
    String month="Sep";
    int day =19;
    String year= "2021";
    public void showDate(){
        System.out.println("Today is" + month + "/" + day + "/" + year);
    }

    }
    // Create 2
    // Create a class named Time. Choose what attributes and methods it should have.
class Time{
    int hour = 11;
    int minutes= 17;
    String timePeriod = "pm";
    void showTime(){
        System.out.println("Current time is " + hour + ":" + minutes + ":" + timePeriod);
    }
    }
    // Create 3
    // Create a class named Address. Choose what attributes and methods it should have.
public class Address{
    int house_num = 11;
    String street = "jackson";
    String city = "NY";
    String state = "NY";
    int zipCode = 12345;
    String country ="USA";
    public void showAddress(){
        System.out.println("Address is as following" + " " + house_num + " "+street + " "+city + " "+state +
                        " "+zipCode + " "+ country);
    }
    }
    // Create 4
    // Create a class named Meeting which has a date, time, and location.
public class Meeting{
    String date;
    String time;
    String location;
    Meeting(String time, String date, String location){
        this.date=date;
        this.time=time;
        this.location=location;

    }
    }
    // Create 5
    // Create an instance of Meeting and have it hold the following info:
    // 10:30 am | August 21, 2021 | 112 S. French Street Wilmington, DE 19709
Meeting myMeeting = new Meeting("10:30 am", "August 21, 2021", "112 S. French Street Wilmington, DE 19709");

}
