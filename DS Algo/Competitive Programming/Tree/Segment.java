public class Segment
{
	public class SegmentTree
	{
		int n;
		int[] t;
		public SegmentTree(int[] a,int n)
		{
			this.n=n;
			t=new int[4*n];
			build(a,1,0,a.length-1);
		}
		private void build(int[] a,int v,int tl,int tr)
		{
			if(tl==tr)
			{
				t[v]=a[tl];
			}
			else
			{
				int tm=(tl+tr)/2;
				build(a,v*2,tl,tm);
				build(a,v*2+1,tm+1,tr);
				t[v]=t[v*2]+t[v*2+1];
			}
		}
		public int sum(int v,int tl,int tr,int l,int r)
		{
			if(l>r) return 0;
			else if(l==tl&&r==tr)
				return t[v];
			int tm=(tl+tr)/2;
			int ans=sum(2*v,tl,tm,l,Math.min(tm,r))+sum(2*v+1,tm+1,tr,Math.max(l,tm+1),r);
			return ans;
		}
		public void update(int v,int tl,int tr,int pos,int new_val)
		{
			if(tl==tr)
			{
				t[v]=new_val;
			}
			else
			{
				int tm=(tl+tr)/2;
				if(pos<=tm)
				{
					update(2*v,tl,tm,pos,new_val);
				}
				else
				{
					update(2*v+1,tm+1,tr,pos,new_val);
				}
				t[v]=t[2*v]+t[2*v+1];
			}
		}
	}
}