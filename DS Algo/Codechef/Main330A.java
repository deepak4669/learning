import java.util.Scanner;
public class Main330A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int row=0;
    int col=0;
    String[] s=new String[n];
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    for(int i=0;i<n;i++)
    {
      int val=0;
      for(int j=0;j<m;j++)
      {
        if(s[i].charAt(j)=='S')
          val++;
      }
      if(val>1) val=1;
      row+=val;
    }
    for(int i=0;i<m;i++)
    {
      int val=0;
      for(int j=0;j<n;j++)
      {
        if(s[j].charAt(i)=='S')
          val++;
      }
      if(val>1) val=1;
      col+=val;
    }
    int ans=(n-row)*m+(m-col)*n-(n-row)*(m-col);
    System.out.println(ans);
    

        
          
        
    
  }
}
        
      
  