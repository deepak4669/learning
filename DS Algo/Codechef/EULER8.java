import java.util.Scanner;
public class EULER8
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      String s=sc.next();
      long max=0;
      for(int i=0;i<n-k;i++)
      {
        long value=1;
        for(int j=i;j<=i+k-1;j++)
        {
          value*=Integer.parseInt(s.substring(j,j+1));
        }
        if(value>max) max=value;
      }
      System.out.println(max);
    }
  }
}
  
      
      
                     