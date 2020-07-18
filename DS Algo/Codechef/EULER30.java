import java.util.Scanner;
import java.util.Vector;
public class EULER30
{
  static Vector<Integer> a=new Vector<Integer>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    for(int i=10;i<=295277;i++)      
    {
      if(isFive(i))
      {
        a.add(i);
      }
    }
    long ans=0;
    for(int w:a)
    {
      ans+=w;
    }
    System.out.println(ans);
  }
  public static boolean isFive(int a)
  {
    int k=a;
    int sum=0;
    while(k>0)
    {
      int t=k%10;
      sum+=Math.pow(t,5);
      k/=10;
    }
    if(sum==a) return true;
    else return false;
  }
}
    
      