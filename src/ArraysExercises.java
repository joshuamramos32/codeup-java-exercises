import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] person = {new Person("Person 1"), new Person("Person 2"), new Person("Person 3")};
        for (Person people : person) {
            System.out.println(people.getName());
        }
        System.out.println(".............");
        Person[] addPerson = new Person[4];
        addPerson[0] = person[0];
        addPerson[1] = person[1];
        addPerson[2] = person[2];
        addPerson[3] = new Person("Person 4");
        for(Person newPeople : addPerson){
            System.out.println(newPeople.getName());
        }
    }
}