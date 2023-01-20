class Solution {
    public int solution(int[][] sizes) {
        int fnlMax = 0;
        int fnlMin = 0;
        for (int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            fnlMax = Math.max(fnlMax, max);
            fnlMin = Math.max(fnlMin, min);
        }
        return fnlMax * fnlMin;
    }
}