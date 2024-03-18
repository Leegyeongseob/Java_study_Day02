package A기본문제;
import java.util.Scanner;

public class TimeInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간입력 :");
        String time = sc.next();
        String[] splitTime = time.split(":");
        int IntHour = Integer.parseInt(splitTime[0]);
        int IntMin = Integer.parseInt(splitTime[1]);
        int IntSec = Integer.parseInt(splitTime[2]);

        if(IntHour > 11)
        {
            IntHour -=12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n",IntHour,IntMin,IntSec);

        }
        System.out.printf("오후 %02d시 %02d분 %02d초\n",IntHour,IntMin,IntSec);
    }
}
