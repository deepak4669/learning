import java.util.Scanner;
public class EULERX
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int n=sc.nextInt();
    int sum=0;
    int k=0;
    wh
    while(sum<=n)
    {
      if(prime[k])
        sum+=k;
      k++;
    }
    System.out.println(sum);
      
  }
  static int n=1000000;
  static boolean prime=new boolean[n+1];
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
          prime[j]=false;
      }
    }
  }