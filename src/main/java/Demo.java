import org.openjdk.jol.vm.VM;

public class Demo {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(VM.current().addressOf(s));
        print(s);
        System.out.println(s);

        //ball
        Ball b = new Ball("blue");
        System.out.println(VM.current().addressOf(b));
        System.out.println(b);
        printBall(b);
        System.out.println(b);

    }

    public static void print(String s) {
        System.out.println(VM.current().addressOf(s));
        s = s.concat(" world");
        System.out.println(VM.current().addressOf(s));
        System.out.println(s);
    }

    public static void printBall(Ball b) {
        System.out.println(VM.current().addressOf(b));
        b.setColor("red");
        System.out.println(b);
    }
}

class Ball {
    private String color;
    public Ball(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Ball "+this.color;
    }
}