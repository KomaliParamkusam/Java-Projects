class GenericMethod 
{
   
    public static <T> void print(T[] array) 
    {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static <T> void print(T a) 
    {
       System.out.println(a);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Java", "Python", "C++"};
        System.out.print("Integer Array: ");
        print(intArray);
        System.out.print("String Array: ");
        print(strArray);
        Integer i=100;
        System.out.println("Integer Type");
        print(i);
        Double d=123.567;
        System.out.println("Double Type");
        print(d);

    }
}
