import java.util.*;

class WildcardLowerBound 
{
   
    public static void addNumbers(List<? super Double> list) 
    {
        list.add(10.9);
        list.add(20.6);
        System.out.println("Updated List: " + list);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        numList.add(3);
        numList.add(12);
        addNumbers(numList);
    }
}

