import java.util.Scanner;
public class PANGRAM
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    char[] a=new char[t];
    String s=sc.next();
    if(t<26) System.out.println("NO");
    else
    {
      a[0]=Character.toLowerCase(s.charAt(0));
      int k=1;
      int count=1;
      for(int i=1;i<t;i++)
      {
        char ch=Character.toLowerCase(s.charAt(i));
        if(!find(ch,a,k)){ count++;
          a[k++]=ch;}
      }
      if(count==26) System.out.println("YES");
      else System.out.println("NO");
    }
  }
  public static boolean find(char ch, char[] a,int k)
  {
    for(int i=0;i<k;i++)
      if(a[i]==ch) return true;
    return false;
  }
}
        
    
      
     