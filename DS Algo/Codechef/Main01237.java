import java.util.Scanner;
public class Main01237
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int D=sc.nextInt();
      String[] M=new String[D];
      int[] L=new int[D];
      int[] H=new int[D];
      for(int i=0;i<D;i++)
      {
        M[i]=sc.next();
        L[i]=sc.nextInt();
        H[i]=sc.nextInt();
      }
      int q=sc.nextInt();
      for(int k=0;k<q;k++)
      {
        int p=sc.nextInt();
        int count=0;
        int ans=0;
        for(int i=0;i<D;i++)
        {
          if(L[i]<=p&&p<=H[i])
          {
            ans=i;
            count++;
          }
        }
        if(count==1)
          System.out.println(M[ans]);
        else
          System.out.println("UNDETERMINED");
      }
      if(t>0) System.out.println();
    }
  }
}
                         
      