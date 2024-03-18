package A기본문제;
import java.util.Scanner;

public class IntInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 갯수를 입력 하세요: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0 ; i< n; i++)
        {
          sum += sc.nextInt();
        }
        System.out.println("합계" + sum);


    }
}
