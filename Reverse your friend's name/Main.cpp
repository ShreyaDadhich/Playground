#include<bits/stdc++.h>
using namespace std;

int main(){
    string s,x="";
    getline(cin, s);
    vector<string> a;
    
    for(char c: s){
        if(c==' ') {
            a.push_back(x);
            x = "";
        }
        else x += c;
    }
    if(x.length()) a.push_back(x);
    for(int i=0; i<a.size() ;i++){
        reverse(a[i].begin(), a[i].end());
    }
    for(int i=a.size()-1; i>=0 ; i--){
        cout << a[i] << " ";
    }
    cout << endl;
    return 0;
}
