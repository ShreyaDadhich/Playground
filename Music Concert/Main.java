#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    static int m, f;
    for(int i=0; i<n; i++){
        int x;
        cin >> x;
        if(x&1) m++;
        else f++;
    }
    cout << m << endl << f << endl;
    return 0;
}