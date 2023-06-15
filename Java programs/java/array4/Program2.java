
//to find the count between to 2 element //29-11-22
public class Program2 {
    static int countln(int x[],int start, int end)
    {
        int count=0;
        for(int i=0;i<x.length; i++)
        {
            if(x[i]>=start && x[i]<=end)
            count++;
        }
return count;
    }
    public static void main(String[]args)
    {
        int a[]={1,2,3,4,6,7,8,9};
        int i=countln(a, 3, 7);
        System.out.println(i);
        }
    }

