import java.util.Scanner;
public class Main14
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String[] res=new String[1000];
    int a=1;
    int b=1;
    int c=1;
    int i=0;
    while((a!=0||b!=0)||c!=0)
    {
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      
      res[i++]=seq(a,b,c);
    }
    
    for(int j=0;j<i;j++)
    {
      if(res[j]=="0") System.out.println();
      else
        System.out.println(res[j]);
    }
  }
  public static String seq(int a,int b, int c)
  {
    if(a==0&&b==0&&c==0) return "0";
    if((b-a)==(c-b))
    {
      return "AP "+String.valueOf(c+(b-a));
    }
    else
    {
      return "GP "+String.valueOf(c*(c/b));
    }
  }
}