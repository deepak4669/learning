import java.util.*;
import java.io.*;
import java.lang.*;

public class INFIXTOPOSTFIX
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s=sc.next();
      Stack<Character> stack=new Stack<Character>();
      StringBuilder ans=new StringBuilder();
      int val[]=new int[128];
      
      val[(int)'+']=1;
      val[(int)'-']=1;
      val[(int)'*']=2;
      val[(int)'/']=2;
      val[(int)'^']=3;
      
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(Character.isLetterOrDigit(c))
          ans.append(c);
        else if(c=='(')
          stack.push(c);
        else if(c==')')
        {
          while(stack.size()!=0&&stack.peek()!='(')
            ans.append(stack.pop());
          stack.pop();
        }
        else
        {
          while(stack.size()!=0&&stack.peek()!='('&&val[(int)stack.peek()]>=val[(int)c])
            ans.append(stack.pop());
          stack.push(c);
        }
      }
      while(stack.size()!=0)
      {
        ans.append(stack.pop());
      }
      System.out.println(ans);
    }
  }
}
          
     