import com.google.inject.ImplementedBy;

/**
 * Created by vksah on 8/15/17.
 */
@ImplementedBy(Banana.class)
public interface Eatable {
    double getCalories();
}
