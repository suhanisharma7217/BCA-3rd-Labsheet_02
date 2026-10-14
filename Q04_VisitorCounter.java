public class Q04_VisitorCounter {
    public static void main(String[] args) {
        int visitors = 0;
        System.out.println("Initial visitors: " + visitors);

        System.out.println("Visitor enters (prefix ++): " + (++visitors));
        System.out.println("Visitor enters (postfix ++): " + (visitors++));
        System.out.println("Visitors after entry: " + visitors);

        System.out.println("Visitor leaves (prefix --): " + (--visitors));
        System.out.println("Visitor leaves (postfix --): " + (visitors--));
        System.out.println("Visitors after leaving: " + visitors);
    }
}
