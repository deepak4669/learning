import java.util.Scanner;
import java.util.Arrays;
public class EULER232
{
  static int[] sum=new int[15001];
  static boolean[] abundant=new boolean[15001];
  static boolean[] sumTwo=new boolean[30001];
  public static void preprocess()
  {
    Arrays.fill(sum,1);
    Arrays.fill(abundant,false);
    Arrays.fill(sumTwo,false);
    sum[0]=0;
    sum[1]=0;
    for(int i=2;i<=15000;i++)
    {
      for(int j=2*i;j<=15000;j+=i)
      {
        sum[j]+=i;
      }
    }
    for(int i=2;i<=15000;i++)
    {
      if(sum[i]>i) abundant[i]=true;
    }
    for(int i=2;i<=15000;i++)
    {
      if(abundant[i])
      {
        for(int j=2;j<=i;j++)
        {
          if(abundant[j])
          {
            sumTwo[i+j]=true;
          }
        }
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int sumi=0;
    for(int i=1;i<=28123;i++)
    {
      if(sumTwo[i]==false)
      {
        sumi+=i;
      }
    }
    System.out.println(sumi);
  }
}