public List<Integer> findKClosest(int[] arr, int target, int k) {
    int low = 0, high = arr.length - 1;
    while (high - low >= k) {
        if (Math.abs(arr[low] - target) > Math.abs(arr[high] - target)) low++;
        else high--;
    }
    return Arrays.stream(arr, low, high + 1).boxed().collect(Collectors.toList());
}
