import java.util.*;
public class EULER52
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=1;
    while(true)
    {
      if(same(x,2*x)&&same(x,3*x)&&same(x,4*x)&&same(x,5*x)&&same(x,6*x))
        break;
      x++;
    }
    System.out.println(x);
  }
  public static boolean same(int a,int b)
  {
    String s=a+"";
    String t=b+"";
    char ch1[]=s.toCharArray();
    char ch2[]=t.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    for(int i=0;i<ch1.length;i++)
    {
      if(ch1[i]!=ch2[i])
        return false;
    }
    return true;
  }
          
}

           