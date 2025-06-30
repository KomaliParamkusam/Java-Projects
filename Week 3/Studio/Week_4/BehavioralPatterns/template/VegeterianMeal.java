package Week_4.BehavioralPatterns.template;

public class VegeterianMeal extends Restaurant
{

    @Override
    void selectIngredients() 
    {
        System.out.println("""
                Ingredients for Vegeterian Meal:
                * Vegetables
                * Leafy Vegies
                * Corn
                * Capsicum""");
    }
    
}
