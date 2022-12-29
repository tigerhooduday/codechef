#include <iostream>
using namespace std;

int main() {
	int numberOftestcase;
    cin >>numberOftestcase;
    while(numberOftestcase>0)
    {
        int num, num1, year;
        cin>>num>>num1>>year;
        cout<<(num1-num)/year<<endl;
        numberOftestcase--;
    }
	return 0;
}
