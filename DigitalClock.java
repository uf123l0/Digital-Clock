import java.util.Date;
import java.text.SimpleDateFormat;
public class DigitalClock {

    public static void main(String[] args) {
        DigitalClock clock=new DigitalClock();
clock.displayClock();
    }
        public String getCurrentTime(){
            SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
            return sdf.format(new Date());
        }
            public void displayClock(){
                while (true) {
                    System.out.println(getCurrentTime());
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    

                    }

                    
                    
                }
            }

            

