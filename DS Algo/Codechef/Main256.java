import java.util.Scanner;
import java.util.Arrays;
public class Main256
{
  static String[][] memo=new String[4][15];
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] k=new int[4];
    for(int n=2;n<=8;n+=2)
    {
      int hi=(int)Math.pow(10,n);
      
      for(int i=0;i<hi;i++)
      {
        int digits=noofdigits(i);
        int numberofZeros=n-digits;
        int a=i%(int)(Math.pow(10,n/2));
        int b=i/(int)(Math.pow(10,n/2));
        if((int)Math.pow((a+b),2)==i)
        {
          //System.out.println(numberofZeros);
          if(numberofZeros>=1){
            char[] ch=new char[numberofZeros];
            Arrays.fill(ch,'0');
            String zeros=new String(ch);
            //System.out.println(zeros+" gg");
            memo[(n/2)-1][k[n/2-1]++]=(zeros+i);
          }
          else
          {
            memo[n/2-1][k[n/2-1]++]=""+i;
          }
        }
      }
    }
      
    while(sc.hasNextInt())
    {
      int n=sc.nextInt();
      for(int i=0;i<k[n/2-1];i++)
        System.out.println(memo[n/2-1][i]);
      
      
    }
    }
  public static int noofdigits(int n)
  {
    int count=0;
    if(n==0) return 1;
    while(n>0)
    {
      n/=10;
      count++;
    }
    return count;
  }
    
}
  