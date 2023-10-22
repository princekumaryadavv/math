import java.util.Scanner;

class Student {
    private int sid;
    private String sname;
    private String sadd;

    public void getdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        sid = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.print("Enter Student Name: ");
        sname = input.nextLine();
        System.out.print("Enter Student Address: ");
        sadd = input.nextLine();
    }

    public void putdata() {
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Student Address: " + sadd);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getdata();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].putdata();
        }
    }
}
