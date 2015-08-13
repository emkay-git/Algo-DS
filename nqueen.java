public class nqueen
{
    public static void main(String [] arhs)
    {
        int array[]=new int[8];
        for(int i=0;i<8;i++)
array[i]=-10;
     
        queen(0,array);
       
       for(int i=0;i<array.length;i++)
       System.out.print(array[i]+" ");
        
    }
    
    
    public static boolean isSafe(int k,int array[])
    {
       // boolean returntrue;
        for(int i=0;i<array.length;i++)
        {
           if(i!=k)
                
            {
           
                if(i+array[i]==k+array[k]) //right diagonal
                return false;
                
                if(i-array[i]==k-array[k]) //left diagonal
                return false;
                
                if(array[k]==array[i])   // row check
                return false;
                
                
            }
        }
        
        
        return true;
    }
    
    public static boolean queen(int k,int array[])
    {
        if(k==array.length) return true;
        
        for(int i=0;i<array.length;i++)
        {
            array[k]=i;
            if(isSafe(k,array))
            {
               if(queen(k+1,array)) return true;
            }
            array[k]=-10;
            
        }
        
        return false;
    }

}
