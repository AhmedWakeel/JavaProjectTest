public class Upper {

    int d = 9;
    static String upper = "asd";
    private static Upper instance = new Upper();

    private Upper() {
    }

    ;

    static class Inner {
        static String name = "faisal";
        static String surname = "ansari";
        static String father = "ashfaque";
        static String mother = "yasmeen";

    }

    static class Inner2{
        static String name ="zaid";
    }

    public static void display() {

        System.out.println("testing");
        System.out.println(upper);
        System.out.println(Inner.name);
        System.out.println(instance);
        if(false){
            System.out.println(Inner2.name);
            System.out.println(Inner.surname);
        }
    }
}
