package builder;
public class MealOrderBuilderPattern 
{
    public static void main(String[] args) 
    {
        Meal komali=new Meal.MealBuilder("Chicken Biryani").setDrink("Soda").setSideItem("Fries").build();
        System.out.println("Komali ordered following: " +komali);
        Meal bharath=new Meal.MealBuilder("Mandi").setDrink("Thums up").setSideItem("Salad").setDessert("Icecream").build();
        System.out.println("Bharath ordered following: " +bharath);


    }
}
