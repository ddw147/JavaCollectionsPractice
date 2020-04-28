package meeting.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import meeting.model.Meeting;

public class MeetingController {


   private List<Meeting> meetings ;
   private Map<Date, List<Meeting>> dateWiseMeetings;

    public void getSortedDates(){

        Set<Date> dates = new TreeSet<>((date1,date2)-> date1.compareTo(date2) );
         
        for (Meeting meeting : this.meetings) {

            dates.add(meeting.getDate());
        }

        for (Date date : dates) {
              System.out.println(date);  
        }
    }

    public void getDates(){
        Set<Date> dates = new HashSet<>();
         
        for (Meeting meeting : this.meetings) {

            dates.add(meeting.getDate());
        }

        for (Date date : dates) {
              System.out.println(date);  
        }
    }


    public void storeDateWiseMeetings(){

        Map<Date,List<Meeting>> meetingMap = new HashMap<>();
        
        for (Meeting meeting : this.meetings) {

            if(!meetingMap.containsKey(meeting.getDate())) {
                meetingMap.put(meeting.getDate(), new ArrayList<Meeting>());

                
            }
             meetingMap.get(meeting.getDate()).add(meeting);

        }

        this.dateWiseMeetings  = meetingMap;

    }

    /**
     * @return the meetings
     */
    public void getMeetingsForDate(Date date) {

        List<Meeting>  meetingsForDate  =  this.dateWiseMeetings.getOrDefault(date,new ArrayList<Meeting>());
        
        meetingsForDate.forEach((meeting)-> {
            System.out.println(meeting);
        });
        
    }

    public MeetingController(List<Meeting> meetings) {
        this.meetings = meetings;
    }

}   