import java.util.Scanner;
public class Main467B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[m+1];
    for(int i=0;i<(m+1);i++)
    {
      a[i]=sc.nextInt();
    }
    int ans=0;
    for(int i=0;i<m;i++)
    {
      int value=a[i]^a[m];
      int count=Integer.bitCount(value);
      //System.out.println(count);
      if(count<=k)
        ans++;
    }
    System.out.println(ans);
  }
}
      
      
      
                     