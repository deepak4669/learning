import java.util.Scanner;
public class Main17
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=1;
    String[] res=new String[1000];
    int k=0;
    String s;
    while(true)
    {
      n=sc.nextInt();
      s=sc.nextLine();
      if(n==0) break;
      
      res[k++]=ans(n,s);
    }
    for(int i=0;i<k;i++)
      System.out.println(res[i]);
  }
  
  public static String ans(int n,String s)
  {
    int row=s.length()/n;
    System.out.println(s.length());
    System.out.println(row);
    System.out.println(n);
    char[][] ch=new char[row][n];
    int k=0;
    for(int i=0;i<row;i++)
    {
      if(i%2==0)
      {
        for(int j=0;j<n;j++)
        {
          ch[i][j]=s.charAt(k);
          k++;
        }
      }
      else
      {
        for(int j=n-1;j>=0;j--)
        {
          ch[i][j]=s.charAt(k);
          k++;
        }
      }
    }
    k=0;
    char[] mess=new char[row*n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<row;j++)
      {
        mess[k++]=ch[j][i];
      }
    }
    String message=new String(mess);
    return message;
  }
}
    
    