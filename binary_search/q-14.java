public int divide(int dividend, int divisor) {
    int low = 0, high = Math.abs(dividend), result = 0;
    int sign = (dividend < 0) == (divisor < 0) ? 1 : -1;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (mid * divisor <= dividend) {
            result = mid;
            low = mid + 1;
        } else high = mid - 1;
    }
    return sign * result;
}
