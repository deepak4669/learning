import java.util.Scanner;
public class Main462A
{
  static int n;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
    }
    boolean flag=true;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        int count=0;
        count+=(valid(i,j-1)&&s[i].charAt(j-1)=='o'?1:0)+(valid(i+1,j)&&s[i+1].charAt(j)=='o'?1:0)+
          (valid(i,j+1)&&s[i].charAt(j+1)=='o'?1:0)+(valid(i-1,j)&&s[i-1].charAt(j)=='o'?1:0);
        if(count%2!=0)
        {
          flag=false;
          break;
        }
      }
      if(!flag) break;
      
    }
    if(flag) System.out.println("YES");
    else System.out.println("NO");
  }
  static boolean valid(int i, int j)
  {
    return (0<=i&&i<n)&&(0<=j&&j<n);
  }
    
}
          
      