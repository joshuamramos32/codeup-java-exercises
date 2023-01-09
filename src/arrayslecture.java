import java.util.Arrays;

public class arrayslecture {
    //Arrays in JavaScript " They had the ability to add new elements freely!
    //Arrays in Java? they do not...
    public static void main(String[] args) {
        double [] prices = new double[6];
        prices[0] = 19.99;
        prices[1] = 54.99;
        prices[2] = 9.99;
        prices[3] = 1.89;
        prices[4] = .99;
        prices[5] = 5.00;
        //We no longer have a push method. Arrays are always the length they were assigned at creation.
        for(int i = 0; i<prices.length; i++) {
            System.out.println(prices[i]);
        }
        //Enhanced for loop.
        for (double price : prices) {
            System.out.println(price);
        }
        Person[] people = {new Person("Moe"), new Person("larry"), new Person("Curly")};
        for(Person stooge : people){
            System.out.println(stooge.getName());
        }
        Person[] stooges = new Person[3];
        Arrays.fill(stooges, new Person("Shemp"));
        for(Person stooge : stooges){
            stooge.sayHello();
            System.out.println(stooge);
        }
        Person[] performers = new Person[3];
        performers[0] = people[0];
        performers[1] = people[1];
        performers[2] = people[2];
        System.out.println(performers == people);
        System.out.println(Arrays.equals(performers, people));

        System.out.println(Arrays.toString(people));

        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");




//        int[] numbers = new int[4];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//
//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[1]); // 2
//        System.out.println(numbers[2]); // 0 -- default value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!
//        // using the array initializer syntax
//        String[] beatles = {"John", "Paul", "Ringo",""};// if you leave a blank string you will be able to add to the array line 23.
//
//        System.out.println(beatles.length); // 3
//
//        System.out.println(beatles[0]); // "John"
//        System.out.println(beatles[1]); // "Paul"
//        System.out.println(beatles[2]); // "Ringo"
//
//// ArrayIndexOutOfBoundsException !
//        beatles[3] = "George";
//        System.out.println(beatles[3]);
//
//        String[] languages = {"html", "css", "javascript", "java"};
//
//        for (int i = 0; i < languages.length; i ++) {
//            System.out.println(languages[i]);
//        }
////        String[] languages = {"html", "css", "javascript", "java"};
//
////        for (String language : languages) {
////            System.out.println(language);
////        } These are the exact same thing  as lines 26-30 they will output the same way also.
//        int[] numbers ={1,2,3,4,5};
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
////        int[] numbers ={1,2,3,4,5};
////        for (int number : numbers) {
////            System.out.println(number);
////        }// another example of using the enhanced version for iterating through an array
    }
}
