import java.util.Scanner;
import java.util.HashMap;
public class Example implements Runnable {
  static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
     public static void main(String[] args) {
         new Thread(null, new Example(), "whatever", 1<<26).start();
     }

     public void run() {
       //dp=new int[1000001];
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=0;
    for(int i=2;i<=n;i++)
    {
      int value=count(i);
      if(value>ans) ans=value;
    }
    System.out.println(ans);
        // Do whatever you want in this function instead of main
     }
     public static int count(int a)
  {
    if(a==1) return 1;
    else if(a==2) return 2;
    else if(map.containsKey(a)){
      return map.get(a);
    }
    
    
    int ans;
    if(a%2==0){
      ans=1+count(a/2);
    }
    else{
      ans=1+count(3*a+1);
    }
    map.put(a,ans);
    return ans;
  }
}