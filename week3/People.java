package week3;

class PeopleProps {
    String name;
    char gender;
    String workplace;

}

public class People extends PeopleProps {
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
        this.name = _name;
        this.gender = _gender;
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