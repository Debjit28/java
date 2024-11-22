public int countOnes(int[] arr) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) return arr.length - mid;
        else if (arr[mid] == 0) low = mid + 1;
        else high = mid - 1;
    }
    return 0;
}
