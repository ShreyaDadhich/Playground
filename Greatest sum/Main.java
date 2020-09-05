#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,n, row=0, max_sum=INT_MIN, col=0;
    cin >> m >> n;
    vector<vector<int> > a(m, vector<int>(n));
    vector<int> s1, s2;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++)
            cin >> a[i][j];
    }
    for(int i=0; i<m; i++){
        int sum=0;
        for(int j=0; j<n; j++){
            sum += a[i][j];
        }
        if(sum > max_sum){
            max_sum = sum;
            row = i + 1;
        }
        s1.push_back(sum);
    }
    max_sum = INT_MIN;
    for(int i=0; i<n; i++){
        int sum=0;
        for(int j=0; j<m; j++){
            sum += a[j][i];
        }
        if(sum > max_sum){
            max_sum = sum;
            col = i + 1;
        }
        s2.push_back(sum);
    }
    cout << "Sum of rows is ";
    for(int i: s1) cout << i << " ";
    cout << "\nRow " << row <<  " has maximum sum\n";
    cout << "Sum of columns is ";
    for(int i: s2) cout << i << " ";
    cout << "\nColumn " << col << " has maximum sum\n"; 
    return 0;
}