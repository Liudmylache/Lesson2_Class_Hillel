import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Murzik";
        cat1.color = "black";

        Cat cat2 = new Cat();
        cat2.name = "Rubik";
        cat2.color = "grey";

        List <Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(0,new Cat());
        cats.set(1,new Cat());


        System.out.println(cats);
    }
}