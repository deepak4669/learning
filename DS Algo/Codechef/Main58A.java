import java.util.Scanner;
public class Main58A
{
  static char ch[]={'h','e','l','l','o'};
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int h=1;
    int e=1;
    int l=2;
    int o=1;
    int i=0;
    for(;i<s.length();i++)
    {
      if(s.charAt(i)=='h'){
        h--;
        break;
      }
    }
    for(;i<s.length();i++)
    {
      if(s.charAt(i)=='e')
      {
        e--;
        break;
        
      }
    }
    for(;i<s.length();i++)
    {
      if(s.charAt(i)=='l')
      {
        l--;
        if(l==0)
          break;
      }
    }
    for(;i<s.length();i++)
    {
      if(s.charAt(i)=='o')
      {
        o--;
        break;
      }
    }
    if(h==0&&l==0&&e==0&&o==0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
          
      
           
      
      