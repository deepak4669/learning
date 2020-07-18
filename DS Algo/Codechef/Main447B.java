import java.util.Scanner;
import java.util.HashMap;
public class Main447B
{
  static HashMap<Character,Integer> map=new HashMap<Character,Integer>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=sc.nextInt();
    int max=0;
    int k=97;
    for(int i=0;i<26;i++)
    {
      int a=sc.nextInt();
      map.put((char)k,a);
      //System.out.println((char)k);
      k++;
      if(max<a) max=a;
    }
    int ans=0;
    for(int i=1;i<=s.length();i++)
    {
      
      ans+=(i*map.get(s.charAt(i-1)));
    }
    for(int i=s.length()+1;i<=s.length()+n;i++)
    {
      ans+=i*max;
    }
    
    System.out.println(ans);
  }
}
    