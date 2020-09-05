#include<bits/stdc++.h>
using namespace std;
struct Employee{
 	string name;
  	string id;
  	int age;
  	string designation;
  	int salary;
};
int main()
{
  Employee emp;
  cout << "Enter name:" << endl;
  cin >> emp.name;
  cout << "Enter ID:" << endl;
  cin >> emp.id;
  cout << "Enter age:" << endl;
  cin >> emp.age;
  cout << "Enter designation:" << endl;
  cin >> emp.designation;
  cout << "Enter Salary:" << endl;
  cin >> emp.salary;
  cout << "Employee Details" << endl;
  cout << "Name of the Employee : " << emp.name << endl;
  cout << "ID of the Employee : " << emp.id << endl;
  cout << "Age of the Employee : " << emp.age << endl;
  cout << "Designation of the Employee : " << emp.designation << endl;
  cout << "Salary of the Employee : " << emp.salary << endl;
  return 0;
}