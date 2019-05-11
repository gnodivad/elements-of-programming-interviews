# Chapter 13: Hash Tables

- [x] 13.1 PalindromicPermutations ✅1
- [x] 13.2 IsLetterConstructable ✅1
- [ ] 13.3 LRUCache
- [ ] 13.4 ComputeLCA
- [ ] 13.5 ComputeKMostFrequent
- [ ] 13.6 NearestRepeated
- [ ] 13.7 SmallestSubarray
- [ ] 13.8 SmallestSequentialSubarray
- [ ] 13.9 LongestSubarray
- [ ] 13.10 LongestContainedInterval
- [ ] 13.11 ComputeAverageTopThree
- [ ] 13.12 ComputeStringDecompositions
- [ ] 13.13 CollatzConjecture
- [ ] 13.14 HashFunctionChess

## 13.2 IsLetterConstructable

INPUT: a paragraph, and a letter

OUTPUT: boolean

**Logic**

1. Use hash map to count occurrence for each character in paragraph.
2. Iterate through all the character of the letter.
   - Check if character exist in hash map
     - if occurrence more than 0, deduct 1 from the occurrence.
     - if less than or equal to 0, return `false`.
   - Otherwise, return `false`.
3. Return `true` if iterate finish all the character for letter.

```java
public class IsAnonymousLetterConstructible {

    public static boolean isAnonymousLetterConstructible(String paragraph, String letter) {
        Map < Char, Integer > occurrences = new HashMap();

        for (int i = 0; i < paragraph.length; i++) {
            Char char = paragraph[i];
            if (occurrences.containsKey(char)) {
                occurrences.put(char, occurrences.get(char) + 1);
            } else {
                occurrences.put(char, 1)
            }
        }

        for (int i = 0; i < letter.length; i++) {
            Char char = letter[i];

            if (occurrences.containsKey(char)) {
                if (occurrences.get(key) > 0) {
                    occurrences.put(char, occurrences.get(char) - 1);
                    if (occurrences.get(char) == 0) {
                        occurrences.removeKey(char);
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
```

**Syntax Error**

1. Wrong type Char, should be Character.
2. Use char as variable. It is a reserved word in Java.
3. Should invoke length() to get string length instead of length.
4. Should use paragraph.charAt(i) instead access using array syntax.
5. Forget semicolon on second ifelse condition in first loop.
6. Undeclared variable key is used as key to retrieve from hash map.
7. Wrong hash map function, should be remove(key) instead of removeKey(key).

**Logic Error**

1. All the comparision of the char should be done using case insensitive. But this code never take care of that scenario. Compare a uppercase letter with a lowercase letter will cause result as false instead of true.
