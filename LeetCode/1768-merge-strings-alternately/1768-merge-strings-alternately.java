class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str ="";
       int n = word1.length();
        int m = word2.length();
        int i =0;
        int j=0;
        while(i<n || j<m){
            if(i<n)
                str += word1.charAt(i++);
            if(j<m)
                str+=word2.charAt(j++);
        }
        return str;
    }
}