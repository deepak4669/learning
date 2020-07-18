import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
public class EULER222
{
  static HashMap<Character,Integer> map=new HashMap<Character,Integer>();
  static HashMap<String,Integer> map2=new HashMap<String,Integer>();
  public static void preprocess()
  {
    int k=1;
    for(int i=65;i<=90;i++)
    {
      map.put((char)i,k);
      //System.out.println((char)i);
      k++;
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int n=sc.nextInt();
    String[] s=new String[n];
    int[] res=new int[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
      //res[i]=(i+1)*value(s[i]);
      //map2.put(s[i],res[i]);
      //System.out.println(res[i]);
      
    }
    Arrays.sort(s);
    for(int i=0;i<n;i++)
    {
      int val=(i+1)*value(s[i]);
      map2.put(s[i],val);
    }
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      String word=sc.next();
      System.out.println(map2.get(word));
    }
    
  }
  public static int value(String s)
  {
    int result=0;
    for(int i=0;i<s.length();i++)
    {
      if(map.containsKey(s.charAt(i)))
        result+=map.get(s.charAt(i));
    }
    return result;
  }
}
    