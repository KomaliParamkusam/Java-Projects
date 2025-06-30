public class ArrayExample1
 {
    public static void main(String[] args) 
    {
        
        int[] arr1;
        arr1 = new int[5]; 

        int[] arr2 = new int[5]; 

       
        int[] arr3 = {10, 20, 30, 40, 50};

        int[] arr4 = new int[]{5, 15, 25, 35, 45};

        
        int[][] arr5 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    
        int[][] arr6 = new int[3][];
        arr6[0] = new int[]{1, 2};
        arr6[1] = new int[]{3, 4, 5};
        arr6[2] = new int[]{6};

        
        System.out.println("arr1 (Default Initialized): ");
        for (int i=0;i<arr1.length;i++) 
        {
            System.out.print(arr1[i]+ " ");
        }
        System.out.println("\narr2 (Default Initialized): ");
        for (int i=0;i<arr2.length;i++) 
        {
            System.out.print(arr2[i]+ " ");
        }
        System.out.println("\narr3 (Explicit Initialization): ");
        for (int i=0;i<arr3.length;i++) 
        {
            System.out.print(arr3[i]+ " ");
        }
        System.out.println("\narr4 (Explicit Initialization with new): ");
        for (int i=0;i<arr4.length;i++) 
        {
            System.out.print(arr4[i]+ " ");
        }

        System.out.println("\narr5 (Multidimensional Array): ");
        for (int i=0;i<arr5.length;i++) 
        {
            for(int j=0;j<arr5[i].length;j++)
            {
            System.out.print(arr5[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("arr6 (Jagged Array): ");
        for (int i=0;i<arr6.length;i++) 
        {
            for(int j=0;j<arr6[i].length;j++)
            {
            System.out.print(arr6[i][j]+ " ");
            }
            System.out.println();

        }

           
        }
}


