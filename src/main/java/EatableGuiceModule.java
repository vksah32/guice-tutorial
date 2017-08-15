import com.google.inject.AbstractModule;
import com.google.inject.Module;

/**
 * Created by vksah on 8/15/17.
 */
public class EatableGuiceModule extends AbstractModule {

    protected void configure() {
        //if any method needs Eatable, then give it Apple
//        bind(Eatable.class).to(Apple.class);
    }
}
