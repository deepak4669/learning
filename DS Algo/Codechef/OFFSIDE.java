import java.util.Scanner;
import java.util.Arrays;
public class OFFSIDE
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a==0&&b==0) break;
      int[] ar=new int[a];
      int[] br=new int[b];
      for(int i=0;i<a;i++)
        ar[i]=sc.nextInt();
      for(int i=0;i<b;i++)
        br[i]=sc.nextInt();
      Arrays.sort(ar);
      Arrays.sort(br);
      if(ar[0]<br[1]) System.out.println("Y");
      else if(ar[0]>br[1]) System.out.println("N");
      else System.out.println("N");
    }
  }
}
        
        