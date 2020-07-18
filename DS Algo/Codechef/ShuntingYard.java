import java.util.*;
import java.io.*;
import java.lang.*;

public class ShuntingYard
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s=sc.next();
      
      StringBuilder ans=new StringBuilder();
      Stack<Character> stack=new Stack<Character>();
      int[] val=new int[128];
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
          {
            ans.append(stack.pop());
          }
          stack.pop();
        }
        else
        {
          while(stack.size()!=0&&stack.peek()!='('&&val[stack.peek()]>=val[c])
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
    
        
          
        
    