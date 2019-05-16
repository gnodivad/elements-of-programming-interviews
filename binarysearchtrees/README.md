# Chapter 15: Binary Search Trees

- [x] 15.1 IsBST ✅1
- [ ] 15.2 FirstGreaterThan
- [ ] 15.3 FindKLargest
- [ ] 15.4 ComputeLCA
- [ ] 15.5 ReconstructBST
- [ ] 15.6 ClosestEntries
- [ ] 15.7 EnumerateEntries
- [ ] 15.8 MostVisitedPages
- [ ] 15.9 MinimumHeightBST
- [ ] 15.10 InsertionAndDeletionBST
- [ ] 15.11 AreNodesOrdered
- [ ] 15.12 RangeLookup
- [ ] 15.13 ClientCreditsInfo

## 15.1 IsBST

INPUT: Node object
Output: Boolean

**Logic**

1. Do a recursion on all the node of the tree.

- return `true` if current node is null or left and right node is empty.
- return `false` if current node is less than left node.
- return `false` if current node is greater than right node.
- Do `OR` operation on the recursion result of left node and right node.
