import java.util.Scanner;
public class EULER39
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int max=0;
    int ans=0;
    for(int p=1;p<=1000;p++)
    {
      int count=0;
      for(int i=1;i<=p;i++)
      {
        for(int j=i;j<=p;j++)
        {
          for(int k=j;k<=p;k++)
          {
            if(i+j+k==p&&i*i+j*j==k*k)
              count++;
          }
        }
      }
      if(count>max)
      {
        max=count;
        ans=p;
      }
    }
    System.out.println(ans);
    
  }
}
          