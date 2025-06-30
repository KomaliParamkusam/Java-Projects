package Week_4.BehavioralPatterns.template;

public class NonVegeterianMeal extends Restaurant
{

    @Override
    void selectIngredients() 
    {
        System.out.println("""  
            Ingredients for Non veg Meal:
            * Chicken
            * Mutton
            * Fish
            * Prawns
            * Masala """);
    }

    
    
}
