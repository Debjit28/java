public Map<Integer, Integer> frequencyCount(int[] arr) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i < arr.length; ) {
        int first = firstOccurrence(arr, arr[i]);
        int last = lastOccurrence(arr, arr[i]);
        freq.put(arr[i], last - first + 1);
        i = last + 1;
    }
    return freq;
}
