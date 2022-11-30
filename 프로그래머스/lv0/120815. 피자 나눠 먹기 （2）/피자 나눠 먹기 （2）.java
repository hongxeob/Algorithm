class Solution {
    public static int GCD(int A, int B) { // 최대공약수 구하기
        if (A % B == 0) { // A나누기B의 나머지가 0이면 
            return B; // 최대공약수는 B이다
        }
        return GCD(B, A % B);// 나머지가 있으면 B와 같이 다시 GCD메소드에 넣음(재귀)
    }
    
    public int solution(int n) {
        int answer = 0;
        int gcd = GCD(n, 6); // 매개변수로 들어온 n과 6의 최대공약수
        int lcm = n * 6 / gcd; // 최소공배수(조각수)
        return lcm / 6; // 6조각 이므로 6으로 나눔
    }
}