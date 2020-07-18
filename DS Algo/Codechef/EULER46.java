import java.util.Scanner;
public class EULER46
{
  static int n=1000000;
  
  static boolean[] prime=new boolean[n+1];
  public static void preprocess()
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
    
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    for(
    