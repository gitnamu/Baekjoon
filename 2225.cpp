#include<iostream>
#include<algorithm>

using namespace std;

int dp[2][201] = { 0, };

int main() {
	int n, k;
	cin >> n >> k;

	for (int i = 0; i <= n; i++) {
		dp[1][i] = 1;
	}
	for (int i = 2; i <= k; i++) {
		int line = i % 2, line_1 = (i+1)%2;
		for (int j = 0; j <= n; j++) {
			int count = 0;
			for (int z = 0; z <= j; z++) {
				count += dp[line_1][z];
				count %= 1000000000;
			}
			dp[line][j] = count;
		}
	}

	cout << dp[k%2][n]<<endl;
}
