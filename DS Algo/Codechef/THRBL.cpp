#include <bits/stdc++.h>
using namespace std;

const int N=5*(1e5);
const int k=18;
int table[N][k+1];
int log[N+1];

int main();
{
	int n,m;
	cin>>n>>m;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cint>>arr[i];
	}
	for(int i=0;i<n;i++)
	{
		table[i][0]=arr[i];
	}
	for(int j=1;j<=k;j++)
	{
		for(int i=1;(i+(1<<j))<=n;i++)
			table[i][j]=max(table[i][j-1],table[i+(1<<(j-1))][j-1]);

	}
	int cnt=0;
	log[1]=0;
	for(int i=2;i<=n;i++)
		log[i]=log[i/2]+1;
	for(int i=0;i<m;i++)
	{
		int l,r;
		cin>>l>>r;
		l--;
		int lo=l;
		r-=2;
		int j=log[r-l+1];
		int ans=max(table[l][j],table[r-(1<<j)+1][j]);
		if(ans==arr[lo])
			cnt++;
	}
	cout<<cnt;


	
}

