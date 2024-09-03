package leetCode;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] char_counts = new int[26];
        for(int i=0; i < s.length(); i++){
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }
        for (int count : char_counts){
            if (count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Boolean ans = solution.isAnagram("zeed","deez");
        System.out.println(ans);
        /*String ok = "dekj";
        String ko = "kjde";
        int[] arr = new int[26];
        for (int i=0; i < ok.length(); i++){
            System.out.println(arr[ok.charAt(i) - 'a']++);
            System.out.println(arr[ko.charAt(i) - 'a']--);
        }*/

    }
}
