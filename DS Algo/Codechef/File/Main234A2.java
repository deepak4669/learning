import java.util.*;
import java.io.*;
public class Main234A2
{
  public static class set
  {
    int a;
    int b;
    public set(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
  }
  public static void main(String[] args) throws IOException
  {
    File in=new File("input.txt");
    Writer wr=new FileWriter("output.txt");
    Scanner sc=new Scanner(in);
    int n=sc.nextInt();
    
    set[] a=new set[n/2];
    String s=sc.next();
    for(int k=0;k<(n/2);k++)
    {
      if(s.charAt(k)=='R'&&s.charAt((n/2)+k)=='L')
        a[k]=new set((n/2)+k+1,k+1);
      else
        a[k]=new set(k+1,k+1+(n/2));
      
      
      
    }
    
    for(int i=0;i<n/2;i++)
    {
      wr.write(a[i].a+" "+a[i].b);
      wr.write(System.getProperty("line.separator"));
    }
               
    wr.flush();
    wr.close();
  }
}
  
      