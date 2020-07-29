#include<iostream>
#include<algorithm>

using namespace std;

int dp[10001], arr[10001];

int main() {
	int n, mx = 0, arr[1001], dp[1001] = { 0, };

	cin >> n;
	
	for (int i = 1; i <= n; i++) {
		cin >> arr[i];
	}

	for (int i = 1; i <= n; i++) {
		for (int j = 1; j < i; j++) {
			if (arr[i] > arr[j])
				dp[i] = max(dp[i], dp[j]);
		}
		++dp[i];
		mx = max(dp[i],mx);
	}

	cout << mx;
}
