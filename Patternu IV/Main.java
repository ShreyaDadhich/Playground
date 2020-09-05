#include <iostream>
using namespace std;
int main() {
    int n;
  	cin >> n;
  	for(int i=1; i<=n; i++){
        int start = i;
        if(start%2 == 0) start++;
        cout << start;
        for(int j=2; j<n; j++){
            cout << i;
        }
        int end = i;
        if(i%2!=0) end++;
        cout << end << endl;
    }
    return 0;
}