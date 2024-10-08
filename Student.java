public class Student extends Person{
    private int StudentID;

    public Student(String name, int age, int StudentID){
        super(name,age);
        this.StudentID = StudentID;
    }

    public void displayStudentInfo(){
        System.out.println(this.StudentID + " is ");
    }

    public static void main(String[] args) {
        Student s = new Student("Yasas", 22, 2002);
        s.displayFullName();
    }
}
