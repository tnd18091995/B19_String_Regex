public class DemoString {
    public static void main(String[] args) {
        String a = "Jin Nguyen";
        String a1 = "Jin Nguyen";
        User u1 = new User("Jin Nguyen",19);
        User u2 = u1;
        u2.setAge(25);
        System.out.println(u1.getAge());
    }
}
