#include<iostream>

using namespace std;

int main() {
	int n;
	cin >> n;

	long long arr[2][2] = {1,0,};
	long long sum=1;
	for (int i = 2; i < n; i++) {
		sum = 0;
		if (i % 2 == 1) {
			sum+=arr[0][0] = arr[1][0] + arr[1][1];
			sum+=arr[0][1] = arr[1][0];
		}
		else {
			sum+=arr[1][0] = arr[0][0] + arr[0][1];
			sum+=arr[1][1] = arr[0][0];
		}
	}

	cout << sum;
}