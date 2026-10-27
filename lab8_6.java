class Student {
    private int roll;
    private String name;
    private String email;
    private String phone;
    private String hostel;

    private Student(Builder builder) {
        roll = builder.roll;
        name = builder.name;
        email = builder.email;
        phone = builder.phone;
        hostel = builder.hostel;
    }

    public String toString() {
        return "Roll: " + roll + ", Name: " + name
                + ", Email: " + valueOrDash(email)
                + ", Phone: " + valueOrDash(phone)
                + ", Hostel: " + valueOrDash(hostel);
    }

    private String valueOrDash(String value) {
        return value == null || value.isEmpty() ? "-" : value;
    }

    static class Builder {
        private int roll;
        private String name;
        private String email;
        private String phone;
        private String hostel;

        public Builder(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        public Builder email(String email) { this.email = email; return this; }
        public Builder phone(String phone) { this.phone = phone; return this; }
        public Builder hostel(String hostel) { this.hostel = hostel; return this; }
        public Student build() { return new Student(this); }
    }
}

public class lab8_6 {
    public static void main(String[] args) {
        Student s1 = new Student.Builder(101, "Asha")
                .email("asha@pdeu.ac.in")
                .phone("9876543210")
                .hostel("A-Block")
                .build();

        Student s2 = new Student.Builder(102, "Ravi").build();

        System.out.println(s1);
        System.out.println(s2);
    }
}
