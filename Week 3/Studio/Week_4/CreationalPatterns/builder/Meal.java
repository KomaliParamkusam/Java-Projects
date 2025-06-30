package builder;
class Meal 
{
    private String mainDish;
    private String drink;
    private String sideItem;
    private String dessert;
    private Meal(MealBuilder mealbuilder)
    {
        this.mainDish=mealbuilder.mainDish;
        this.drink=mealbuilder.drink;
        this.sideItem=mealbuilder.sideItem;
        this.dessert=mealbuilder.dessert;
    }
    @Override
    public String toString() 
    {
        return "Meal [mainDish=" + mainDish + ", drink=" + drink + ", sideItem=" + sideItem + ", dessert=" + dessert
                + "]";
    }
    public static class MealBuilder
    {
        private String mainDish;
        private String drink;
        private String sideItem;
        private String dessert;
        public MealBuilder(String mainDish)
        {
            this.mainDish=mainDish;
        }

        public MealBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public MealBuilder setSideItem(String sideItem) {
            this.sideItem = sideItem;
            return this;
        }

        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }
        public Meal build()
        {
            return new Meal(this);
        }
        
    }

}
