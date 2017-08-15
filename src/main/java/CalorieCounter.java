import com.google.inject.Inject;

/**
 * Created by vksah on 8/15/17.
 */
public class CalorieCounter {

    private final Eatable eatable;

    @Inject
    public CalorieCounter(Eatable eatable){
        this.eatable = eatable;
    }

    public double getTotalCalories(int total){
        double totalCalories = total*this.eatable.getCalories();
        System.out.printf("Total Calories: %f", totalCalories);
        return totalCalories;
    }



}
