import java.util.Scanner;
public class Main990C2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
    }
    int ans=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        String c=s[i]+s[j];
        if(valid(c))
          ans++;
      }
    }
    System.out.println(ans);
  }
  public static  boolean valid(String s)
  {
    int cnt=0;
    for(int i=0;i<s.length();i++)
    {
      if(cnt<0) return false;
      if(s.charAt(i)=='(') cnt++;
      else cnt--;
    }
    if(cnt==0)
      return true;
    else return false;
  }
}
        
  