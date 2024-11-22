public int findSmallestMissing(int[] arr) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == mid) low = mid + 1;
        else high = mid - 1;
    }
    return low;
}
