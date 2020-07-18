import java.util.Scanner;
import java.util.Arrays;
public class LAPIN
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s=sc.next();
      if(s.length()%2==0)
      {
        char[] ch=new char[s.length()/2];
        ch=s.substring(0,s.length()/2).toCharArray();
        Arrays.sort(ch);
        char[] ch2=new char[s.length()/2];
        ch2=s.substring(s.length()/2,s.length()).toCharArray();
        Arrays.sort(ch2);
        boolean flag=true;
        for(int i=0;i<s.length()/2;i++)
        {
          if(ch[i]!=ch2[i])
          {
            flag=false;
            break;
          }
        }
        if(flag)
          System.out.println("YES");
        else
          System.out.println("NO");
      }
      else
      {
        char ch[]=new char[s.length()/2];
        ch=s.substring(0,s.length()/2).toCharArray();
        Arrays.sort(ch);
        char[] ch2=new char[s.length()/2];
        ch2=s.substring((s.length()/2)+1,s.length()).toCharArray();
        Arrays.sort(ch2);
        boolean flag=true;
        for(int i=0;i<s.length()/2;i++)
        {
          if(ch[i]!=ch2[i])
          {
            flag=false;
            break;
          }
        }
        if(flag)
          System.out.println("YES");
        else
          System.out.println("NO");
      }
    }
  }
}
           
          
          
        