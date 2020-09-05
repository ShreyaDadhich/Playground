#include <bits/stdc++.h>
using namespace std;
struct Complex {
	int a;
    int b;
};

struct Complex sum(Complex x, Complex y){
	Complex ans;
    ans.a = x.a + y.a;
    ans.b = x.b + y.b;
    return ans;
}
struct Complex sub(Complex x, Complex y){
	Complex ans;
    ans.a = x.a - y.a;
    ans.b = x.b - y.b;
    return ans;
}
struct Complex mult(Complex x, Complex y){
	Complex ans;
    ans.a = x.a*y.a - x.b*y.b;
    ans.b = x.a*y.b + x.b*y.a;
    return ans;
}
int main() 
{
 	int n;
  	cin >> n;
  	Complex x;
    Complex y;
    Complex ans;
    cin >> x.a >> x.b >> y.a >> y.b;
  	switch(n){
      case 1:
        ans = sum(x,y);
        break;
      case 2:
        ans = sub(x,y);
        break;
      case 3:
        ans = mult(x,y);
        break;
      default:
        cout << "Invalid choice";
        return 0;
    }
  	cout << ans.a;
  if(ans.b>0) cout << "+" << ans.b << "i";
  else if(ans.b<0) cout << ans.b << "i";
    return 0;
}