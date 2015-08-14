//this code is for Max Heap.
//getMax is o(1) the first element;
//deleteMax is o(log n) calls max heapify
//delete key.. first set the value of that index to infinite , then it will reach the root. then call deleteRoot.

//similarly min heap can be implemented
public class heap
{
    public static int array[]=new int[100];
    public static int index=0;
    public static int min=-99999;
    public static void main(String [] arhs)
    {
     
    int array2[]={90,89,70,36,75,63,65,21};//,65,21,18,15,12};
     for(int i=0;i<array2.length;i++)
array[i]=array2[i];
     index=8;
    // insert(72);
    // insert(70);
    // insert(110);
   // deleteRoot();
    deleteKey(3);
     for(int i=0;i<index;i++)
System.out.println(array[i]);
       
    }
    
    
    public static void deleteRoot()
    {
        array[0]=array[index-1];
        array[index-1]=min;
        index-=1;
        maxHeapify();
       
    }
    //k is the index;
   public static void deleteKey(int k)
   {
        array[k]=9999;
        int i=k;
        while(array[(int)Math.floor((i-1)/2)]<array[i])
        {
            int t=(int)Math.floor((i-1)/2);
            int temp=array[t];
            array[t]=array[i];
            array[i]=temp;
            
            i=t;
        }  
        
        deleteRoot();
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
        }
    }
    public static int max()
    {
        return array[0];
    }
    public static void insert(int k)
    {
       
        array[index]=k;
        int i=index;
       index+=1;
        while(array[(int)Math.floor((i-1)/2)]<array[i])
        {
            int t=(int)Math.floor((i-1)/2);
            int temp=array[t];
            array[t]=array[i];
            array[i]=temp;
            
            i=t;
        }
    }
    
    
}
