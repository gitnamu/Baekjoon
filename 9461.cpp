#include<iostream>
#include<algorithm>

using namespace std;

long long int dp[101] = { 0, };

int main() {
	int t, n;
	cin >> t;

	dp[1] = dp[2] = dp[3] = 1;
	dp[4] = 2;
	for (int i = 0; i < t; i++) {
		cin >> n;

		if (dp[n] != 0)	cout << dp[n]<<endl;
		else {
			for (int j = 5; j <= n; j++) {
				dp[j] = dp[j - 1] + dp[j - 5];
			}

			cout << dp[n]<<endl;
		}
	}
}
