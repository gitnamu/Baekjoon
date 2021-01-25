#include<iostream>
#include<algorithm>

using namespace std;

int dp[100001] = {0, }, arr[100001] = { 0, };

int main() {
	int n, maximum=-1001;
	cin >> n;

	for (int i = 1; i<= n; i++) {
		cin >> arr[i];
	}

	for (int i = 1; i <= n; i++) {
		dp[i] = max(arr[i], dp[i-1] + arr[i]);
		maximum = max(maximum, dp[i]);
	}

	cout << maximum << endl;
}
