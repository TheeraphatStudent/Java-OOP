class MyStudent {
    public static void main(String[] args) {
        Student sm = new Student("Nate", "111111111", null);
        // sm.print();

        Student sm2 = new Student("Nate2", "222222222", sm);
        // sm2.print();

        Student sm3 = new Student("Nate3", "333333333", sm2);
        // sm3.print();
        sm3.print_all();

    }

}