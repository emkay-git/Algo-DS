public class heapSort

{
    public static int index=0;
    public static int array[]=new int[1000];
    public static void main(String [] arhs)
    {
        int data[]={2,13,5,1,16,7,9,8,12,101,11};
        
        for(int i=0;i<data.length;i++)
        {
           insert(data[i]);
        }
        
       
        
        
        for(int i=0;i<data.length;i++)
        {
            data[i]=deleteRoot();
         
        }
        
        display(data,data.length);
        //deleteRoot();
        
        
    }
    
    public static void display(int array[],int k)
    {
        for(int i=0;i<k;i++)System.out.print(array[i]+" ");
        System.out.println();
    }
     public static int deleteRoot()
    {
        int t=array[0];
        
        array[0]=array[index-1];
        array[index-1]=0;
        index-=1;
        maxHeapify();
       
        return t;
       
    }
    
     public static void maxHeapify()
    {
         int i=0;
        while(array[i]<array[2*i+1]||array[i]<array[2*i+2])
        {
            if(array[i]<array[2*i+1])
            {
             if(array[2*i+1]>array[2*i+2])
             {
                 int temp=array[i];
                 array[i]=array[2*i+1];
                 array[2*i+1]=temp;
                 i=2*i+1;
             }   
             else
             {
                 int temp=array[i];
                 array[i]=array[2*i+2];
                 array[2*i+2]=temp;
                 i=2*i+2;
             }
            }
            else
            {
                 int temp=array[i];
                 array[i]=array[2*i+2];
                 array[2*i+2]=temp;
                 i=2*i+2;
            }
            
         //  display(array);
        }
        
        
        
        
    }
    
    public static void insert(int k)
    {
          array[index]=k;
        int i=index;
      
        while(index!=0&&array[(int)Math.floor((i-1)/2)]<array[i])
        {
            int t=(int)Math.floor((i-1)/2);
            int temp=array[t];
            array[t]=array[i];
            array[i]=temp;
            
            i=t;
        }
        index+=1;
        }
    
}
