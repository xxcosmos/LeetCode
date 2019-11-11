package LeetCode.PalinDromicSubstrings;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-11 16:20
 */
public class Solution {
    int count = 0;
    String string = "";

    //    public boolean isPalindromic(String s) {
//        for (int i = 0; i< s.length()/2;i++){
//            if (s.charAt(i) != s.charAt(s.length()-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }
    public int countSubstrings(String s) {
//        int count = 0;
//        for (int i = 0;i< s.length();i++){
//            for (int j = s.length() - 1; j >= i ;j--){
//                if (isPalindromic(s.substring(i,j+1))){
//                    count++;
//                }
//            }
//        }
//
//        return count;
        string = s;
        for (int i = 0; i < s.length(); i++) {
            handle(i, i);
            handle(i, i + 1);
        }
        return count;


    }

    public void handle(int start, int end) {
        while (start >= 0 && end < string.length() && string.charAt(start) == string.charAt(end)) {
            count++;
            start--;
            end++;
        }

    }
}
