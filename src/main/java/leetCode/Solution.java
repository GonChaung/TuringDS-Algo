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

    public int getLucky(String s, int k) {
        StringBuilder numericalRepresentation = new StringBuilder();
        for (char c : s.toCharArray()){
            numericalRepresentation.append(c - 'a'+1);
        }

        s = numericalRepresentation.toString();
        while (k-- > 0){
            int sum = 0;
            for (char c : s.toCharArray()){
                sum += c - '0';
            }
            s = String.valueOf(sum);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        /*Boolean ans = solution.isAnagram("zeed","deez");
        System.out.println(ans);*/
        /*String ok = "dekj";
        String ko = "kjde";
        int[] arr = new int[26];
        for (int i=0; i < ok.length(); i++){
            System.out.println(arr[ok.charAt(i) - 'a']++);
            System.out.println(arr[ko.charAt(i) - 'a']--);
        }*/
        int ans = solution.getLucky("a",1);
        System.out.println(ans);

    }
}
// 1 2 3 4 5 6 7 8 9
// a b c d e f g h i