import java.util.Scanner;
public class ABSYS
{
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    //sc.nextLine();
    while(t-->0)
    {
      String a=sc.next();
      String plus=sc.next();
      String b=sc.next();
      String equal=sc.next();
      String c=sc.next();
      if(!isNumeric(a))
      {
        int B=Integer.parseInt(b);
        int C=Integer.parseInt(c);
        int A=C-B;
        System.out.println(A+" "+"+"+" "+B+" "+"="+" "+C);
        continue;
      }
      else if(!isNumeric(b))
      {
        int A=Integer.parseInt(a);
        int C=Integer.parseInt(c);
        int B=C-A;
        System.out.println(A+" "+"+"+" "+B+" "+"="+" "+C);
        continue;
      }
      else if(!isNumeric(c))
      {
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        int C=A+B;
        System.out.println(A+" "+"+"+" "+B+" "+"="+" "+C);
        continue;
      }
    }
  }
  public static boolean isNumeric(String str)
  {
    for(char ch:str.toCharArray())
    {
      if(!Character.isDigit(ch)) return false;
    }
    return true;
  }
}
        
      