import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by vksah on 8/15/17.
 */
public class Main {

    public static void main(String[] args) {
        //instatiate the guice module
        Injector guice = Guice.createInjector(new EatableGuiceModule());
        CalorieCounter counter = guice.getInstance(CalorieCounter.class);

        counter.getTotalCalories(12);

    }
}
