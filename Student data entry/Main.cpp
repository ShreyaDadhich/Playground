#include <bits/stdc++.h>
using namespace std;
struct Student{
	string name;
  	string roll;
  	string marks;
};
int main() {
    Student s;
  	getline(cin, s.name);
  	getline(cin, s.roll);
    getline(cin, s.marks);
  cout << "\nStudent Details" << endl;
    cout << "Name: " << s.name << endl;
    cout << "Roll: " << s.roll << endl;
    cout << "Marks: " << s.marks;
    return 0;
}
