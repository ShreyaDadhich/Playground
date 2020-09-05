#include<bits/stdc++.h>
using namespace std;

int main(){
    string s,x="";
    cin >> s;
    int i=0;
    for(i; i<s.length(); i++){
        if(s[i] == '.') break;
    }
    i++;
    for(i; i<s.length(); i++){
        x += s[i];
    }
    cout << "Floating part is : " << x << endl;
    return 0;
}