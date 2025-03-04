import java.util.*;
class arraylist 
{
    public static void main(String a[])
    {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2.2);
        al.add("Ram");
        al.add('D');
        al.add("kanha");
        al.add(34);
        al.add("krishna");
        al.add(67);
        al.add(89);
        al.add("rinki");

        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
 
    
}
