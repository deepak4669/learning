import java.util.Scanner;
import java.util.*;
public class EULER49
{
  static int n=1000000;
  static boolean[] prime=new boolean[n+1];
  static Vector<Integer> ans=new Vector<Integer>();
  static void preprocess()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(n);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=n;j+=i)
        {
          prime[j]=false;
        }
      }
    }
  }
    
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    for(int i=1000;i<=10000;i++)
    {
      if(prime[i]&&prime[i+3330]&&prime[i+6660])
      {
        if(same(i,i+3330,i+6660))
          ans.add(i);
      }
    }
    System.out.println(prime[2969]+" "+prime[6299]+" "+prime[9629]);
    for(int w:ans)
      System.out.println(w);
  }
  static boolean same(int a,int b,int c)
  {
    String s=a+"";
    String t=b+"";
    String u=c+"";
    char[] ch1=s.toCharArray();
    char[] ch2=t.toCharArray();
    char[] ch3=u.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    Arrays.sort(ch3);
    for(int i=0;i<ch1.length;i++)
    {
      if(ch1[i]!=ch2[i]||ch1[i]!=ch3[i])
        return false;
    }
    return true;
  }
}

           
        
      
    