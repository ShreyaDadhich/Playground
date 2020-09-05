#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,n;
    cin >> m >> n;
    vector<vector<int> > a(m, vector<int>(n));
    for(int i=0; i<m; i++){
        int sum = 0;
        for(int j=0; j<n; j++){
            cin >> a[i][j];
            sum += a[i][j];
        }
        cout << sum << endl;
    }
    
    return 0;
}