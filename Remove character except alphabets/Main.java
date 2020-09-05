#include<bits/stdc++.h>
using namespace std;
int main(){
  string s, a="";
  cin >> s;
  for(char c: s){
  	if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) a += c;
  }
  cout << a << endl;
  return 0;
}