# Chapter 18: Greedy Algorithms and Invariants

- [x] 18.1 ComputeOptimumAssignment ✅1
- [ ] 18.2 ScheduleMinimizedWaitingTime
- [ ] 18.3 IntervalCoveringProblem
- [x] 18.4 ThreeSumProblem ✅1
- [ ] 18.5 FindMajorityElement
- [ ] 18.6 GasUpProblem
- [ ] 18.7 ComputeMaximumWaterTrapped
- [ ] 18.8 ComputeLargestRectangle

## 18.4 THE 3-SUM PROBLEM

INPUT: An array and a number [11,2,5,7,3]
OUTPUT: true/false

**Logic**
Build an hashmap by iterate two times on the array to get 2sum.
Check the number by iterate one more time on the array and compare the substraction of the number and the current number on the array with the hashmap.
