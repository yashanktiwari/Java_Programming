public class Student {
    String name;
    int age;
    String program;
    Student(String n, int a, String p) {
        super();
        name = n;
        age = a;
        program = p;
    }
    void display_student_info() {}
}

class GraduateStudent extends Student {
    double percentage;
    String stream;

    GraduateStudent(String n, int a, String p, double percentage, String stream) {
        super(n, a, p);
        this.percentage = percentage;
        this.stream = stream;
    }
    @Override
    void display_student_info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        System.out.println(percentage);
        System.out.println(stream);
    }
}

class ResearchStudent extends Student {
    String specialization;
    int years_of_experince;

    ResearchStudent(String n, int a, String p, String specialization, int years_of_experince) {
        super(n, a, p);
        this.specialization = specialization;
        this.years_of_experince = years_of_experince;
    }

    @Override
    void display_student_info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        System.out.println(specialization);
        System.out.println(years_of_experince);
    }
}

class Main {
    public static void main(String[] args) {
        GraduateStudent gstu1 = new GraduateStudent("Raj", 22, "B.Tech", 87.5, "EE");
        GraduateStudent gstu2 = new GraduateStudent("Shruti", 21, "B.Tech", 94, "CS");
        ResearchStudent rstu1 = new ResearchStudent("Ram", 25, "M.Tech", "Data Structures and Algorithms", 2);
        ResearchStudent rstu2 = new ResearchStudent("Rahil", 26, "M.Tech", "Artificial Intelligence", 2);
        gstu1.display_student_info();
        gstu2.display_student_info();
        rstu1.display_student_info();
        rstu2.display_student_info();
    }
}
