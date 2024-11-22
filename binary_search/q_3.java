public int firstOccurrence(int[] arr, int target) {
    int low = 0, high = arr.length - 1, result = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            high = mid - 1; // Keep searching in the left half
        } else if (arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }
    return result;
}
