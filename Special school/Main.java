#include<bits/stdc++.h>
using namespace std;
int main(){
  string a, b;
  cin >> a >> b;
  reverse(a.begin(), a.end());
  if(a==b) cout << "It is correct" << endl;
  else cout << "It is wrong" << endl;
  return 0;
}