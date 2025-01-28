package catchITProblems;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional {
    public static void main(String[] args) {
        Predicate<Integer>isEven=num->num%2==0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(4));

        Function<String,Integer>strLength=str->str.length();
        System.out.println(strLength.apply("kalyani"));

       Consumer<String>printMsg=msg-> System.out.println(msg);
       printMsg.accept("helloworld!");

        Supplier<Double>random= ()->Math.random();
        System.out.println(random.get());

    }
}
