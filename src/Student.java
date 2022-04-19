public class Student {

    public String name;
    public String grades;
    public int number;
    public double average;

    public Student (String name, String grades, int number, double average) {
        this.name = name;
        this.grades = grades;
        this.number = number;
        this.average = average;
    }

    public String toString() {
        return "Student[name=" + name + ", grades=" + grades + ", number=" +
                number + ", average=" + average + "]";
    }

    public static String test(){
        return "test";
    }
}
