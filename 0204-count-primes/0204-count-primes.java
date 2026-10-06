class Solution {

    public boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countPrimes(int n) {

        int count = 0;

        if (n <= 2) {
            return 0;
        }

        count = 1; // 2 is prime

        for (int i = 3; i < n; i += 2) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }
}