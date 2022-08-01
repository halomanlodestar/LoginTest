class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
   }
}