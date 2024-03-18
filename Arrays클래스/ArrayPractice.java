package Arrays클래스;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 배열의 크기를 입력하세요 : ");
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        for(int i = 0;i<array.length;i++)
        {
            array[i] = (int)((Math.random()*array_size)+1);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("찾으시는 숫자를 입력하세요."+"(0 ~ "+array_size +")"+" : ");
        if(Arrays.binarySearch(array,sc.nextInt()) < 0) // 존재하지 않으면 음수가 온다
        {
            System.out.println("찾으시는 숫자가 없습니다.(-1)");
        }
        else System.out.println("찾으시는 숫자가 존재합니다.");


    }
}
