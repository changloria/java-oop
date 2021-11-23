import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mary");
        System.out.println("Student's Name: "+student.getName());

        student.setAge(16);
        System.out.println("Age: "+student.getAge());

        student.setGender("F");
        System.out.println("Gender: "+student.getGender());

        student.setId("Y138626");
        System.out.println("ID Number: "+student.getID());
    }
}
