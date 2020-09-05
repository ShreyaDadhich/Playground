#include <bits/stdc++.h>
using namespace std;
bool fun(string s){
    int count = 0;
    string a="";
    for(char c: s){
        if(c == ' '){
            count ++;
            a = "";
        }
        else a += c;
    }
    if(a.length()) count++;
    if(count <=10) return true;
    return false;
}
int main(){
    string s;
    getline(cin, s);
    bool eligible = fun(s);
    if(eligible) cout << "Caption eligible for the contest\n";
    else cout << "Caption not eligible for the contest\n";
    return 0;
}