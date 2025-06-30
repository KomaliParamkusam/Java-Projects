package Week_4.BehavioralPatterns.template;

public abstract class Restaurant 
{
    public final void cook()
    {
        selectIngredients();
        cookIngredients();
        plateTheDish();

    }
    public void plateTheDish()
    {
        System.out.println("Dish is serving in the plate");
    }
    public void cookIngredients()
    {
        System.out.println("Cooking the dish.....");
    }
    abstract void selectIngredients();
   
}
