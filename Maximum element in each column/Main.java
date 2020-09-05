#include<iostream>

using namespace std;


int main()

{

 int r,c,i,j,max=0;

 cin>>r>>c;

 int a[r][c];

 for(i=1;i<=r;i++)

 {

   for(j=1;j<=c;j++)

   {

     cin>>a[i][j];

   }

 }

 for(i =1;i<=c;i++)

 {

   max = a[1][i];

   for(j=1;j<=r;j++)

   {

     if(a[j][i]>=max)

       max = a[j][i];

   }

   cout<<max<<"\n";

 }

}