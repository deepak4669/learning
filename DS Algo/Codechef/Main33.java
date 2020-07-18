import java.util.Scanner;
public class Main33
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String[] res=new String[t];
    for(int i=0;i<t;i++)
    {
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      int x3=sc.nextInt();
      int v1=sc.nextInt();
      int v2=sc.nextInt();
      
      double t1=((double)(x3-x1))/v1;
      double t2=((double)(x2-x3))/v2;
      
      if(t1>t2) res[i]="Kefa";
      else if(t2>t1) res[i]="Chef";
      else res[i]="Draw";
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
}