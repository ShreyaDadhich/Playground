#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,n;
    cin >> m >> n;
    vector<vector<int> > a(m, vector<int>(n));
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            cin >> a[i][j];
        }
    }
    for(int i=0; i<m; i++){
        cout << *max_element(a[i].begin(), a[i].end()) << endl;
    }
    return 0;
}