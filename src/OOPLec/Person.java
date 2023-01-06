package OOPLec;

public class Person {

    public static String breathes ="Oxygen";
    private String name;//instance property
    private String height;
    public String job;
    public Person() {}// <---empty constructor


    public Person (String name, String height, String job){
        this.name = name;
        this.height = height;
        this.job= job;
    }

    public String toString(){
        return String.format("{%n name: %s,%n height:%s%n}",this.name, this.height);

    }
    public String getName(){
        return name;
    }
    public String getHeight(){
        return height;
    }
    public void setName(){
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
