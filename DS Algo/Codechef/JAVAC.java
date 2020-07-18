import java.util.Scanner;
public class JAVAC
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    while(sc.hasNextLine())
    {
      String s=sc.nextLine();
      if(Character.isUpperCase(s.charAt(0))||s.charAt(0)=='_'||s.charAt(s.length()-1)=='_')
      {
        System.out.println("Error!");
        continue;
      }
      String r="";
      int i=0;
      boolean java=false;
      boolean c=false;
      for(i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(Character.isLowerCase(ch))
        {
          r+=ch;
        }
        else if(ch=='_')
        {
          
          if(Character.isLowerCase(s.charAt(i+1))&&(!java))
          {
            r+=Character.toUpperCase(s.charAt(i+1));
            i++;
            c=true;
          }
          else{
            System.out.println("Error!");
            break;
          }
        }
        else if(Character.isUpperCase(ch))
        {
          if(!c){
          r+='_';
          r+=Character.toLowerCase(ch);
          java=true;
          }
          else
          {
            System.out.println("Error!");
            break;
          }
        }
      }
      if(i!=s.length()) continue;
      System.out.println(r);
    }
  }
}
        
      