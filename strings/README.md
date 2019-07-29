# Chapter 7: Strings

- [x] 7.1 InterconvertStringAndInteger ✅1
- [x] 7.2 BaseConversion ✅1
- [ ] 7.3 SpreadsheetColumnEncoding
- [x] 7.4 ReplaceAndRemove ✅1
- [ ] 7.5 PalindromeAlphanumeric
- [ ] 7.6 ReverseWordsInASentence
- [ ] 7.7 ComputeMnemonicsPhoneNumber
- [ ] 7.8 LookAndSayProblem
- [ ] 7.9 RomanToDecimal
- [ ] 7.10 ComputeValidIPAddresses
- [ ] 7.11 StringSinusoidal
- [ ] 7.12 RunLengthEncoding
- [ ] 7.13 FindFirstOccurrenceOfSubstring

## 7.2 BASE CONVERSION

INPUT: String that going to convert, the base for the string, the base that going to convert to.
OUTPUT: String that after convert

**Logic**

1. If target base is other than 10, do the conversion to string base 10.
2. Convert the string base 10 to target base.

```java
public function BaseConversion(String fromString, int fromBase, int toBase) {
    String[] characterMap = [
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    ];

    long base10Integer = 0;
    if (fromBase == 10) {
        base10Integer = (int) fromString;
    } else {
        for (int i = 0; i < convertString.length(); i++) {
            base10Integer += characterMap.indexOf(fromString.charAt(i))\ * Math.pow(fromBase, convertString.length() - i);
        }
    }

    String toString = '';
    while (base10Integer > 0) {
        toString = characterMap[base10Integer / toBase] + toString;
        base10Integer /= toBase;
    }

    return toString;
}
```

**Syntax Error**

1. Wrong initialize for character map array.
2. Wrong way to convert string to integer.
3. Single quote is character and double quote is string.

**Logic Error**

1. Should search in character Map by modulus result instead of division result when convert base 10 to target base.

## 7.4 REPLACE AND REMOVE

Input: An array of character, s and the integer value that indicate the number of character in the character array need to process, k.
Output: An array of character

**Logic**

1. Initialize string builder sb with empty string.
1. Iterate k numbers of character in the s.
   - If character is 'a' or 'b', process it and append it to the result.
   - Else append it to the result.

```java
public function replaceAndRemove(char[] s, int k)
{
    StringBuilder sb = new StringBuilder("");

    for(int i = 0; i < k; i++) {

        if (s[i] == 'a') {
            sb.append("dd");
        } else if (s[i] == 'b') {

        } else {
            sb.append(s[i]);
        }
    }

    return sb.toString();
}
```
