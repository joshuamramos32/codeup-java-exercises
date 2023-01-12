package Grades;

public class StudentTest {
    public static void main(String[] args) {
//        System.out.println("Welcome!\nHere are the GITHUB usernames of our students: ");
        Student josh = new Student("Josh");
        josh.addGrade(100);
        josh.addGrade(50);
        System.out.println(josh.getGradeAverage());
    }
}
