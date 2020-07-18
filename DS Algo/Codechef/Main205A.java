import java.util.Scanner;
public class Main205A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int min=1000000001;
    int count=0;
    int ans=0;
    //if(n==1)
    //{
      
    for(int i=1;i<=n;i++)
    {
      int value=sc.nextInt();
      if(value<min)
      {
        min=value;
        count=1;
        ans=i;
      }
      else if(value==min)
      {
        count++;
      }
    }
    if(count>1)
      System.out.println("Still Rozdil");
    else
      System.out.println(ans);
  }
}
        
        
        
    
                      