import java.util.Scanner;
import java.util.Vector;
public class Main121A
{
  static Vector<String> vec=new Vector<String>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=10;i++)
      generate(i,"");
    
  }
  public static void generate(int size,String s)
  {
    if(size==0)
    {
      vec.add(s);
    }
    else
    {
      generate(size-1,s+"4");
      generate(size+1,s+"7");
    }
  }
}
    
  
    