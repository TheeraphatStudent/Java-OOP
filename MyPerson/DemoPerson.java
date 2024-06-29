package MyPerson;

public class DemoPerson {
    public static void main(String[] args) {
        Person dome = new Person("dome");
        dome.setGender('m');
        dome.setPhone("072389456");

        Person ken = new Person("ken", 'm', "0987456123");
        Person ploy = new Person("ploy");
        ploy.setGender('f');
        ploy.setPhone("0231456987");

        Person may = new Person("may", 'f', "0147852369");
        Person ann = new Person("ann", 'f', "0321654789");
        Person fon = new Person("fon", 'f', "0587412358");

        dome.getPhone(ploy);
        dome.setFan(ploy);

        // dome.getFan(ann);
        dome.getPersonInfo();

        dome.setGig(ann);
        dome.setGig(may);
        dome.setGig(fon);

        dome.getGig(ken);

        dome.removeGig(ann);
        dome.removeGig();
    }
}
