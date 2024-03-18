package 단어공부;
import java.util.Scanner;

public class Alpabetnumber {
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        int max = 0; // 가장 많이 등장하는 단어의 수를 저장하는 변수
        char result  = 0;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i  = 0 ; i< word.length();i++)
        {
            if(word.charAt(i) >= 'a')  // 소문자인 경우
                alphabet[word.charAt(i) - 'a']++; //해당 알파벳의 카운트 증가
            else // 대문자인 경우
                alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0 ; i < alphabet.length;i++)
        {
            if(alphabet[i] == max) result = '?';
            else if(alphabet[i] > max){
                max = alphabet[i];
                result = (char) ( 'A'+ i);

            }
        }
        System.out.println(result);
    }
}
