#include<iostream>
#define MOD 10007

using namespace std;

int main() {
	int n = 0, ans = 10;
	cin >> n;
	int arr[2][10];

	for (int i = 0; i < 10; i++) {
		arr[0][i] = 1;
	}

	for (int i = 2; i <= n; i++) {
		ans = 0;
		int row = i % 2;
		for (int j = 0; j <10; j++) {
			int sum=0;
			for (int z = j; z >= 0; z--) {
				sum += (arr[row][z]);
			}
			arr[1 - row][j] = sum % MOD;
			ans = (ans + arr[1 - row][j]) % MOD;
		}
	}

	cout << ans << endl;
}