package Grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student josh = new Student("Josh");
        josh.addGrade(100);
        josh.addGrade(50);
        josh.addGrade(100);
        Student nina = new Student("Nina");
        nina.addGrade(100);
        nina.addGrade(99);
        nina.addGrade(98);
        Student amelia = new Student("Amelia");
        amelia.addGrade(100);
        amelia.addGrade(90);
        amelia.addGrade(80);
        Student carter = new Student("Carter");
        carter.addGrade(99);
        carter.addGrade(89);
        carter.addGrade(79);


//        Student all = new Student("all students");
//        all.addGrade(josh,nina,amelia,carter);

        students.put("joshuamramos32", josh);
        students.put("ninapramos31", nina);
        students.put("ameliagacosta30", amelia);
        students.put("carterscarillo29", carter);
        System.out.println(students);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String userRequest;


        System.out.println();
        do {
            System.out.println("Welcome! \n\nHere are the GitHub usernames of our students: \n");
            for (HashMap.Entry<String, Student> entry : students.entrySet()) {
                System.out.print("|" + entry.getKey() + "| ");
            }
            System.out.println("\n\nWhat student would you like to see more information on? ");
            System.out.println();
            userRequest = scanner.nextLine();
            if(students.containsKey(userRequest)) {
                Student requestedStudent = students.get(userRequest);
                System.out.println("Name: " + requestedStudent.getName());
                System.out.println("Grade average: " + requestedStudent.getGradeAverage());
            }else{
                System.out.println("Sorry no student has the GitHub username: " + userRequest);
            }
            System.out.println("Would you like to continue Y/N?");
            userRequest = scanner.nextLine();
        }while(userRequest.equalsIgnoreCase("y"));
        System.out.println("Have a great day!!!");
    }
}
