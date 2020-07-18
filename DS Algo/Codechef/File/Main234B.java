import java.util.*;
import java.io.*;

public class Main234B
{
  public static class set implements Comparable<set>
  {
    int a;
    int b;
    public set(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(set that)
    {
      if(that.a>this.a) return 1;
      else if(that.a==this.a) return 0;
      else return -1;
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    File in=new File("input.txt");
    Writer wr=new FileWriter("output.txt");
    Scanner sc=new Scanner(in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    set[] a=new set[n];
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      a[i]=new set(x,i);
    }
    Arrays.sort(a);  
    
    
    wr.write(a[k-1].a+"");
    
    wr.write(System.getProperty("line.separator"));
    for(int i=0;i<k;i++)
      wr.write((a[i].b+1)+" ");
    wr.flush();
    wr.close();
  }
}
      
                                         
  