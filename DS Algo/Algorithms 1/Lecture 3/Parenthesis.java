public class Parenthesis
{
  private static final char Left_Paren='(';
  private static final char Right_Paren=')';
  private static final char Left_Brace='{';
  private static final char Right_Brace='}';
  private static final char Left_Bracket='[';
  private static final char Right_Bracket=']';
  
  public static boolean isBalanced(String s)
  {
    Stack<Character> stack=new Stack<Character>();
    
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==Left_Paren) stack.push(Left_Paren);
      if(s.charAt(i)==Left_Brace) stack.push(Left_Brace);
      if(s.charAt(i)==Left_Bracket) stack.push(Left_Bracket);
      
      if(s.charAt(i)==Right_Paren){
        if(stack.isEmpty()) return false;
        if(stack.pop()!=Left_Paren) return false;
      }
      else if(s.charAt(i)==Right_Brace){
        if(stack.isEmpty()) return false;
        if(stack.pop()!=Left_Brace) return false;
      }
      else if(s.charAt(i)==Right_Bracket){
        if(stack.isEmpty()) return false;
        if(stack.pop()!=Left_Bracket) return false;
      }
    }
    return stack.isEmpty();
  }
  public static void main(String[] args)
  {
  }
}
      