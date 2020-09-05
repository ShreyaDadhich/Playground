#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  	char str1[50];
    char str2[50];
  	cin >> str1;
  	cin >> str2;
  	if(strcmp(str1, str2) == 0) cout << "It is correct" <<endl;
  	else cout << "It is wrong" << endl;
 	return 0;
}