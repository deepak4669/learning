import java.util.HashMap;
public class P2
{
  static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
  public static void main(String[] args)
  {
    int N=4000000;
    int i=1;
    int f=fib(1);
    int sum=0;
    while(f<=N)
    {
      f=fib(i);
      
      if(f%2==0) 
      {
        sum+=f;
        System.out.println(f);
      }
      i++;
    }
    System.out.println(sum);
  }
  public static int fib(int n)
  {
    if(map.containsKey(n)) return map.get(n);
    if(n<=2) return 1;
    else
    {
      int res=fib(n-1)+fib(n-2);
      map.put(n,res);
      return res;
    }
  }
     
}

    
      
     