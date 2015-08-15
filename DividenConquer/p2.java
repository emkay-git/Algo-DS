//inversion count problem

public class p2
{
    
    public static int count=0;
    public static void main(String [] arhs)
    {
        int array[]={1,2,3,4,7,8,9,12,13,5,6,10};//{2, 4, 1, 3, 5};
        
        merge(0,array.length-1,array);
        
        for(int x:array)System.out.print(x+" ");
        System.out.println(count);
    }
    
    public static void merge(int a,int b,int array[])
    {
        if(a<b)
        {
            int mid=(a+b)/2;
            merge(a,mid,array);
            merge(mid+1,b,array);
            mergeSort(a,b,mid,array);
        }
    }
    
    public static void mergeSort(int a, int b, int mid,int array[])
    {
       int temp[]=new int[b-a+1];
       
       int i=a;
       int j=mid+1;
       int k=0;
       while(i<=mid&&j<=b)
       {
           if(array[i]>array[j])
           {  temp[k++]=array[j++];  count+=mid-i+1;}
           else
           {
               temp[k++]=array[i++];
           } 
    }
    
    while(i<=mid)
    {
        temp[k++]=array[i++];
       // count+=(b-mid);
 
        
    }
    
    while(j<=b)
    {
        temp[k++]=array[j++];
       // count+=1;
    }
    
    int t=a;
    for( i=0;i<k;i++)
    {
        array[t++]=temp[i];
        
    }
}
}
