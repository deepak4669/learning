import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class SBANK
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      String[] s=new String[n];
      sc.nextLine();
      for(int i=0;i<n;i++)
        s[i]=sc.nextLine();
      Arrays.sort(s);
      HashMap<String,Integer> map=new HashMap<String,Integer>();
      for(int i=0;i<n;i++)
      {
        //System.out.println(s[i]);
        if(map.containsKey(s[i])) map.put(s[i],map.get(s[i])+1);
        else map.put(s[i],1);
      }
      for(int i=0;i<n;)
      {
        System.out.println(s[i]+" "+map.get(s[i]));
        i+=map.get(s[i]);
      }
    }
  }
}
        
          