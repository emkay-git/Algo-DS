//Find the maximum element in an array which is first increasing and then decreasing
public class p3
{
    public static void main(String [] arhs)
    {
        int array[]={8, 10, 20, 80, 7, 4, 3, 2, 1};
        
        System.out.println(searchMax(array,0,array.length-1));
        
        
    }
    
    
    public static int searchMax(int array[], int a,int b)
    {
        if(a<b)
        {
            int mid=(a+b)/2;
            if(b-a==1) return Math.max(array[a],array[b]);
            
           if(array[mid]>array[mid+1])
           return searchMax(array,a,mid);
           
           else return searchMax(array,mid,b);
        }
        
        return -1;
        
        
    }
}
