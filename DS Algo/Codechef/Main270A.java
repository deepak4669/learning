import java.util.Scanner;
public class Main270A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      boolean ans=true;
      int i=3;
      while(true)
      {
        if(((i-2)*180)%i!=0){i++;continue;}
        int angle=((i-2)*180)/i;
        if(angle==n) break;
        else if(angle>n){
          ans=false;
          break;
        }
        i++;
      }
      if(ans) System.out.println("YES");
      else System.out.println("NO");
    }
  }
}
          
            
