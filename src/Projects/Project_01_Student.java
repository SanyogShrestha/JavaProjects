package Projects;


public class Project_01_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Sanyog", 1, 85, 'A');
        Student s2 = new Student("Mangale", 2, 37, 'F');
        Student s3 = new Student("John", 3, 66, 'C');
        Student s4 = new Student("David", 4, 41, 'F');

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();

        double avg = calculateAverage(s1, s2, s3, s4);
        System.out.println("Average Marks: " + avg);
    }


    public static double calculateAverage(Student s1, Student s2, Student s3, Student s4) {
        return (s1.marks + s2.marks + s3.marks + s4.marks) / 4.0;
    }
}

class Student {
    String name;
    int roll_no;
    int marks;
    char grade;

    public Student(String name, int roll_no, int marks, char grade) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no + ", Marks: " + marks + ", Grade: " + grade);
    }
}

