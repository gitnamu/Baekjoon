#include<iostream>
#define MOD 1000000000

using namespace std;

int main() {
	int n = 0, ans = 9;
	cin >> n;
	int arr[2][12] = { 0, };

	for (int i = 2; i < 11; i++) {
		arr[0][i] = 1;
	}

	for (int i = 2; i <= n; i++) {
		ans = 0;
		int row = i % 2;
		for (int j = 1; j <11; j++) {
			arr[1 - row][j] = (arr[row][j - 1] + arr[row][j + 1]) % MOD;
			ans = (ans + arr[1 - row][j])%MOD;
		}
	}
	cout << ans << endl;
}