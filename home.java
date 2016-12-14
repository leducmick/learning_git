
public class Exo1 {
    public static void main(String[] args) {
        Example e = new Example();
        String[] tests = { "coucou", "mon", "gars" };

        e.setFoo("foo !!!");

        for (String test : tests) {
            System.out.print(e.getFoo() + " : ");

            System.out.print(test + " -> ");

            e.setFoo(test);

            System.out.println(e.getFoo());
        }
    }
}
