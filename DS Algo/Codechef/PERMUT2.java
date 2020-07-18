import java.util.Scanner;
public class PERMUT2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      if(n==0) break;
      int ar[]=new int[n];
      for(int k=0;k<n;k++)
      {
        ar[k]=sc.nextInt();        
      }
      boolean flag=true;
      for(int i=0;i<n;i++)
      {
        int k=find(i+1,ar);
        //System.out.println(k);
        if((k+1)!=ar[i]) {
          flag=false;
          break;
        }
      }
      if(flag) System.out.println("ambiguous");
      else System.out.println("not ambiguous");
    }
  }
  public static int find(int a,int[] ar)
  {
    for(int i=0;i<ar.length;i++)
    {
      if(ar[i]==a) return i;
    }
    return -1;
    
    
  }
  
}
        