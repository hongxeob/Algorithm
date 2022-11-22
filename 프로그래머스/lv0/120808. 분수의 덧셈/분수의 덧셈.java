class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int [2];
        //분모
        int num = num1*num2;
        //분자
        int denum = denum1*num2+denum2*num1;
        
        int max=Math.max(num,denum);
        int min=Math.min(num,denum);
        
        //최대공약수(유클리드 호제법)
        //int a,int b 나머지=r 
        //while(b!=0){
        // int r = a%b;
        // a = b;
        // b = r;
        // }
        while(min!=0){
            int gcd = max % min;
            max = min;
            min = gcd;
        }
        
        answer[0] = denum/max;
        answer[1] = num/max;
        
        return answer;
    }
}