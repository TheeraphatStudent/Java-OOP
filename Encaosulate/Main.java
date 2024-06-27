package Encaosulate;

public class Main {
    public static void main(String[] args) {
        Encapsulate caps = new Encapsulate("Prop 1", "Hello World", 2024);
        Encapsulate cap2 = new Encapsulate("Prop 2", "Hello Human", 2020);

        caps.setNumber(2025);

        for (Object result : caps.getAll()) {
            System.out.println(result);

        }

    }
}
