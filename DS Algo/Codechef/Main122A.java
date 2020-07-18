import java.util.Scanner;
public class Main122A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag=false;
    for(int i=1;i<=1000;i++)
    {
      if(magic(i)&&n%i==0)
      {
        flag=true;
        break;
      }
    }
    if(flag) System.out.println("YES");
    else System.out.println("NO");
  }
  public static boolean magic(int x)
  {
    boolean flag=true;
    while(x>0)
    {
      int v=x%10;
      x/=10;
      if(v==4||v==7)
        continue;
      else{
        flag=false;
        break;
      }
    }
    return flag;
  }
        
      
}
        