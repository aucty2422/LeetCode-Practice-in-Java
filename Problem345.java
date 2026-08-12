/*
Problem 345: Reverse Vowels of a String

Approach:
1. Convert the given String into a character array because String is immutable in Java.
2. Use two pointers, i at the start and j at the end of the array.
3. If arr[i] is not a vowel, increment i.
4. Else if arr[j] is not a vowel, decrement j.
5. If both arr[i] and arr[j] are vowels, swap them and move both pointers inward.
6. Return the character array converted back into a String.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isVowel(Character m){
        if(m=='a'|| m=='e'||m=='i'|| m=='o'|| m=='u'||m=='A'|| m=='E'||m=='I'|| m=='O'||m=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        
        char[] arr = s.toCharArray();
        while(i<j){
            if(!isVowel(arr[i])) i++;
            else if(!isVowel(arr[j])) j--;
            else{
               char temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
