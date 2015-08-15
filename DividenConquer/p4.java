//find the element which occurs ones rest all occures twice.
public class p4
{
    public static void main(String [] arhs)
    {
        int array[]={1, 1, 2, 4, 4, 5, 5, 6, 6};
        
        System.out.println(find(array,0,array.length-1));
        
    }
    
    public static int find(int array[],int i,int j)
    {
        if(i<=j)
        {
            System.out.println(i+" "+j);
          if(i==j) return array[i];
            int mid=(i+j)/2;
          
            
           if(array[mid]==array[mid+1])
           {
               if((j-mid)%2==1)
           return    find(array,i,mid-1);
               else
          return     find(array,mid+2,j);
           }
           else if(array[mid]==array[mid-1])
           {
               if((mid-i)%2==1)
              return  find(array,mid+1,j);
                else
             return   find(array,i,mid-2);
           }
          else return array[mid];
        }
        return -1;
    }
}
