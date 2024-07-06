package week3;

// import week3.People;

interface GoodChildren {
    public String respectTo(People people);

}

public class Children extends People implements GoodChildren {

    People father;
    People mather;
    String school;

    Children(String _name, char _gender, People _father, People _mather) {
        super(_name, Character.toLowerCase(_gender));
        this.father = _father;
        this.mather = _mather;
    }

    Children(String _name, char _gender, String _school, People _father, People _mather) {
        super(_name, Character.toLowerCase(_gender));
        this.school = _school;
        this.father = _father;
        this.mather = _mather;
    }

    People getFather() {
        return this.father;

    }

    People getMather() {
        return this.mather;

    }

    public String respectTo(People _people) {
        String say = "สวัสดี" + (this.gender == 'm' ? "ครับ" : "ค่ะ");

        if (this.father == _people || this.mather == _people) {
            if (this.father == _people) {
                return say + "คุณพ่อ";

            } else {
                return say + "คุณแม่";

            }

        } else {
            return say;

        }

    }

    @Override
    public String toString() {
        return this.name + ((this.gender == 'm') ? "(Boy)" : "(Girl)");

    }

    @Override
    public String getWorkplace() {
        System.out.print("ยังเรียนหนังสืออยู่เลย ");
        return this.school;

    }

    @Override
    public boolean equals(Object _obj) {
        boolean isMather = this.mather.equals(_obj);

        if (!isMather) {
            System.out.println("ไม่ใช้หนซักหน่อย");

        } else {
            System.out.println("สุขสันต์วันแม่ รักแม่ที่สุดเลย");

        }

        return (isMather);

    }
}