package meeting.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Meeting {
    private Date date;
    private String agenda;

    public Meeting(String date, String agenda) {

        try {
            this.date =  new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
    
    this.agenda = agenda;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getAgenda() {
    return agenda;
  }

  public void setAgenda(String agenda) {
    this.agenda = agenda;
  }

  @Override
  public String toString() {
      return "Meeting [agenda=" + agenda + ", date=" + date + "]";
  }

 
}
