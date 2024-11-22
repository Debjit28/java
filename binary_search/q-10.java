public int findMissingTerm(int[] arr) {
    int low = 0, high = arr.length - 1;
    int diff = (arr[high] - arr[low]) / arr.length;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == arr[0] + mid * diff) low = mid + 1;
        else high = mid;
    }
    return arr[0] + low * diff;
}
