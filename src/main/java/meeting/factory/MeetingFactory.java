package meeting.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import meeting.model.Meeting;

public class MeetingFactory {

  public static List<Meeting> createMeetings() {
    String[] titles = {
      "demo day",
      "All hands",
      "fun friday",
      "stand up",
      "grooming ",
      "retrospective ",
      "sprint planning",
      "one on one",
      "technical thursday",
      "team updates",
      "org updates",
      "R and R  ",
      "team lunch",
    };

    String[] dates = {
      "2020-04-01",
      "2020-04-02",
      "2020-04-03",
      "2020-04-06",
      "2020-04-07",
      "2020-04-08",
      "2020-04-09",
      "2020-04-13",
      "2020-04-15",
      "2020-04-16",
      "2020-04-17",
      "2020-04-18",
      "2020-04-19",
    };

    List<Meeting> meetings = new ArrayList<>();
    Random r1 = new Random();
    

    for (String currentDate : dates  ) {
        
        Integer limit = r1.nextInt(titles.length);
        for(int i=0;i<limit;i++) {
            meetings.add(new Meeting(currentDate, titles[i]));
        }
    }

    return meetings;
  }
}
