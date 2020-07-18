import java.util.Scanner;
public class Main5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    int res[]=new int[t];
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      int[] l=new int[n];
      int[] r=new int[n];
      for(int j=0;j<n;j++)
        l[j]=sc.nextInt();
      for(int j=0;j<n;j++)
        r[j]=sc.nextInt();
      res[i]=best(l,r);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  
  public static int best(int[] l,int[] r)
  {
    int max=l[0]*r[0];
    int lmax=1;
    int rmax=1;
    for(int i=0;i<l.length;i++)
    {
      if(max<l[i]*r[i]||(r[i]>r[rmax-1]&&max==l[i]*r[i]))
      {
        max=l[i]*r[i];
        rmax=i+1;
        lmax=i+1;
      }
      
    }
    return rmax;
  }
}
        
        