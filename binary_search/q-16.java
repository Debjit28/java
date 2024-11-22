public List<int[]> findPairsWithDifference(int[] arr, int k) {
    List<int[]> result = new ArrayList<>();
    int left = 0, right = 1;
    while (right < arr.length) {
        int diff = arr[right] - arr[left];
        if (diff == k) {
            result.add(new int[]{arr[left], arr[right]});
            left++;
            right++;
        } else if (diff < k) right++;
        else left++;
    }
    return result;
}
