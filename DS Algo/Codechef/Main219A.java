import java.util.Scanner;
import java.util.HashMap;
public class Main219A
{
  public static void main(String[] args)
  {
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    String s=sc.next();
    String[] distinct=new String[1000];
    int x=0;
    for(int i=0;i<s.length();i++)
    {
      if(map.containsKey(s.substring(i,i+1)))
      {
        map.put(s.substring(i,i+1),map.get(s.substring(i,i+1))+1);
      }
      else
      {
        distinct[x++]=s.substring(i,i+1);
        map.put(s.substring(i,i+1),1);
      }
    }
    boolean flag=true;
    
    for(int i=0;i<x;i++)
    {
      if(map.get(distinct[i])%k!=0)
      {
        //System.out.println(distinct[i]+" "+map.get(distinct[i]));
        flag=false;
        break;
      }
      else
      {
        map.put(distinct[i],map.get(distinct[i])/k);
      }
    }
    
    if(!flag) System.out.println(-1);
    else
    {
      String B="";
      //System.out.println(x);
      for(int i=0;i<x;i++)
      {
        for(int j=0;j<map.get(distinct[i]);j++)
        {
          B+=distinct[i];
        }
      }
      //System.out.println(B);
      String C="";
      for(int i=0;i<k;i++)
      {
        C=C+B;
      }
      System.out.println(C);
    }
  }
}
        
      
    
    