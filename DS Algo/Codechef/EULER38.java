import java.util.Scanner;
public class EULER38
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=9;
    int ans=0;
    //String ans
    for(int i=1;i<=10000;i++)
    {
      String s=i+"";
      n=9;
      int k=2;
      n-=s.length();
      while(n>0)
      {
        String t=(i*k)+"";
        s=s+t;
        k++;
        n-=t.length();
      }
      if(check(s)&&Integer.parseInt(s)>ans)
      {
        System.out.println(i);
        ans=Integer.parseInt(s);
      }
    }
    System.out.println(ans);
  }
  public static boolean check(String s)
  {
    boolean[] a=new boolean[10];
    if(s.length()!=9) return false;
    else
    {
      for(int i=0;i<9;i++)
      {
        a[Integer.parseInt(s.substring(i,i+1))]=true;
      }
    }
    for(int i=1;i<=9;i++)
    {
      if(!a[i]) return false;
    }
    return true;
  }
}
      

        
      
    