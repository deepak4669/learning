import java.util.Scanner;
public class GradingStudents
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] res=new int[n];
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      if(a<38)
      {
        res[i]=a;
      }
      else
      {
        if(a%5>=3)
          res[i]=(a+(5-a%5));
        else res[i]=a;
      }
    }
    for(int i=0;i<n;i++)
      System.out.println(res[i]);
  }
}
                     
   