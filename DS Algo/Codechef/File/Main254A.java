import java.util.*;
import java.io.*;

public class Main254A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    File in=new File("input.txt");
    //Writer wr=new FileWriter("output.txt");
    out=new PrintWriter(new FileOutputStream("output.txt"));
    Scanner sc=new Scanner(in);
    int n=sc.nextInt();
   
    int[] a=new int[2*n];
    Vector<Integer>[] pos=(Vector<Integer>[]) new Vector[5001];
    for(int i=0;i<5001;i++)
      pos[i]=new Vector<Integer>();
    int k=0;
    for(int i=0;i<2*n;i++)
    {
      int x=sc.nextInt();
      if(pos[x].size()==0)
        a[k++]=x;
      pos[x].add(i+1);
      
    }
    int[] ans=new int[2*n];
    int l=0;
    boolean flag=true;
    for(int i=0;i<k;i++)
    {
      if(pos[a[i]].size()%2!=0)
      {
        flag=false;
        break;
      }
      else
      {
        for(int j:pos[a[i]])
          ans[l++]=j;
      }
    }
    if(!flag)
      out.println(-1+" ");
    else
    {
      for(int i=0;i<2*n-1;i+=2)
      {
        out.println(ans[i]+" "+ans[i+1]);
       //out.println(System.getProperty("line.separator"));
      }
    }
      
          
      
    
    //out.flush();
    out.close();
    
  }
 
}

