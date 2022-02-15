public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

      
      int temp;
   for (int i = 0; i < args.length; i++)   
        {  
            for (int j = i + 1; j < args.length; j++)   
            {  
                if (args[i] > args[j])   
                {  
                    temp = args[i];  
                    args[i] = args[j];  
                    args[j] = temp;  
                }  
            }  
        }  
       return args[0];  
} 
    }
