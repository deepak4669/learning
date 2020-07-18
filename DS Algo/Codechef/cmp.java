public class Solution2 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public class element implements Comparable<element>
    {
        String s;
        public element(String s)
        {
            this.s=s;
            
        }
        public int compareTo(element that)
        {
            boolean flag=true;
            for(int i=0;i<Math.min(that.s.length(),this.s.length());i++)
            {
                int a=Integer.parseInt(this.s.substring(i,i+1));
                int b=Integer.parseInt(that.s.substring(i,i+1));
                if(a>b) return +1;
                else if(a<b) return -1;
                
            }
            if(this.s.length()<that.s.length()){
                int c=compare(this.s,that.s);
                return c;
            }
            else if(this.s.length()>that.s.length())
            {
                int c=compare(that.s,this.s);
                if(c==-1) return +1;
                else if(c==0) return 0;
                else return -1;
            }
            else
            {
                return 0;
            }
            
        }
        public int compare(String s, String t)
        {
            assert s.length()<t.length();
            int in=s.length();
            int p=Integer.parseInt(s.substring(in-1,in));
            for(int i=in;i<t.length();i++)
            {
                int q=Integer.parseInt(t.substring(i,i+1));
                if(p<q)
                    return -1;
                else if(p>q) return +1;
                
                    
            }
            return 0;
        }
    }
    public String largestNumber(final List<Integer> A) {
        element[] a=new element[A.size()];
        int sum=0;
        for(int i=0;i<A.size();i++)
        {
            a[i]=new element(A.get(i)+"");
            sum+=A.get(i);
            
        }
        if(sum==0) return 0+"";
        else
        {
            Arrays.sort(a);
            String final_ans="";
            for(int i=a.length-1;i>=0;i--)
            {
                final_ans+=a[i].s;
            }
            return final_ans;
        }
    }
}
