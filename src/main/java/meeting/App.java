package meeting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import meeting.Controller.MeetingController;
import meeting.factory.MeetingFactory;
import meeting.model.Meeting;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");


    List<Meeting> meetings = MeetingFactory.createMeetings();

    MeetingController meet = new MeetingController(meetings);
    
    //meet.getDates();

    // meet.getSortedDates();
    Date  date = null;
    meet.storeDateWiseMeetings();
    try {
         date =  new SimpleDateFormat("yyyy-MM-dd").parse("2020-04-01");
  } catch (ParseException e) {
      
      e.printStackTrace();
  }
    meet.getMeetingsForDate(date);

  }
}
