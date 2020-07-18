import java.util.Scanner;
public class Mystery
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      if(n==1)
      {
        System.out.println("1");
        continue;
      }
      int count=2;
      int m=(int)Math.sqrt(n);
      //if(n%m==0) count++;
      for(int i=2;i<=m;i++)
      {
        if(n%i==0) {
          if((n/i)==i) count++;
          else
            count+=2;}
      }
      System.out.println(count);
    }
  }
}
    