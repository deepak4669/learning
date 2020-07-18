import java.util.*;
public class EULER54
{
  static HashMap<Character,Integer> map=new HashMap<Character,Integer>();
  static void preprocess()
  {
    //map.put('1',1);
    map.put('2',2);
    map.put('3',3);
    map.put('4',4);
    map.put('5',5);
    map.put('6',6);
    map.put('7',7);
    map.put('8',8);
    map.put('9',9);
    map.put('T',10);
    map.put('J',11);
    map.put('Q',12);
    map.put('K',13);
    map.put('A',14);
  }
  static int rank(String[] c)
  {
    if(royal_flush(c))
      return 1000;
    else if(straight_flush(c)!=-1)
      return 900+straight_flush(c);
    else if(four_kind(c)!=-1)
      return four_kind(c)+800;
    else if(full_house(c)!=-1)
      return 700+full_house(c);
    else if(flush(c))
      return 600;
    else if(straight(c))
      return 500;
    else if(three_kind(c)!=-1)
      return 400+three_kind(c);
    else if(two_pairs(c)!=-1)
      return 300+two_pairs(c);
    else if(one_pair(c)!=-1)
      return 200+one_pair(c);
    else return 100;
  }
  
  static boolean similar(int[] a,int[] b)
  {
    int[] c=new int[15];
    for(int i=0;i<4;i++)
    {
      if(c[a[i]]>0) return false;
    }
    c=new int[15];
    for(int i=0;i<4;i++)
    {
      if(c[b[i]]>0) return false;
    }
    return true;
  }
    
  
    
    
  
  
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    preprocess();
    int t=sc.nextInt();
    int cnt=0;
    while(t-->0)
    {
      String[] c1=new String[5];
      String[] c2=new String[5];
      int[] a=new int[5];
      int[] b=new int[5];
      for(int i=0;i<5;i++)
      {
        c1[i]=sc.next();
      }
      for(int i=0;i<5;i++)
      {
        c2[i]=sc.next();
      }
      
      
      for(int i=0;i<5;i++)
      {
        a[i]=map.get(c1[i].charAt(0));
        b[i]=map.get(c2[i].charAt(0));
      }
      Arrays.sort(a);
      Arrays.sort(b);
      int r1=rank(c1);
      int r2=rank(c2);
      //System.out.println(r1+" "+r2);
      boolean flag=false;
      if(r1>r2)
      {
        cnt++;
        flag=true;
        //r1++;
        System.out.println(r1+" "+r2+" player1");
        for(int i=0;i<5;i++)
          System.out.print(c1[i]+" ");
        for(int i=0;i<5;i++)
          System.out.print(c2[i]+" ");
        System.out.println();
        
      }
      else if(r1<r2)
        cnt+=0;
      else
      {
        /*
        for(int i=0;i<5;i++)
          System.out.print(c1[i]+" ");
        for(int i=0;i<5;i++)
          System.out.print(c2[i]+" ");
        System.out.println();
        
        if(r1!=100)
          System.out.println("AA==========aaaaaa");
        else
          assert similar(a,b);
        */
        
        for(int i=4;i>=0;i--)
        {
          
          //System.out.println(a[i]+" "+b[i]);
          if(a[i]>b[i])
          {
            cnt++;
            flag=true;
            break;
          }
          else if(a[i]==b[i])
          {
            continue;
          }
          else
          {
            cnt+=0;
            break;
          }
        }
        /*
        if(flag)
      System.out.println(r1+" "+r2+" player1");
      else
        System.out.println(r1+" "+r2+" player2");
        */
      }
      /*
      if(flag)
      System.out.println(r1+" "+r2+" player1");
      else
        System.out.println(r1+" "+r2+" player2");
        */
    }
      
      
    System.out.println(cnt);
    
      
      
        
        
      
    
  }
  static boolean royal_flush(String[] c)
  {
    if(c[0].substring(1,2).equals(c[1].substring(1,2))&&c[1].substring(1,2).equals(c[2].substring(1,2))
          &&c[2].substring(1,2).equals(c[3].substring(1,2))&&c[3].substring(1,2).equals(c[4].substring(1,2)))
    {
      int t=0;
      int k=0;
      int a=0;
      int q=0;
      int j=0;
      for(int i=0;i<5;i++)
      {
        if(c[i].charAt(0)=='T')
          t++;
        else if(c[i].charAt(0)=='K')
          k++;
        else if(c[i].charAt(0)=='Q')
          q++;
        else if(c[i].charAt(0)=='J')
          j++;
        else if(c[i].charAt(0)=='A')
          a++;
      }
      if(t==1&&q==1&&a==1&&j==1&&k==1)
        return true;
      else
        return false;
    }
    return false;
  }
  static int straight_flush(String[] c)
  {
     if(c[0].substring(1,2).equals(c[1].substring(1,2))&&c[1].substring(1,2).equals(c[2].substring(1,2))
          &&c[2].substring(1,2).equals(c[3].substring(1,2))&&c[3].substring(1,2).equals(c[4].substring(1,2)))
     {
       int[] a=new int[5];
       for(int i=0;i<5;i++)
       {
         char ch=c[i].charAt(0);
         a[i]=map.get(ch);
       }
       Arrays.sort(a);
       boolean flag=true;
       for(int i=1;i<5;i++)
       {
         //System.out.println(a[i]);
         if(a[i]!=a[i-1]+1)
           flag=false;
       }
       if(flag) return a[4];
       else return -1;
     }
     return -1;
  }
  static int four_kind(String[] c)
  {
    int[] a=new int[15];
    for(int i=0;i<5;i++)
    {
      char ch=c[i].charAt(0);
      a[map.get(ch)]++;
    }
    for(int i=0;i<15;i++)
    {
      if(a[i]==4)
        return i+1;
    }
    return -1;
  }
  static int full_house(String[] c)
  {
    int[] a=new int[15];
    for(int i=0;i<5;i++)
    {
      char ch=c[i].charAt(0);
      a[map.get(ch)]++;
    }
    for(int i=0;i<15;i++)
    {
      if(a[i]==3)
      {
        for(int j=0;j<15;j++)
        {
          if(a[j]==2)
            return i+1;
        }
        return -1;
      }
    }
    return -1;
  }
  static boolean flush(String[] c)
  {
     if(c[0].substring(1,2).equals(c[1].substring(1,2))&&c[1].substring(1,2).equals(c[2].substring(1,2))
          &&c[2].substring(1,2).equals(c[3].substring(1,2))&&c[3].substring(1,2).equals(c[4].substring(1,2)))
       return true;
     return false;
  }
  static boolean straight(String[] c)
  {
    int[] a=new int[5];
    for(int i=0;i<5;i++)
    {
      a[i]=map.get(c[i].charAt(0));
    }
    Arrays.sort(a);
    for(int i=1;i<5;i++)
    {
      if(a[i]!=a[i-1]+1)
        return false;
      
    }
    return true;
  }
  static int three_kind(String[] c)
  {
    int[] a=new int[15];
    for(int i=0;i<5;i++)
    {
      a[map.get(c[i].charAt(0))]++;
    }
    for(int i=0;i<15;i++)
    {
      if(a[i]==3)
        return i+1;
    }
    return -1;
  }
  static int two_pairs(String[] c)
  {
    int[] a=new int[15];
    for(int i=0;i<5;i++)
    {
      a[map.get(c[i].charAt(0))]++;
    }
    for(int i=0;i<15;i++)
    {
      if(a[i]==2)
      {
        for(int j=0;j<15;j++)
        {
          if(i!=j&&a[j]==2)
            return i>j?i+1:j+1;
        }
        return -1;
      }
    }
    return -1;
  }
  static int one_pair(String[] c)
  {
    int[] a=new int[15];
    for(int i=0;i<5;i++)
    {
      a[map.get(c[i].charAt(0))]++;
    }
    for(int i=0;i<15;i++)
    {
      if(a[i]==2)
        return i+1;
    }
    return -1;
  }
}
      
      
    
    
             
       
    
                                                                                   
  