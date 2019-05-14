# Chapter 14: Sorting

- [x] 14.1 ComputeIntersection
- [ ] 14.2 MergeSorted
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
