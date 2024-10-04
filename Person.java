// Java Code for Person Class (programming III module)
// Save in 'Person.java' and run
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void displayFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }

    public static void main(String[] args) {
        Person person = new Person("Udara", "Chandrawansa", 22);
        person.displayFullName();
    }
}