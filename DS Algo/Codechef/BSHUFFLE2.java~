import java.util.Scanner;
import java.util.*;
public class BSHUFFLE2
{
  static HashMap<String,Integer> map=new HashMap<String,Integer>();
  static int[] a;
  static int n;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    map.clear();
    n=sc.nextInt();
    a=new int[n+1];
    for(int i=1;i<=n;i++)
      a[i]=i;
    backtrack(1);
    String ans1="";
    String ans2="";
    int max=0;
    int min=1000000;
      
    for(Map.Entry<String,Integer> entry:map.entrySet())
    {
      //System.out.println(entry.getKey()+" "+entry.getValue());
                           
      if(entry.getValue()>max)
      {
        max=entry.getValue();
        ans1=entry.getKey();
      }
      if(entry.getValue()<min)
      {
        min=entry.getValue();
        ans2=entry.getKey();
      }
      
    }
    char ch1[]=ans1.toCharArray();
    char ch2[]=ans2.toCharArray();
    for(int i=0;i<n;i++)
      System.out.print(ch1[i]+" ");
    System.out.println();
    for(int i=0;i<n;i++)
      System.out.print(ch2[i]+" ");
  
      
        
  }
  public static void backtrack(int x)
  {
    if(x==n)
    {
      for(int i=1;i<=n;i++)
      {
        exch(i,n);
        String s="";
        for(int j=1;j<=n;j++)
          s+=a[j]+"";
        
        if(!map.containsKey(s))
          map.put(s,1);
        else
          map.put(s,map.get(s)+1);
        exch(n,i);
      }
    }
    else
    {
      for(int i=1;i<=n;i++)
      {
        exch(i,x);
        backtrack(x+1);
        exch(x,i);
      }
    }
  }
  public static void exch(int i, int j)
  {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
    
   
    
    
  