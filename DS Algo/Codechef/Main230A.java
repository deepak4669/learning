import java.util.Scanner;
import java.util.Arrays;
public class Main230A
{
  public static class Dragon implements Comparable<Dragon>
  {
    int x,y;
    public Dragon(int x,int y)
    {
      this.x=x;
      this.y=y;
    }
    public int compareTo(Dragon that)
    {
      if(this.x>that.x) return +1;
      else if(this.x<that.x) return -1;
      else return 0;
    }
  }
      
    
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int n=sc.nextInt();
    Dragon[] a=new Dragon[n];
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      a[i]=new Dragon(x,y);
    }
    Arrays.sort(a);
    boolean flag=true;
    for(int i=0;i<n;i++)
    {
      if(a[i].x>=s){
        flag=false;
        break;
      }
      else{
        s+=a[i].y;
      }
    }
    if(flag) System.out.println("YES");
    else System.out.println("NO");
  }
}
    