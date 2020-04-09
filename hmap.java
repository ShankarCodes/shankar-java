import java.util.HashMap;
import java.util.Map;
import java.math.*;
class hmap
{
    public static void main(String args[])
    {
        HashMap<String,String> mp = new HashMap<String,String>();
        
        mp.put("shankar","meow");
        System.out.println(mp.get("shankar"));
        if(mp.get("shankr")==null)
        System.out.println(mp.get("shanka"));
        BigInteger bg = BigInteger.valueOf(0);
        bg = bg.add(BigInteger.valueOf(1));
        System.out.println(bg.toString());
    }
}