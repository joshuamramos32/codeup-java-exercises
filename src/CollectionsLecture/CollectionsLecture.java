package CollectionsLecture;

import java.util.ArrayList;

public class CollectionsLecture {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("cool");// this is how you add to an arraylist
        words.add("radical");
        words.add(0,"wicked");//insertion of element at specific index.
        System.out.println(words);
        System.out.println(words.get(0));// this will get you the content of a specific index;
        System.out.println(words.size());//this is a method, so you have to have the parenthesis.
        System.out.println(words.indexOf("wicked"));
        System.out.println(words.lastIndexOf("wicked"));
        System.out.println(words.contains("typical"));
        words.remove("cool");
        words.remove(1);
        words.remove("typical");
//        words.remove(24)// index out of bounds

    }
}
