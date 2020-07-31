#include<iostream>
#include<algorithm>

using namespace std;

int dp1[1001] = {0, }, dp2[1001] = { 0, }, arr[1001] = { 0, };

int main() {
	int n, mx=1, k=1;
	cin >> n;

	for (int i = 1; i <= n; i++) {
		cin >> arr[i];
		}

	dp1[1] = 1;
	dp2[n] = 1;

	for (int i = 2; i <= n; i++) {
		for (int j = 1; j < i; j++) {
			if (arr[i] > arr[j]) {
				dp1[i] = max(dp1[i], dp1[j]);
			}
		}
		++dp1[i];
	}
	for (int i = n-1; i >= 1; i--) {
		for (int j = n; j > i; j--) {
			if (arr[i] > arr[j]) {
				dp2[i] = max(dp2[i], dp2[j]);
			}
		}
		++dp2[i];
		mx = max(mx,dp1[i]+dp2[i]-1);
	}

	cout <<mx;
}
