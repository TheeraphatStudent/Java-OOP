package test;

public class MyTestWeek3 {
    public static void main(String[] args) {
        // Parent
        People beckham = new People("Beckham", 'm', "Police");
        People victoria = new People("Victoria", 'f', "Banker");

        // Children
        Children brooklyn = new Children("Brooklyn", 'm', "School A", beckham, victoria);
        Children harper = new Children("Harper", 'f', "School A", beckham, victoria);

        System.out.println(brooklyn);
        System.out.println(harper);

        System.out.println(brooklyn.getParentName("father"));
        System.out.println(brooklyn.getParentName("mather"));

        System.out.println(beckham.getWorkplace());
        System.out.println(brooklyn.getWorkplace());

        System.out.println(harper.equals(victoria));

        System.out.println(brooklyn.respectTo(beckham));
        System.out.println(harper.respectTo(beckham));

    }
}

class People {
    public String name;
    public char gender;
    public String workplace;

    People(
            String _name,
            char _gender

    ) {
        this.name = _name;
        this.gender = _gender;

    }

    People(
            String _name,
            char _gender,
            String _workplace

    ) {
        this(_name, _gender);
        this.workplace = _workplace;

    }

    public String getWorkplace() {
        return this.workplace;

    }

    @Override
    public String toString() {
        return this.name;

    }

}

interface GoodChild {
    public String respectTo(People people);

}

class Children extends People implements GoodChild {
    People father;
    People mather;
    String school;

    Children(String _name, char _gender, People _father, People _mather) {
        super(_name, _gender);
        this.father = _father;
        this.mather = _mather;

    }

    Children(String _name, char _gender, String _school, People _father, People _mather) {
        super(_name, _gender);
        this.father = _father;
        this.mather = _mather;
        this.school = _school;

    }

    public String respectTo(People people) {
        String say = "สวัสดี";

        if (Character.toLowerCase(this.gender) == 'm') {
            say += "ครับ";
            if (people == this.father || people == this.mather) {
                if (people == this.father) {
                    say += "  คุณพ่อ";

                } else {
                    say += "  คุณแม่";

                }

            }

        } else {
            say += "ค่ะ";
            if (people == this.father || people == this.mather) {
                if (people == this.father) {
                    say += "  คุณพ่อ";

                } else {
                    say += "  คุณแม่";

                }

            }

        }
        
        return say;

    }

    // Mutator Method
    public People getParentName(String getWho) {
        return (getWho == "father") ? this.father : this.mather;

    }

    @Override
    public String toString() {
        return this.name;

    }

    @Override
    public boolean equals(Object obj) {
        String say = (obj == this.mather) ? ("รักแม่ที่สุดเลย สุขสันวันแม่") : ("ไม่ใช่หนูสักหน่อย");
        System.out.println(say);
        return obj == this.mather;

    }

    @Override
    public String getWorkplace() {
        return "ยังเรียนหนังสืออยู่เลย\t" + this.school;

    }

}