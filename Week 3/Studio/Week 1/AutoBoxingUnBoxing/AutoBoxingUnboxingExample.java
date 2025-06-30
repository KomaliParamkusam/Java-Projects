public class AutoBoxingUnboxingExample
{
    public static void main(String[] args) {

        
        Integer wrappedInt = Integer.valueOf(20);
        Double wrappedDouble = Double.valueOf(5.75);
        System.out.println("Autoboxing  " + wrappedInt + ", " + wrappedDouble);
        int unboxedInt = wrappedInt.intValue();
        double unboxedDouble = wrappedDouble.doubleValue();
        System.out.println("Unboxing : " + unboxedInt + ", " + unboxedDouble);
         int parsedInt = Integer.parseInt("123");
        System.out.println("Parsed Integer from String: " + parsedInt);
        String strValue = wrappedInt.toString();
        System.out.println("Integer to String: " + strValue);
        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println("Comparing num1 and num2: " + (num1==num2)); 
    }
}

