package singleton;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        Person person2 = Person.getInstance();
        System.out.println(person.equals(person2));
    }
}