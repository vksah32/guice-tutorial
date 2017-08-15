## Explicit bind in Guice module
- Eatable interface with `getCalories()` methods 
- Apple and Banana implement that
- In CalorieCounter constructor whcih needs an instance of Eatable, used `@Inject`. This means to initialize it, Guice will put instance as configured.
- In `Main`, intialize the guice module (`EatableJuiceModule`) in which we bind `Eatable.class` to `Apple.class`. This means, whenever some class needs an instance of Eatable class, it will inject an instance of Apple class.
```
protected void configure() {
           //if any method needs Eatable, then give it Apple
           bind(Eatable.class).to(Apple.class);
       }
```
- Then ask guice for an instance of `CalorieCounter`. Due to `@Inject`, juice has already injected Apple.class and returns you an initialized instance of `CalorieCounter`.

- Then call the `getTotalCaloriesMethod` and it works.
 
----------
- Can also use the annotation `@ImplementedBy(SomeClass.class)` above interface declaration in case you don't want to explicitly write `bind` statements in guicemodule. Eg:
```
@ImplementedBy(Banana.class)
public interface Eatable {
    double getCalories();
}
```

- If you have both, the guice module's bind statements take precedence.

    
