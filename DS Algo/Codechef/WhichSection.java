import java.util.*;
public class WhichSection
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      int m=sc.nextInt();
      int[] a=new int[m];
      for(int i=0;i<m;i++)
      {
        a[i]=sc.nextInt();
      }
      int ans=0;
      for(int i=0;i<m;i++)
      {
        k=k-a[i];
        if(k<=0){
          ans=i+1;
          break;
        }
      }
      System.out.println(ans);
    }
  }
}

        
        
      