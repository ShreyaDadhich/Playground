#include<bits/stdc++.h>
using namespace std;

int main(){
  string s;
  getline(cin, s);
  static int vowels, consonants, spaces, digits, symbols;
  for(char c: s){
  	if(c == ' ') spaces++;
    else if(c=='a' || c =='e'|| c=='i' || c =='o' || c=='u' ||
            c=='A' || c =='E'|| c=='I' || c =='O' || c=='U') vowels++;
    else if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) consonants++;
    else if('0' <= c && c <= '9') digits++;
    else symbols++;
  }
  cout << "Vowels:" << vowels << endl;
  cout << "Consonants:" << consonants << endl;
  cout << "White Spaces:" << spaces << endl;
  cout << "Digits:" << digits << endl;
  cout << "Symbols:" << symbols << endl;
  return 0;
}
