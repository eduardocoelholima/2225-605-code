package interfaces;

public class Pegasus implements Mythical {
    public String identifyMyself() {
        return "I'm Hercules's personal steed";
    }

    public static void main(String... args) {
        Mythical myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
}

