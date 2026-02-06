package OOP.Inheritance;

public class HowItWork {
    public static void main(String[] args) {
        System.out.println("--- Starting the car creation magic ---");

        // We only call new GT3(), we don't touch PorscheFactory().
        GT3 myCar = new GT3();

        System.out.println("--- Done. Vroom vroom. ---");
        /*
        When you type the command 'new GT3()', Java doesn't just instantly print a car.
        Here is what actually goes down behind the scenes:

        1. Java sees the request to create a GT3.
        2. Java notices 'GT3 extends PorscheFactory'.
        3. Java thinks: "I can't build the sports car (Child) without the chassis (Parent) first!"
        4. It SILENTLY runs the Parent Constructor first to set up the basics (frame, stock engine).
        5. Once the Parent is done, ONLY THEN does it run the Child Constructor (adding the spoiler, tuning the exhaust).

        => CONCLUSION: You don't need to manually create the Parent.
           The Parent is automatically built inside the Child.
           You can't have the cool Child object without the boring Parent core inside it.
         */
    }
}

class PorscheFactory { // The Parent Class
    public PorscheFactory() {
        System.out.println("1. [PARENT] Casting the heavy iron chassis and base engine...");
    }
}

class GT3 extends PorscheFactory { // The Child Class
    public GT3() {
        // Even though you didn't write it, Java sneakily puts super() right here!
        System.out.println("2. [CHILD] Slapping on a giant wing and making it loud...");
    }
}

