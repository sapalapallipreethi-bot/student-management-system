import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                viewStudents();
            } else if (choice == 3) {
                searchStudent();
            } else if (choice == 4) {
                deleteStudent();
            } else if (choice == 5) {
                System.exit(0);
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        list.add(new Student(id, name, age));
        System.out.println("Student Added!");
    }

    static void viewStudents() {
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : list) {
            if (s.id == id) {
                System.out.println("Found: " + s.id + " " + s.name + " " + s.age);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        boolean removed = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                list.remove(i);
                removed = true;
                System.out.println("Student Deleted Successfully!");
                break;
            }
        }

        if (!removed) {
            System.out.println("Student Not Found!");
        }
    }
}