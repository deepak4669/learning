import java.util.Scanner;
public class Main550A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    boolean flag=true;
    int v=s.indexOf("AB");
    int l=s.lastIndexOf("AB");
    int w=s.indexOf("BA");
    int r=s.lastIndexOf("BA");
    if(v!=-1&&w!=-1)
    {
      if(Math.abs(v-w)==1)
      {
        if(v!=l&&w==r&&(w+1)==l||v==l&&w!=r&&r==(v+1)||v==l&&w==r)
          flag=false;
      }
    }
    else
      flag=false;
      
    if(!flag)
      System.out.println("NO");
    else
      System.out.println("YES");
  }
}
  
        