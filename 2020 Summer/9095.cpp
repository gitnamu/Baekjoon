#include<iostream>

using namespace std;

int main() {
	int input = 0,t=0;
	cin >> t;

	int arr[11] = {0,1,2,4, };

	for (int j = 0; j < t; j++) {
		cin >> input;
		for (int i = 4; i <= input; i++) {
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
		}
		cout << arr[input]<<endl;
	}
}