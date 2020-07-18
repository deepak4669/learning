import java.util.Scanner;
import java.util.HashMap;
public class EULER
{
  static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    int maxN=0;
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
        continue;
      
      else
      {
        int prev=0;
        int count=0;
        int x=1;
        map.clear();
        map.put(1,i);
        while(true)
        {
          int v=x%i;
          //System.out.println(i);
          //System.out.println(v);
          if(v==0) break;
          if(v!=x)
          {
            if(map.containsKey(v)) break;
            x=v;
            map.put(v,i);
            count++;
            
          }
          x*=10;
          prev=v;
        }
        if(count>max){
          max=count;
          maxN=i;
        }
      }
    }
    System.out.println(maxN);
  }
}

    
          
          
          
          
        