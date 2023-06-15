//   13/12/2022
public class program3 {
    public static void main(String[] args) {
        int a[]={10,20,30};
        System.out.println(a[2]);
        try {
            {
                System.out.println(a[99]);
            }
        } catch (NullPointerException e)
         {
            System.out.println("handled");
            // TODO: handle exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("handled");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index not present");
        }
    }
}
