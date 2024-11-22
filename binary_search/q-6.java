public int findFloor(int[] arr, int target) {
    int low = 0, high = arr.length - 1, floor = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return arr[mid];
        else if (arr[mid] < target) {
            floor = arr[mid];
            low = mid + 1;
        } else high = mid - 1;
    }
    return floor;
}
