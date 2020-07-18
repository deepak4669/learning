import java.util.Scanner;
public class Main358A
{
  public static class points
  {
    int xmin,xmax;
    public points(int a,int b)
    {
      if(a<b){
        xmin=a;
        xmax=b;
      }
      else
      {
        xmin=b;
        xmax=a;
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<=2)
      System.out.println("no");
    else
    {
      int k=0;
      points[] a=new points[n];
      int x=sc.nextInt();
      int y=sc.nextInt();
      a[k++]=new points(x,y);
      for(int i=0;i<(n-2);i++)
      {
        x=sc.nextInt();
        a[k++]=new points(x,y);
        y=x;
      }
      boolean flag=false;
      for(int i=1;i<k;i++)
      {
        for(int j=0;j<i;j++)
        {
          if(a[i].xmin<a[j].xmin&&(a[i].xmax>a[j].xmin&&a[i].xmax<a[j].xmax)||
             (a[i].xmin>a[j].xmin&&a[i].xmin<a[j].xmax)&&a[i].xmax>a[j].xmax)
          {
            flag=true;
            break;
          }
        }
        if(flag) break;
        
      }
      if(flag)
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}
      
      
    
      