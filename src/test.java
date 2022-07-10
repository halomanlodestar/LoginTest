class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int maxIndex = 0;
        StringBuffer sb = new StringBuffer(strs[0]);
        int j = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            if (sb.charAt(j) == strs[i+1].charAt(j)) {
                maxIndex = j;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] s = {"hlower","hlow","hlight","hello"};
        String L = longestCommonPrefix(s);
        System.out.println(L);
    }
}