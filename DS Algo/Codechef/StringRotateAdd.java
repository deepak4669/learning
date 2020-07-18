import java.util.*;
import java.io.*;
import java.lang.*;

public class StringRotateAdd
{
  public static void main(String[] args)
  {
    String s="31";
    int r=1;
    int a=4;
    Queue<String> queue=new LinkedList<String>();
    HashSet<String> marked=new HashSet<String>();
    queue.add(s);
    marked.add(s);
   
    while(queue.size()!=0)
    {
      String v=queue.remove();
     
      String rotated=v.substring(v.length()-r,v.length())+v.substring(0,v.length()-r);
      String added=add(v,a);
     
      if(!marked.contains(rotated))
      {
        queue.add(rotated);
        marked.add(rotated);
      }
      if(!marked.contains(added))
      {
        queue.add(added);
        marked.add(rotated);
      }
    }
    ArrayList<String> unique=new ArrayList<String>();
    for(String w:marked)
      unique.add(w);
    Collections.sort(unique);
    System.out.println(unique.get(0));
  }
  public static String add(String s,int x)
  {
    String s_arr[]=s.split("");
    StringBuilder ans=new StringBuilder();
    for(int i=1;i<s_arr.length;i++)
    {
      if((i&1)!=1)
      {
        int y=Integer.parseInt(s_arr[i]);
        int res=(x+y)%10;
        s_arr[i]=res+"";
      }
      ans.append(s_arr[i]);
    }
    assert ans.length()==s.length();
    return ans.toString();
  }
}
