import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }
}

class ClassRegister {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) { students.add(student); }

    public Iterator<Student> passedStudents() {
        return new PassIterator(students);
    }
}

class PassIterator implements Iterator<Student> {
    private List<Student> students;
    private int index = 0;

    public PassIterator(List<Student> students) {
        this.students = students;
    }

    private void skipFailedStudents() {
        while (index < students.size() && students.get(index).getMarks() < 40) {
            index++;
        }
    }

    public boolean hasNext() {
        skipFailedStudents();
        return index < students.size();
    }

    public Student next() {
        if (!hasNext()) throw new NoSuchElementException("No passed student remains");
        return students.get(index++);
    }
}

public class lab10_6 {
    public static void main(String[] args) {
        ClassRegister register = new ClassRegister();
        register.addStudent(new Student("Asha", 78));
        register.addStudent(new Student("Ravi", 35));
        register.addStudent(new Student("Meera", 62));
        register.addStudent(new Student("Karan", 28));
        register.addStudent(new Student("Neha", 90));

        System.out.println("Passed students:");
        Iterator<Student> iterator = register.passedStudents();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName() + " - " + student.getMarks());
        }
    }
}
