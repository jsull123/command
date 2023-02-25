import java.util.concurrent.TimeUnit;

public class StopWatch{
    private static final int st = 100;

    private void display(int seconds){      
        String format = new String(new char[2 - String.valueOf(seconds/60).length()]).
        replace("\0", "0") + String.valueOf(seconds/60) + ":" +
        new String(new char[2 - String.valueOf(seconds%60).length()]).
        replace("\0", "0") + String.valueOf(seconds%60);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(format);
    }

    public void countDownOneMin(){
        int seconds = 60;

        do{
            seconds--;
            display(seconds);   
            try {
                TimeUnit.MILLISECONDS.sleep(st);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }while (seconds > 0);
    }

    public void countDownFiveMin(){
        int seconds = 300;

        do{
            seconds--;
            display(seconds);   
            try {
                TimeUnit.MILLISECONDS.sleep(st);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }while (seconds > 0);
    }

    public void countDownThirtySec(){
        int seconds = 30;

        do{
            seconds--;
            display(seconds);   
            try {
                TimeUnit.MILLISECONDS.sleep(st);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }while (seconds > 0);
    }
}