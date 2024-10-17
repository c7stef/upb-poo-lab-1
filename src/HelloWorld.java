public class HelloWorld {
    /**
     * Print "Hello, World" to the terminal window.
     * @param args Command-line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        System.out.println("\nExercitiul 3\n");

        System.out.println(yes == no || grade > amount);
        System.out.println(amount == 40.0 || amount == 50.0); // Schimbata ca sa compileze
        System.out.println(hiVal != loVal || loVal < 0);
        System.out.println(true || hello.length() > 0);
        System.out.println(hello.isEmpty() && yes);
        System.out.println(grade <= 100 && !false);
        System.out.println(!yes || no);
        System.out.println(grade > 75 && 75 > amount); // Schimbata ca sa compileze
        System.out.println(amount <= hiVal && amount >= loVal);
        System.out.println(no && !no || yes && !yes);

        System.out.println("\nExercitiul 4\n");

        float a = 100.25f;
        long b = (long) a;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        int c = (int)b;
        System.out.println("value of c: "+c);
        byte d = (byte) c;
        System.out.println("value of d: "+d);

        System.out.println("\nExercitiul 5\n");

        int a_5 = 5;
        System.out.println(a_5 + -a_5 - a_5++ % 10);
        System.out.println(a_5 - a_5 + --a_5 / 10);

        for (int i = 2; i < 5;) {
            i++;
            a_5 += a_5;
        }

        System.out.println(a_5);
    }
}
