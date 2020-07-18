import java.util.*;
public class MiniMax
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long[] a=new long[5];
    for(int i=0;i<5;i++)
      a[i]=sc.nextLong();
    Arrays.sort(a);
    long sum1=a[0]+a[1]+a[2]+a[3];
    long sum2=a[1]+a[2]+a[3]+a[4];
    System.out.println(sum1+" "+sum2);
  }
}
    
      
  