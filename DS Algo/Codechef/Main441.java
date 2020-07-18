import java.util.Scanner;
public class Main441
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int b=0;
    while(true)
    {
      int n=sc.nextInt();
      if(n==0)
        break;
      if(b>=1) System.out.println();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=0;i<n-5;i++)
      {
        for(int j=i+1;j<n-4;j++)
        {
          for(int k=j+1;k<n-3;k++)
          {
            for(int l=k+1;l<n-2;l++)
            {
              for(int m=l+1;m<n-1;m++)
              {
                for(int p=m+1;p<n;p++)
                {
                  System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+a[m]+" "+a[p]);
                }
              }
            }
          }
        }
      }
      b++;
    }
  }
}
                        