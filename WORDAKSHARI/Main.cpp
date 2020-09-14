#include<bits/stdc++.h>
using namespace std;
#define n s.length()
int main(){
  string s;
  char last;
  set<string> st;
  int x = 0;
  while(1){
    cin >> s;
    if(s == "####") break;
  	if(x==0) cout << s << endl;
    else {
        char first = s[0];
    	if(last == first && st.count(s) == 0) cout << s << endl;
      	else break;
    }
    st.insert(s);
    last = s[n-1];
    x++;
  }
  return 0;
}
