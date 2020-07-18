import java.util.Scanner;
public class EULER111
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[20][20];
    for(int i=0;i<20;i++)
    {
      for(int j=0;j<20;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    long ans=0;
    for(int i=0;i<20;i++)
    {
      long value=1;
      for(int j=0;j<20;j++)
      {
        value=a[i][j];
        boolean flag=false;//right
        for(int k=1;k<=3;k++)
        {
          if(valid(i,j+k))
            value*=a[i][j+k];
          else{
            flag=true;
            break;
          }
        }
        
        if(!flag&&value>ans) ans=value;
        value=a[i][j];
        flag=false;
        for(int k=1;k<=3;k++)//below
        {
          if(valid(i+k,j))
            value*=a[i+k][j];
          else{
            flag=true;
            break;
          }
        }
        if(!flag&&value>ans) ans=value;
        value=a[i][j];
        flag=false;
        for(int k=1;k>=3;k++)//top
        {
          if(valid(i-k,j))
            value*=a[i-k][j];
          else{
            flag=true;
            break;
          }
        }
        if(!flag&&value>ans) ans=value;
        value=a[i][j];
        flag=false;
        for(int k=1;k<=3;k++)//left
        {
          if(valid(i,j-k))
            value*=a[i][j-k];
          else{
            flag=true;
            break;
          }
        }
        if(!flag&&value>ans) ans=value;
        value=a[i][j];
        flag=false;
        for(int k=1;k<=3;k++)//right diagonal
        {
          if(valid(i+k,j+k))
            value*=a[i+k][j+k];
          else{
            flag=true;
            break;
          }
        }
        if(!flag&&value>ans) ans=value;
        value=a[i][j];
        flag=false;
        for(int k=1;k<=3;k++)
        {
          if(valid(i+k,j-k))
            value*=a[i+k][j-k];
          else{
            flag=true;
            break;
          }
        }
        if(!flag&&value>ans) ans=value;
                  
      
      
        
      }
    }
    System.out.println(ans);
  }
  public static boolean valid(int i,int j)
  {
    return 0<=i&&i<=19&&0<=j&&j<=19;
  }
  
}
    