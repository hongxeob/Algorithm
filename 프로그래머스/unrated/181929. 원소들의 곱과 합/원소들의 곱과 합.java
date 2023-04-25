class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gob=1;
        int ze=0;
        for(int i=0; i<num_list.length; i++){
            gob *= num_list[i];
            ze +=num_list[i];
        }
        
        return gob<(ze*ze)?1:0;
    }
}