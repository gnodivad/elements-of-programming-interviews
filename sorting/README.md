# Chapter 14: Sorting

- [x] 14.1 ComputeIntersection
- [x] 14.2 MergeSorted
- [ ] 14.3 RemoveFirstNameDuplicates
- [ ] 14.4 RenderCalendar
- [ ] 14.5 MergeIntervals
- [ ] 14.6 ComputeUnion
- [ ] 14.7 PartitionSortRepeats
- [ ] 14.8 TeamPhotoDay
- [ ] 14.9 ImplementFastSorting
- [ ] 14.10 ComputeSalaryThreshold

## ComputeIntersection

- Iterate through the first array.
  - For each item, search second array. Continue to next item when the number of second array greater than current item.

```(java)
public class ComputeIntersection {

    public static List<Integer> intersection(List<Integer> A, List<Integer> B) {

        List<Integer> intersections = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size() && B.get(j) <= A.get(i); j++) {
                if (A.get(i) === B.get(j)) {
                    intersections.add(A.get(i));
                }
            }
        }

        return intersections;
    }
}
```

**Syntax Error**

- Should use `==` instead of `===` for comparison.

**Logic Error**

- The solution should keep track for the last encounter item that exist in both array. Otherwise, it will keep push the same item to intersections array.

## 14.2 MERGE TWO SORTED ARRAYS

Input: Two sorted arrays(`A` and `B`) and two int that denotes existing total item in array(`m` and `n`)
Output: One sorted arrays

**Logic**

1. Declare two variable that points to last element of each array and another one variable points to the expected last element position in first array.
2. Iterate two arrays by using the pointer
   1. If first pointer is larger than second pointer, persist the item in the expected last element position in first array.
   2. Else, persist the item of second pointer to expected last element position in second array.

```java
public static void merge(List<Integer> A, int m, List<Integer> B, int n) {
  int firstArrayPosition = m - 1;
  int secondArrayPosition = n - 1;
  int lastItemPosition = m + n - 1;

  while (lastItemPosition >= 0) {
    if (firstArrayPosition < 0) {
      A.add(lastItemPosition, B.get(secondArrayPosition));
      secondArrayPosition--;
    } else if (secondArrayPosition < 0) {
      A.add(lastItemPosition, A.get(firstArrayPosition));
      firstArrayPosition--;
    } else {
      if (A.get(firstArrayPosition) > B.get(secondArrayPosition)) {
        A.add(lastItemPosition, A.get(firstArrayPosition));
        firstArrayPosition--;
      } else {
        A.add(lastItemPosition, B.get(secondArrayPosition));
        secondArrayPosition--;
      }
    }
  }
}
```

Time Complexity: O(m + n)
