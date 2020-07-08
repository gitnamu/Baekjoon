#include<iostream>

int min(int x, int y);

using namespace std;

int arr[1000001];

int main() {

	int x;
	cin >> x;

	arr[1] = 0;
	for (int i = 2; i <= x; i++) {
		arr[i] = arr[i - 1] + 1;
		if (i % 2 == 0)	arr[i] = min(arr[i], arr[i / 2] + 1);
		if (i % 3 == 0)	arr[i] = min(arr[i], arr[i / 3] + 1);
	}
	cout << arr[x];
}

int min(int x, int y) {
	if (x < y) return x;
	else return y;
}
