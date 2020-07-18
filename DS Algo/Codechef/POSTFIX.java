import java.util.*;
import java.lang.*;
import java.io.*;

public class POSTFIX
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s=sc.next();
      Stack<Integer> stack=new Stack<Integer>();
      for(int i=0;i<s.length();i++)
      {
        String c=s.substring(i,i+1);
        if(c.equals("+"))
        {
          int b=stack.pop();
          int a=stack.pop();
          int d=a+b;
          stack.push(d);
        }
        else if(c.equals("-"))
        {
          int b=stack.pop();
          int a=stack.pop();
          int d=a-b;
          stack.push(d);
        }
        else if(c.equals("*"))
        {
          int b=stack.pop();
          int a=stack.pop();
          int d=a*b;
          stack.push(d);
        }
        else if(c.equals("/"))
        {
          int b=stack.pop();
          int a=stack.pop();
          int d=a/b;
          stack.push(d);
        }
        else
        {
          stack.push(Integer.parseInt(c));
        }
      }
      System.out.println(stack.pop());
    }
  }
}
            
          
        
      
      