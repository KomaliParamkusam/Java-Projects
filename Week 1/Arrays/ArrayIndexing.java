public class ArrayIndexing 
{
    public static void main(String[] args) {
       
        int[] arr = {10, 20, 30, 40, 50};

       
        System.out.println("Element at index 0: " + arr[0]); 
        System.out.println("Element at index 1: " + arr[1]);
        System.out.println("Element at index 2: " + arr[2]);

       
        int baseAddress = 1000; 
        int elementSize = 4; 

        for (int i = 1; i <arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
            int address = baseAddress + (i * elementSize);
            System.out.println("Memory address of arr[" + i + "] = " + address);
            
        }
    }
}

