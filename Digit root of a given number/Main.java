#include <iostream>

using namespace std;

int main()  

{

int number, result;

   cin>>number;

if(number)

 result = number % 9 == 0 ? 9 : number % 9 ;

else  

 result = 0;

cout<<result;

return 0;

}