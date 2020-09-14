#include<bits/stdc++.h>
using namespace std;

int main(){
    string s, a="";
    getline(cin, s);
    vector<string> word;
    for(int i=0; i<s.length(); i++){
        if(s[i] == ' '){
            word.push_back(a);
            a = "";
        }
        else a += s[i];
    }
    if(a.length()) word.push_back(a);
    for(int i=0; i<word.size(); i++){
        if(word[i] == "The" || word[i] == "the") continue;
        cout << word[i] << " ";
    }
    cout << endl;
    return 0;
}
