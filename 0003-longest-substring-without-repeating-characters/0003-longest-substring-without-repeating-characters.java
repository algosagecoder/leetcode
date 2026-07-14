class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();

        int[] temp = new int[128];
        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++){
            char currChar = arr[right];
            if(temp[currChar] > left){
                left = temp[currChar];
            }
            temp[currChar] = right + 1;
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}