import java.util.Scanner;
import java.util.Arrays;
public class EULER21
{
  static int[] sum=new int[1000001];
  static boolean[] marked=new boolean[1000001];
  public static void preprocess()
  {
    //Arrays.fill(marked,true);
    //marked[0]=false;
    //marked[1]=false;
    Arrays.fill(sum,1);
    sum[0]=0;
    sum[1]=0;
    int m=(int)Math.sqrt(1000000);
    //System.out.println(sum[2]);
    for(int i=2;i<=1000000;i++)
    {
      for(int j=2*i;j<=1000000;j+=i)
      {
        sum[j]+=i;
      }
    }
  }
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int ans=0;
      //System.out.println(sum[2624]+" "+sum[2924]);
      for(int i=2;i<n;i++)
      {
        //marked[i]=true;
        if(i!=sum[i]&&i==sum[sum[i]])
        {
          //System.out.println(i+" "+sum[i]);
          ans+=i;
        }
      }
      //System.out.println(sum[220]);
      //System.out.println(sum[sum[220]]);
      System.out.println(ans);
    }
  }
}
  
  