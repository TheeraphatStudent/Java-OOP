public class Student {
    // Props
    String name;
    String id;
    Student classmate;

    // Constructor
    Student (
        String Name,
        String Id,
        Student Classmate

    ) {
        name = Name;
        id = Id;
        classmate = Classmate;

    }

    // Method
    void setStudent(Student sm) {
        name = sm.name;
        id = sm.id;
        classmate = sm.classmate;

    }

    // Result
    void print() {
        System.out.printf("name %s\nid %s\n", name, id);
        if (!(classmate == null)) {
            System.out.printf("Classmate name: %s\n", classmate.name);
            System.out.printf("Classmate id: %s\n", classmate.id);

        } else {
            System.out.println("No Classmate");

        }
        System.out.println();

    }

    void print_all() {
        if (classmate != null) {
            print();
            classmate.print();

        }

    }

}
