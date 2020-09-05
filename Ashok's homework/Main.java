#include<bits/stdc++.h>
using namespace std;

int main(){
    int r,c;
    cin >> r >> c;
    int matrix1[r][c], matrix2[r][c];
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cin >> matrix1[i][j];
        }
    }
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cin >> matrix2[i][j];
            matrix2[i][j] += matrix1[i][j];
        }
    }
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout << matrix2[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}