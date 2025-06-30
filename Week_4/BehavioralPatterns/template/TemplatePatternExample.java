package Week_4.BehavioralPatterns.template;

public class TemplatePatternExample 
{
    public static void main(String[] args) 
    {
        Restaurant nonveg=new NonVegeterianMeal();
        nonveg.cook();
        System.out.println("------------------------------");
        Restaurant veg=new VegeterianMeal();
        veg.cook();
    }
}
