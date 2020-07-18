import java.util.*;
import java.io.*;
import java.lang.*;
public class InterviewBit
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
    ArrayList<ArrayList<Integer>> v=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(1);
    a.add(3);
    a.add(5);
    v.add(a);
    a.clear();
    a.add(2);
    a.add(6);
    a.add(9);
    v.add(a);
    a.clear();
    a.add(3);
    a.add(6);
    a.add(9);
    v.add(a);
    
    System.out.println(findMedian(v));
  }
  
    // DO NOT MODIFY THE LIST
    
    static public int findMedian(ArrayList<ArrayList<Integer>> A) {
        
        int min=Integer.MAX_VALUE;
        int max=0;
        
        int mid2=0;
        
        for(int i=0;i<A.size();i++)
        {
            min=Math.min(A.get(i).get(0),min);
            max=Math.max(A.get(i).get(A.get(0).size()-1),max);
        }
        
        int count=(A.size()*A.get(0).size())/2;
        System.out.println(count);
        while(min<=max)
        {
            mid2=min+(max-min)/2;
            System.out.println(mid2);
            int lb=0;
            int ub=0;
            for(int i=0;i<A.size();i++)
            {
                
                int lo=0;
                int hi=A.get(0).size()-1;
                while(lo<hi)
                {
                    int mid=lo+(hi-lo)/2;
                    if(A.get(i).get(mid)>=mid2)
                        hi=mid;
                    else
                        lo=mid+1;
                }
                if(A.get(i).get(lo)>=mid2)
                    lb+=(lo);
                
                    
                lo=0;
                hi=A.get(0).size()-1;
                while(lo<hi)
                {
                    int mid=lo+(hi-lo+1)/2;
                    if(A.get(i).get(mid)>mid2)
                        hi=mid-1;
                    else
                        lo=mid;
                    
                }
                System.out.println(lo);
                if(A.get(i).get(lo)<=mid2)
                {
                  System.out.println(A.get(i).get(lo)+" "+mid2);
                  ub+=(lo)+1;
                }
            }
            
            System.out.println(lb);
            System.out.println(ub+"ub");
            if(count>=lb&&count<=ub)
                return mid2;
            else if(count<lb)
                max=mid2-1;
            else
                min=mid2+1;
            
        }
        return mid2;
        
    
    }

}
