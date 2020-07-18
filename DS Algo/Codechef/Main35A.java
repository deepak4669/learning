import java.util.*;
import java.io.*;

public class Main35A
{
  public static void main(String[] args) throws IOException
  {
    File in=new File("input.txt");
    Writer wr=new FileWriter("output.txt");
    Scanner sc=new Scanner(in);
    int x=sc.nextInt();
    for(int i=0;i<3;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a==x)
        x=b;
      else if(b==x)
        x=a;
    }
    //System.out.println(x);
    wr.write(x+"");
    //wr.write("eew");
    wr.write(System.getProperty("line.separator"));
    wr.flush();
    wr.close();
  }
}
        
    