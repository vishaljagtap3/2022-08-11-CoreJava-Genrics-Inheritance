public class Main {
    public static void main(String[] args) {

        //4
        //Pair4<String> p41 = new Pair4<String>(); will not work as String extends Number is false
        Pair4<Integer> p41 = new Pair4<>("BitCode", 411004);
        Pair4<Double> p42 = new Pair4<>("BitCode", 411.34);

        Pair5<Integer, String> p51 = new Pair5<Integer, String>(100, "Prashant");
        //p51.setKey('C');
        p51.display();

        Pair5<Character, String> p52 = new Pair5<>('A', "Apple");
        p52.display();
        //p52.setKey("String");


        //3
        /*Pair3<Character> p31 = new Pair3<>("Krishna", 'K');
        p31.display();

        Pair3<String> p32 = new Pair3<>("Divya", "H");
        p32.display();*/


        //2
        /*Pair2 p2 = new Pair2("vishal", 200);
        p2.display();*/


        //1
        /*Pair1 p1 = new Pair1("Vishal", 100);
        p1.display();*/

        /*Holder h1 = new Holder(100);
        Holder<Character> h2 = new Holder<>('D');*/

    }
}
