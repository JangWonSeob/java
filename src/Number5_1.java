import java.util.*;

public class Number5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("학생 이름 >>");
//        String x = sc.next();

        Map<String ,Student> students = new HashMap<>();

        students.put("황기태" ,new Student("황기태", "모바일", 1, 4.1));
        students.put("이재문",new Student("이재문", "안드로이드", 2, 3.9));
        students.put("김남윤",new Student("김남윤", "웹공학", 1, 3.5));
        students.put("최찬미",new Student("최찬미", "빅데이터", 1, 4.25));

        ArrayList<String> list = new ArrayList<>();

        list.add("11111");
        list.add("2222");
        list.add("3333");
        list.add("444");
        list.add("5555");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for (String z: list) {
            System.out.println(z);
        }

//        for (String key : students.keySet()) {
//            if(x.equals(key)) {
//                System.out.println(students.get(key));
////                System.out.println(key);
//            }
//        }
    }
}
