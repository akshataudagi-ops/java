class Student {

    Student() {
        this(10);
        System.out.println("Default constructor");
    }

    Student(int id) {
        System.out.println("ID = " + id);
    }
}


public class thisKeyword {
    public static void main(String args[]) {
        Student s = new Student();
    }
}