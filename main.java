public class Main {
    public static void main(String[] args) {
        Person person = new Person(null, null, null, 0);
        person.setName("Osamu Dazai");
        System.out.println(person.getName());

        person.setPassword("password123");
        System.out.println(person.getPassword());

        Person student = new Person("Bingham", "osuma", "123456", "BHU/22/04/05/0092");
        System.out.println(student);

        Person staff = new Person("Bingham", "osuma", "123456", 667);
        System.out.println(staff);
    }
}