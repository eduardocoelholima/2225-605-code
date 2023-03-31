package previous_exams.exam1_2221;
//5

// what is the output of this program?
// explain what the method change does specify all involved variables types (parameter, local, static, instance field)

public class Arguments {

    int value = 0;
    private Arguments o = this;

    public Arguments change(int o) {
        this.o.value = o;
        return this;
    }

    public String toString() { return String.valueOf(value); }

    public static void main(String[] args) {
        Arguments o = new Arguments().change(2);
        System.out.println(o.value);
        System.out.println(o.change(3));
    }

}
