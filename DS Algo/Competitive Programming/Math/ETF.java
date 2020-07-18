import java.util.*;

public class ETF 
{
  
  //Euler Toutient Function  
  public static int Euler(int n)
  {
    int result=n;
    for(int i=2;i*i<=n;i++)
    {
      if(n%i==0)
      {
        while(n%i==0)
          n/=i;
        result-=result/i;
      }
    }
    if(n>1)
      result-=result/n;
    return result;
  }
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    //for(int i=1;i<=10;i++)
      System.out.println(Euler(12));
  }
  
  
}