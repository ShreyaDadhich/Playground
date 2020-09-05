#include<iostream>
using namespace std;
struct College{
	char name[100];
  	char city[100];
  	int establishmentYear;
  	float passPercentage;
};
int main()
{
 	int n;
  	cout << "Enter the number of colleges\n";
 	cin >> n;
    College college[n];
  	for(int i=0; i<n; i++){
    	cout << "Enter the details of college " << i+1 << endl;
      	cout << "Enter name\n";
      	cin >> college[i].name;
      	cout << "Enter city\n";
      	cin >> college[i].city;
      	cout << "Enter year of establishment\n";
      	cin >> college[i].establishmentYear;
      	cout << "Enter pass percentage\n";
      	cin >> college[i].passPercentage;
    }
  	cout << "Details of colleges\n";
  	for(int i=0; i<n; i++){
    	cout << "College:" << i+1 << endl;
      	cout << "Name:" << college[i].name<<endl;
      	cout << "City:" << college[i].city<<endl;
      	cout << "Year of establishment:" << college[i].establishmentYear << endl;
      	cout << "Pass percentage:" << college[i].passPercentage << endl;
    }
}