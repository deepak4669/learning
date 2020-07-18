import java.util.Scanner;
import java.util.*;
public class EULER22
{
  static HashMap<Character,Integer> map=new HashMap<Character,Integer>();
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
    String s=sc.next();
    preprocess();
    String[] word=new String[46000];
    int flag=0;
    int lo=1;
    int ro=0;
    int k=0;
    
    for(int i=0;i<s.length();i++)
    {
      
      if(flag==0&&s.charAt(i)=='"')
      {
        lo=i+1;
        flag=1;
      }
      else if(flag==1&&s.charAt(i)=='"')
      {
        ro=i;
        //System.out.println(k++);
        word[k++]=s.substring(lo,ro);
        flag=0;
      }
    }
    Arrays.sort(word,0,k);
    long sum=0;
    //System.out.println(map.get('A'));
    for(int i=1;i<=k;i++)
    {
      sum+=(i*value(word[i-1]));
    }
    System.out.println(sum);
      
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