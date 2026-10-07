import java.util.*;
public class conversion_of_seconds_into_hours_min_and_sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = sc.nextLong();

        int hours = (int) (totalSeconds / 3600);
        int minutes = (int) ((totalSeconds % 3600) / 60);
        int seconds = (int) (totalSeconds % 60);

        System.out.println("Time: " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");

        sc.close();
    }
    
}



