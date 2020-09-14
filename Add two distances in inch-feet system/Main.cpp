#include<iostream>
using namespace std;
struct Distance{
	int feet;
 	float inch;
}d1, d2, tot;
int main()
{
  cin >> d1.feet >> d1.inch;
  cin >> d2.feet >> d2.inch;
  tot.feet = d1.feet + d2.feet;
  tot.inch = d1.inch + d2.inch;
  if(tot.inch > 12){
  	tot.feet++;
    tot.inch = tot.inch - 12;
  }
  cout << tot.feet << "\'-" << tot.inch << '\"';
  return 0;
}
