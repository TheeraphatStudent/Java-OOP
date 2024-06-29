package MyPerson;

import java.util.ArrayList;

public class Person {
    // Props
    private String name;
    private char gender;
    private String telno;
    public Person fan;
    public ArrayList<Person> gig = new ArrayList<Person>(2);

    // Constructor
    Person(String name) {
        setName(name);
    }

    Person(String name, char gender, String telno) {
        setName(name);
        setGender(gender);
        setPhone(telno);
    }

    // ! Overriding Method For Return Name when call object to get something
    // feature of polymorphism: (ฟีเจอร์ที่ใช้สำหรับ object
    // ที่มีความหลากหลายแตกต่างกัน)
    // that allows a subclass to provide a specific: (จัดเตรียมสำหรับคลาสย่อย)
    // implementation for a method already defined in its superclass: (เพื่อให้
    // method เตรีนมดำเนินการต่างๆใน Superclass)
    /*
     * Example:
     * Person myPerson = new Person("myPerson", 'm', "0987456123");
     * 
     * !getFan() is method return Person obj
     * System.out.printlb(myPerson.getFan())
     */
    @Override
    public String toString() {
        return name;

    }

    public void removeGig() {
        this.gig.clear();

    
    }
    public void removeGig(Person gig) {
        this.gig.remove(gig);

    }

    // Getter
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone(Person personRequest) {
        // System.out.println(personRequest.getGender());
        // System.out.println(getGender());
        if (personRequest.gender != getGender()) {
            return telno;

        } else {
            return "ม่ายบอก";

        }
    }

    public String getFan(
            Person personRequest) {
        if (personRequest.gender != getGender() && personRequest.fan != fan) {
            return "ยังไม่มีแฟนจ้า";
        } else if (personRequest.gender != getGender() && personRequest.fan == fan) {
            return "สุดที่รักไงล่ะจ๊ะ";

        } else {
            return "...";

        }

    }

    public void getGig(Person personRequest) {
        if (personRequest.gender == getGender()) {
            if (this.gig != null) {
                for (Person personGig : this.gig) {
                    System.out.println(personGig);

                }
            }
        } else {
            System.out.println("ไม่มีกิ๊กซักคนเลย");

        }

    }

    public void getPersonInfo() {
        System.out.printf("ชื่อ: %s\nเพศ: %c\nเบอร์: %s\n", this.name, this.gender, this.telno);
        if (this.fan != null) {
            System.out.println("แฟน: " + this.fan);

        } else {
            System.out.println("แฟน: ยังไม่มี");

        }

    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(String telno) {
        this.telno = telno;
    }

    public void setFan(Person getFan) {
        if (getFan.gender == getGender()) {
            System.out.println("เดี๋ยวฟ้าผ่า!!! เป็นแฟนกันไม่ได้นะ");

        } else {
            if (this.fan != null) {
                System.out.println("เปลี่ยนแฟนตอนนี้ไม่ได่นะ");

            } else {
                this.fan = getFan;

            }

        }

    }

    public void setGig(Person getGig) {
        // System.out.println("Set Gig Work!");
        if (this.gig.size() < 2) {
            gig.add(getGig);

        } else {
            System.out.println("แค่ 2 คนพอแล้ว ดูแลไม่ไหว");
        }

    }
}
