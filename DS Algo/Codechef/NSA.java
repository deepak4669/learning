import java.util.Scanner;
public class NSA
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s=sc.next();
      
      int min=1000000000;
      for(int i=0;i<s.length();i++)
      {
        char ch[]=s.toCharArray();
        for(int j=97;j<=122;j++)
        {
          int x=Math.abs(ch[i]-j);
          ch[i]=(char)j;
          //System.out.println(ch[i]);
          int y=0;
          for(int k=0;k<s.length();k++)
          {
            for(int l=k;l<s.length();l++)
            {
              if(k<l&&ch[k]<ch[l])
              {
                System.out.println(ch[k]);
                y++;
              }
            }
          }
          if((x+y)<min) {
            //System.out.println(ch[i]+"d");
            //System.out.println(y);
            min=x+y;}
        }
      }
      System.out.println(min);
    }
  }
}