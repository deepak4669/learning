import java.util.*;
public class EULER421
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
    //Scanner sc=new Scanner(System.in);
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
    int[] score=new int[k];
    int ans=0;
    for(int i=0;i<k;i++)
    {
      score[i]=value(word[i]);
      if(valid(score[i])) ans++;
      
    }
    System.out.println(ans);
    System.out.println(valid(28));

    
  }
  
   public static int value(String s)
  {
    int result=0;
    //System.out.println(s);
    for(int i=0;i<s.length();i++)
    {
      if(map.containsKey(s.charAt(i)))
        result+=map.get(s.charAt(i));
    }
    return result;
  }
   public static boolean valid(int x)
   {
     long hi=1000000;
     long lo=1;
     //x=2*x;
     while(hi>=lo)
     {
       long mid=(hi+lo)/2;
       long f=(mid+mid*mid)/2;
       if(f>x)
         hi=mid-1;
       else if(f<x) lo=mid+1;
       else return true;
     }
     return false;
   }
   public static boolean check2(int x)
   {
     int k=1;
     while(x>0)
     {
       x-=k;
       k++;
     }
     if(x==0) return true;
     else return false;
   }
         
}
    