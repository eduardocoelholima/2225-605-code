package inheritance.animal.v1;
// comments have been omitted for instructional brevity
public class Animal1 {
    int lives;

    public Animal1(int lives) {
        this.lives = lives;
        System.out.format("I have %s lives%n", this.lives);
    }

    public void whoIam() {
        System.out.println("I'm a animal");
    }
}

