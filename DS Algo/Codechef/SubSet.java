import java.util.*;
public class SubSet
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int D=sc.nextInt();
    int[] a=new int[M];
    int[] b=new int[M];
    for(int i=0;i<M;i++)
    {
      a[i]=sc.nextInt();
      b[i]=a[i];
    }
    Arrays.sort(b);
    int k=M-N;
    int count=M;
    for(int i=0;i<M;i++)
    {
      if(k>0)
      {
        if(a[i]==a[--count])
        {
          k--;
          continue;
        }
        System.out.print(a[i]+" ");
      }
      else  System.out.print(a[i]+" ");
    }
    System.out.println();
  }
}
    