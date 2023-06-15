import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class program2 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(10);
        t.add(20);
        t.add(30);
        try
        {
            t.add(null);
        }
        catch(NullPointerException e)
        System.out.println("null cannot be inserted");
    }
    System.out.println(t);
}

