import java.util.*;
public class InfixToPostFix
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0)
    {
      String s=sc.nextLine();
      String res="";
      Stack<Character> stack=new Stack<Character>();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
          stack.push(s.charAt(i));
        else if(ch==')') res+=stack.pop();
        else if(ch=='(') res+="";
        else res+=s.charAt(i);
      }
      System.out.println(res);
    }
  }
}
        