#include<iostream>

using namespace std;

int main() {
	int input = 0;
	cin >> input;

	int arr[1001] = { 0,1,3, };

	for (int i = 3; i <= input; i++) {
		if (i % 2 == 0)	arr[i] = (arr[i - 2] * 4 - 1)%10007;
		else 	arr[i] = (arr[i - 2] * 4 + 1)%10007;
	}
	cout << arr[input];
}