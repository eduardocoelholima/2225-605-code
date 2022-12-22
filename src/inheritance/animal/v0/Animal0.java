package inheritance.animal.v0;
// comments have been omitted for instructional brevity
public class Animal0 {
    int lives;

    public Animal0() {
        System.out.println("I'm a animal");
    }

    public Animal0(int lives) {
        this();
        this.lives = lives;
        System.out.format("I have %s lives%n", this.lives);
    }
}
