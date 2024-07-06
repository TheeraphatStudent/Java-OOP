package week3;

// import week3.People;

public class Family {
    public static void main(String[] args) {
        People beckham = new People("Backham", 'm', "Officer");
        People victoria = new People("Victoria", 'f', "Banker");
        People teacherB = new People("teacherB", 'f', "teacher");

        Children brooklyn = new Children("Brooklyn", 'm', "School A", beckham, victoria);
        Children harper = new Children("harper", 'f', "School B", beckham, victoria);

        // System.out.println(brooklyn.name);
        System.out.println(brooklyn);
        System.out.println(harper);

        // Ask for father and mather name
        // System.out.println(brooklyn.father.name);
        // System.out.println(brooklyn.mather.name);
        System.out.println(brooklyn.father);
        System.out.println(brooklyn.mather);

        // System.out.println(brooklyn.father.getWorkplace());
        // System.out.println(brooklyn.mather.getWorkplace());

        System.out.println(brooklyn.getWorkplace());

        // System.out.println(harper.equals(victoria));
        harper.equals(teacherB);
        harper.equals(victoria);

        // System.out.println(harper.respectTo(beckham));
        // System.out.println(harper.respectTo(victoria));
        // System.out.println(harper.respectTo(teacherB));
        
        System.out.println(brooklyn.respectTo(beckham));
        System.out.println(brooklyn.respectTo(victoria));
        System.out.println(brooklyn.respectTo(teacherB));



    }
}
