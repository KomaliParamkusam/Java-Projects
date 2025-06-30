class StringExample1
{
    
    public static String findLargestCommonPrefix(String[] strings) 
	{
        if (strings == null || strings.length == 0) 
        {
            return "";
        }
        
        String prefix = strings[0];
        
        for (int i = 1; i < strings.length; i++) 
	    {
            while (strings[i].indexOf(prefix) != 0) 	
	        {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        
        return prefix;
    }
    
    public static void main(String[] args) 
    {
        String[] strings = {"flower", "flow", "flight"};
        String largestCommonPrefix = findLargestCommonPrefix(strings);
        System.out.println("The largest common prefix string is: " + largestCommonPrefix);
    }
} 
