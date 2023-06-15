public class Program1 {
    //find the common element present in array //29-11-22
 public static void main(String[] args) {
    int a[]={10,30,90,50};
    int b[]={30,60,90,100};
    System.out.println("common element are");
    for (int i=0;i<a.length;i++)
    {
        for(int j=0;i<b.length;j++)
        if(a[i]==b[j])
        {
            System.out.println(a[i]);
            break;
        }
    }
    }
}
