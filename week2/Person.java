import java.util.ArrayList;

public class Person {
    public String name;
    public char gender;
    private String telno;
    public Person fan;
    public ArrayList<Person> gig = new ArrayList<Person>(2);

    Person(String name) {
        this.name = name;

    }

    Person(
            String name,
            char gender,
            String telno) {
        this.name = name;
        this.gender = gender;
        this.telno = telno;

    }

    public String toString() {
        return name;

    }

    // Name
    public String getName() {
        return name;
    }

    // Gender
    public char getGender() {
        return gender;
    }

    // Telno
    public String getTelno(Person personReq) {
        if (personReq.gender != getGender()) {
            return telno;

        } else {
            return "ม่ายบอก";

        }
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    // Fan
    public void getFan(Person personReq) {
        if (personReq.gender != getGender()) {
            if (personReq == fan) {
                System.out.println("สุดที่รักไงล่ะจ๊ะ");

            } else {
                System.out.println("ยังไม่มีแฟนจ้าา");

            }
        }

    }

    public void setFan(Person personReq) {
        if (personReq.gender == getGender()) {
            System.out.println("เดี๋ยวฟ้าผ่า!!! เป็นแฟนกันไม่ได้นะ");

        } else {
            if (fan == null) {
                this.fan = personReq;

            } else {
                System.out.println("เปลี่ยนแฟนตอนนี้ไม่ได้นะ");

            }

        }
    }

    // Gig
    public void setGig(Person personReq) {
        if (this.gig.size() < 2) {
            this.gig.add(personReq);

        } else {
            System.out.println("แค่ 2 คนพอแล้ว ดูแลไม่ไหว");

        }

    }

    public void getGig(Person personReq) {
        if (personReq.gender == getGender()) {
            for (Person myGig : this.gig) {
                System.out.println("Gig name: " + myGig.name);

            }

        } else {
            System.out.println("ไม่มีกิ๊กซักคนเลย");

        }

    }

    public void removeGig() {
        this.gig.clear();

    }

    public void removeGig(Person gig) {
        this.gig.remove(gig);

    }

    public void getPersonInfo() {
        System.out.printf("=============================\nName: %s\nGender: %c\nTelno: %s", getName(), getGender(), this.telno);

    }

}