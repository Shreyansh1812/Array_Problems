import java.util.*;
public class Pascal_Triangle {
    public static long func(int n,int r)
    {
         long res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
      return res;
    }
    public static void func2(int n)
    {
        long res=1;
        for(int i=1;i<n;i++)
        {
            res=res*(n-i);
            res=res/i;
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
       // System.out.println( func(10, 03));
         func2(6);
         
    }
}
