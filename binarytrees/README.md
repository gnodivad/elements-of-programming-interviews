# Chapter 10: Binary Trees

- [x] 10.1 IsHeightBalanced ✅1
- [ ] 10.2 IsSymmetric
- [ ] 10.3 ComputeLowestCommonAncestor
- [x] 10.4 ComputeLCAWithParent ✅1
- [ ] 10.5 SumRootToLeaf
- [ ] 10.6 FindRootToLeafSum
- [ ] 10.7 InorderIterative
- [ ] 10.8 PreorderIterative
- [ ] 10.9 ComputeKthNodeInorder
- [ ] 10.10 ComputeSuccessor
- [ ] 10.11 ImplementInorderSpaceEfficient
- [ ] 10.12 ReconstructBinaryTree
- [ ] 10.13 ReconstructBinaryTreeWithMarkers
- [ ] 10.14 TreeToLinkedList
- [ ] 10.15 ComputeExterior
- [ ] 10.16 ComputeRightSiblingTree
- [ ] 10.17 LockingBinaryTree

## 7.2 COMPUTE THE LCA WHEN NODES HAVE PARENT POINTERS

Input: Two nodes from the binary tree, node0 and node1
Output: Parent node for both of the node

**Logic**

1. Define the function that calculate the depth for the node.
2. Calculate the depth for two node.
3. Iterate through the binary tree
   1. Do the compare for each iteration.
   2. If same, that is the LCA
   3. If not the same, navigate the node that have largest depth to the parent.

```java
public static BinaryTreeParent<Integer> LCA(BinaryTreeParent<Integer> node0, BinaryTreeParent<Integer> node1)
{
    int node0Depth = depth(node0);
    int node1Depth = depth(node1);
    BinaryTreeParent<Integer> firstPointer = node0;
    BinaryTreeParent<Integer> secondPointer = node1;

    while(node0Depth >= 0 && node1Depth >= 0) {
        if(firstPointer == secondPointer) {
            return firstPointer;
        }

        if(node0Depth > node1Depth) {
            firstPointer = firstPointer.parent;
            node0Depth--;
        } else {
            secondPointer = secondPointer.parent;
            node1Depth--;
        }
    }

    return null;
}

public static int depth(BinaryTreeParent<Integer> node)
{
    int depth = 0;
    while(node.parent != null) {
        depth++;
        node = node.parent;
    }

    return depth;
}
```
