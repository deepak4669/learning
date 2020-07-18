import java.util.*;
import java.io.*;
import java.lang.*;
public class InterviewBit {
    public static int maxArr(ArrayList<Integer> A) {
        int[] a=new int[A.size()];
        int[] b=new int[A.size()];
        for(int i=0;i<A.size();i++)
        {
            a[i]=(A.get(i)+i);
            System.out.println(a[i]);
            b[i]=(A.get(i)-i);
            System.out.println(b[i]);
        }
        
        
        System.out.println("maxa"+max(a));
        System.out.println("mina"+min(b));
        System.out.println("maxb"+max(b));
        System.out.println("minb"+min(b));
        int max1=(max(a)-min(a));
        int max2=(max(b)-min(b));
        return max1>max2?max1:max2;
    }
    public static int max(int[] a)
    {
        int maxn=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>maxn)
                maxn=a[i];
        }
        return maxn;
    }
    public static int min(int[] a)
    {
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<minn)
                minn=a[i];
        }
        return minn;
    }
    public static void main(String[] args)
    {
      int[] a={-100,-100,-100,-100,-100};
      ArrayList<Integer> A=new ArrayList<Integer>();
      for(int i=0;i<a.length;i++)
        A.add(a[i]);
      System.out.println(maxArr(A));
      
    }
    
}
