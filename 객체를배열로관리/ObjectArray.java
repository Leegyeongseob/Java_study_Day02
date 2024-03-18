package 객체를배열로관리;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print(("입력 인원 : "));
        int cnt = sc.nextInt();
        NameCard[] static_NameCards = new NameCard[cnt];
        //정적 클래스타입 배열선언

        //arrayList 의 상위 형태 List로 객체 생성.
        List<NameCard> array_NameCards = new ArrayList<>();
        System.out.println("정보 입력");
        System.out.println("------------------------------------");
        for(int i = 0 ; i < cnt ; i ++)
        {
            NameCard NC = new NameCard();
            System.out.print("이름 입력 : ");
            NC.setName(sc.next());
            System.out.print("나이 : ");
            NC.setAge(sc.nextInt());
            System.out.print("이메일 : ");
            NC.setMail(sc.next());
            System.out.print("연락처 : ");
            NC.setPhoneNumber(sc.next());
            array_NameCards.add(NC);
        }
        System.out.println("=========================================");
        for(NameCard element : array_NameCards)
        {
            element.printInfo();
            System.out.println("*************************************");
        }
    }
}
