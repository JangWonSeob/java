import java.util.ArrayList;
import java.util.Scanner;


public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("황기태", "모바일", 1, 4.1));
//        students.add(new Student("이재문", "안드로이드", 2, 3.9));
//        students.add(new Student("김남윤", "웹공학", 1, 3.5));
//        students.add(new Student("최찬미", "빅데이터", 1, 4.25));

//        황기태,모바일,1,4.1
//        이재문,안드로이드,2,3.9
//        김남윤,웹공학,1,3.5
//        최찬미,빅데이터,1,4.25

        for (int i = 0; i < 4; i++) {
            System.out.print(">>");
            String x = sc.next();
            String[] values = x.split(",");
            students.add(new Student(values[0], values[1],
                    Integer.parseInt(values[2]), Double.parseDouble(values[3])));
        }
        System.out.print("학생 이름 >>");
        String y = sc.next();

        int z = 0;
        for (Student student : students) {
            System.out.println(z);
            z += 1;
            if (student.name.equals(y)) {
                System.out.println(student.name);
                System.out.println(student.toString());
            }
        }
    }
}
