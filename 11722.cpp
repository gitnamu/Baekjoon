#include<iostream>
#include<algorithm>

using namespace std;

int dp[1001] = {0, }, arr[1001] = { 0, };

int main() {
	int n, mx=0, k=1;
	cin >> n;

	for (int i = 1; i <= n; i++) {
		cin >> arr[i];
		}

	dp[1] = arr[1];

	for (int i = 2; i <= n; i++) {
		int kcopy = k;
		if (arr[i] < dp[kcopy])	k++;
			while (dp[kcopy] <= arr[i] && kcopy>0) {
				--kcopy;
			}
		dp[++kcopy] = arr[i];
	}

	cout << k<<endl;
}
