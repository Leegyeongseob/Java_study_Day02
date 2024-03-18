package Arrays클래스;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//배열을 다루기 위한 다양한 메소드 라이브러리
public class ArraysEx {
    public static void main(String[] args) {
/*        Integer[] arr = {5,3,4,7,8,9,2,1};
        Arrays.sort(arr); // 오름차순
//        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순
        for(int e : arr) {
            System.out.print(e + " ");

        }
        System.out.println();
        // 기준값을 임의로 정하고 대소 비교를 하면서 2분할 서치를 하기 때문에 정렬이 필수!
        System.out.println(Arrays.binarySearch(arr,5));*/

        //정렬 오버라이딩 : Comparator 인터페이스 : 정렬은 자바 내부에서 하고 정렬 조건만 준다.
        //과일 정렬하기(문자열을 길이순으로 길이가 같다면 사전순으로 정렬).
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        // 과일 목록
        Comparator<String> com = new Comparator<String>( ) //Ccmparator 인스턴스 생성
        {
            //Comparator Overriding 입맛대로 정렬기준 정하기!
            //두개의 매개변수를 받아 값을 비교.
            //return 0 : 두 객체가 같음을 의미, 양수이면 첫번째 객체가 큼,음수이면 작음.
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; //정렬해라
                else{
                    if(o1.length() ==o2.length()) return o1.compareTo(o2);
                    //두번째가 사전순서상 앞에있으면 양수
                }
                return -1;
            }
        };
        Arrays.sort(fruit,com);
        System.out.println(Arrays.toString(fruit));
        List<String> list = Arrays.asList(fruit);
    }

}
