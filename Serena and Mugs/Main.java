#include<iostream>

using namespace std;

int main()

{

 int n,m,a[m];

 cin>>n>>m;

 for(int i=0;i<m;i++)

   cin>>a[i];

 for(int i=0;i<m;i++)

 {

   if(a[i]==1)

   {

     cout<<"YES";

     break;

   }

   

   else

   {

     cout<<"NO";

     break;

   }

 }

}