public int findOddOccurrence(int[] arr) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid + 1]) low = mid + 2;
            else high = mid;
        } else {
            if (arr[mid] == arr[mid - 1]) low = mid + 1;
            else high = mid - 1;
        }
    }
    return arr[low];
}
