import java.util.Scanner;
public class Main23
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String[] res=new String[t];
    for(int i=0;i<t;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      int k=sc.nextInt();
      int n=sc.nextInt();
      int[][] array=new int[n][2];
      
      for(int j=0;j<n;j++)
      {
        for(int p=0;p<2;p++)
          array[j][p]=sc.nextInt();
      }
      
      res[i]=ans(x,y,k,n,array);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static String ans(int x,int y,int k,int n,int[][] array)
  {
    int d=x-y;
    if(d<=0) return "LuckyChef";
    else
    {
      for(int i=0;i<n;i++)
      {
        if(array[i][1]<=k&&(d)<=array[i][0])
          return "LuckyChef";
      }
      return "UnluckyChef";
    }
  }
}
        
          
    
      