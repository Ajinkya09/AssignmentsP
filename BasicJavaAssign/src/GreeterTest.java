import com.psl.app.Advisor;
import com.psl.app.Greeter;

public class GreeterTest{

    public static void main(String[] args) {

        Greeter g1 = new Greeter(args[0]);
        Greeter g2 = new Greeter(args[1]);

        g1.sayHello();
        g2.sayHello();

        Advisor a = new Advisor();

        System.out.println(a.getAdvice());

        g2.sayGoodBye();
        g1.sayGoodBye();
    }
}