/**
 * Created by anastasia on 03/01/2017.
 */
public class Person {
    private String name;
    private int age;

    public Person (String name, int age){
        if (name == null || name == "" || name.length() >= 40) {
            throw new IllegalArgumentException("Write valid name within the limit of 40 characters long");
        }
        this.name = name;

        if (age < 0 || age >= 120) {
            throw new IllegalArgumentException("The age should be more than 0 and less than 120 years");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String printPerson() {
        return this.getName() + " (" + this.getAge() + " years old)";
    }
}
