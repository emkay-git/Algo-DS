//find the power of a number in log complexity
public class p1
{
    public static void main(String [] arhs)
    {
        System.out.println(pow(2,11));
    }
    
    
    public static int pow(int a,int b)
    {
        if(b==0) return 1;
        if(b%2==1) return a*pow(a,b/2)*pow(a,b/2);
        else return  pow(a,b/2)*pow(a,b/2);
    }
}
