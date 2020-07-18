import java.util.*;
import java.io.*;
public class Main721A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    Vector<Integer> sol=new Vector<Integer>();
    boolean flag=false;
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)=='B')
      {
        count++;
        flag=true;
      }
      else
      {
        if(flag)
        {
          sol.add(count);
          count=0;
          flag=false;
        }
      }
    }
    if(flag)
      sol.add(count);
    System.out.println(sol.size());
    for(int w:sol)
    {
      System.out.print(w+" ");
    }
//    out.flush();
  
  }
}

      