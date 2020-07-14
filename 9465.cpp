#include <iostream>
#include<algorithm>

using namespace std;

int st[2][100001] = { 0 };
int arr[2][100001] = { 0 };

int main()  {
	int t;
	int n;
	int max = 0;

	cin >> t;

	for(int i=1; i<=t; i++) {
		cin >> n;

		for (int i = 0; i < n; i++) cin >> st[0][i];

		for (int i = 0; i < n; i++) cin >> st[1][i];

		arr[0][0] = st[0][0];
		arr[1][0] = st[1][0];
		arr[0][1] = st[0][1] + arr[1][0];
		arr[1][1] = st[1][1] + arr[0][0];

		for (int i = 2; i < n; i++) {
			arr[0][i] = st[0][i] + std::max(arr[1][i - 1], arr[1][i - 2]);
			arr[1][i] = st[1][i] + std::max(arr[0][i - 1], arr[0][i - 2]);
		}
		cout << std::max(arr[0][n - 1], arr[1][n - 1])<<endl;
	}
}