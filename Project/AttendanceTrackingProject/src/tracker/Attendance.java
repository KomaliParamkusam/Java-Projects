package tracker;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance 
{
   private LocalDate date;
   private LocalTime checkIn;
   private LocalTime checkOut;
   public Attendance(LocalDate date) 
   {
        this.date = date;
   }
   public LocalDate getDate() 
   {
    return date;
   }
   public void setDate(LocalDate date) 
   {
    this.date = date;
   }
   public LocalTime getCheckIn() 
   {
    return checkIn;
   }
   public void setCheckIn(LocalTime checkIn) 
   {
    this.checkIn = checkIn;
   }
   public LocalTime getCheckOut() 
   {
    return checkOut;
   }
   public void setCheckOut(LocalTime checkOut) 
   {
     this.checkOut = checkOut;
   }
   public Duration getworkDuration(LocalTime checkin,LocalTime checkout)
   {
        if(checkin!=null && checkout!=null)
        {
            return Duration.between(checkin, checkout);
        }
        return Duration.ZERO;
   }


    
}
