#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,n;
    cin >> m >> n;
    vector<vector<int> > a(m, vector<int>(n));
    int sum = 0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            cin >> a[i][j];
            if(i==j || i==0 || i == m-1)sum += a[i][j];
        }
    }
    cout << "Sum of Zig-Zag pattern is " << sum << endl;
    return 0;
}
