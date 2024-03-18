package A기본문제;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개를 입력하시겠습니까? ");
        int n = sc.nextInt();
        int sum = 0;
        int grade = 0;
        for(int i = 0; i< n ;i++)
        {
            System.out.print("성적"+(i + 1) + ": ");
            grade = sc.nextInt();
            sum +=grade;
        }
        double average  = (double) sum / n;

        System.out.println("입력한 성적들의 평균 : " + average);
    }
}
