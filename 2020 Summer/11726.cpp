#include<iostream>

int arr[1001];

int recur(int n) {
	for (int i = 3; i <= n; i++) {
		arr[i] = arr[i - 1] + arr[i - 2];
		arr[i] %= 10007;
	}
	return arr[n];
}

int main() {
	arr[1] = 1;
	arr[2] = 2;

	int n;
	std::cin >> n;

	std::cout << recur(n) << std::endl;
}