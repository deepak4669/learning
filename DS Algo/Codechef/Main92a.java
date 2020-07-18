import java.util.Scanner;
public class Main92a
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int ans=0;
    int i=1;
    while(m>0)
    {
      if(i>n) i=1;
      m-=i;
      i++;
    }
    if(m<0)
    {
      ans=(m+(i-1));
    }
      
    System.out.println(ans);
  }
}
      
      
                     