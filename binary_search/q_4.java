public int countOccurrences(int[] arr, int target) {
    int first = firstOccurrence(arr, target);
    int last = lastOccurrence(arr, target);
    if (first == -1) return 0;
    return last - first + 1;
}
