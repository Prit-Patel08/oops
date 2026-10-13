import java.io.*;
import java.util.*;

class Student implements Serializable {
    int rollNo;
    String name;
    double percentage;

    Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Percentage: " + percentage;
    }
}

public class lab6_p3 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {

        Student s1 = new Student(22, "Prit", 92.5);
        Student s2 = new Student(28, "Aashray", 87.2);
        Student s3 = new Student(33, "Pranshu", 88.7);

        FileOutputStream file = new FileOutputStream("Student.data");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(s1);
        out.writeObject(s2);
        out.writeObject(s3);

        out.close();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        FileInputStream file2 = new FileInputStream("Student.data");
        ObjectInputStream in = new ObjectInputStream(file2);

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            Student s = (Student) in.readObject();

            if (s.rollNo == rollNo) {
                System.out.println(s.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        in.close();
        sc.close();
    }
}
