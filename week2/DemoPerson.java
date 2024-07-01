public class DemoPerson {
    public static void main(String[] args) {
        Person dome = new Person("dome");
        dome.name = "dome";
        dome.gender = 'm';
        // dome.telno = "0987654321";
        dome.setTelno("0987654321");

        Person ploy = new Person("ploy");
        ploy.name = "ploy";
        ploy.gender = 'f';
        // ploy.telno = "089123456";
        ploy.setTelno("089123456");

        Person ken = new Person("ken", 'm', "0764512398");
        Person may = new Person("may", 'f', "0654123879");
        Person ann = new Person("ann", 'f', "0554129873");
        Person fon = new Person("fon", 'f', "0421378569");

        // Output
        System.out.println(dome.getTelno(ploy));
        // System.out.println(dome.getTelno(ken));

        dome.getFan(ploy);
        dome.setFan(ploy);
        dome.setFan(ken);
        dome.getFan(ploy);
        
        dome.getFan(may);

        dome.setGig(may);
        dome.setGig(ann);
        dome.setGig(fon);

        dome.getGig(ken);
        dome.getGig(fon);
        
        dome.removeGig(ann);
        dome.getGig(fon);
        
        dome.getPersonInfo();

    }
}
