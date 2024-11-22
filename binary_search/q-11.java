public int findFloorRecursive(int[] arr, int low, int high, int target) {
    if (low > high) return -1;
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) return arr[mid];
    if (arr[mid] > target) return findFloorRecursive(arr, low, mid - 1, target);
    int floor = findFloorRecursive(arr, mid + 1, high, target);
    return (floor == -1) ? arr[mid] : floor;
}
