import javax.security.auth.Subject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n]; // 나누고 곱하다 보면 소수가 생기기 때문에 double
        
        int max = 0; // 가장 큰 값을 가진 위치를 저장하는 변수
        double sum = 0, maxScore; // 평균값을 구할 총합,최대값 변수

        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
            if (arr[i] > arr[max]) // 가장 큰값을 가진 배열 위치를 max에 저장
                max = i;
        }
        maxScore = arr[max]; // 최댓값 배열의 위치를 알려주는 변수를 maxScore로 옮긴다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / maxScore * 100; // 배열 크기만큼 반복하여 배열 전체를 점수/최대점수*100으로 값을 변경
            sum += arr[i]; // 값을 다 더해줘서 총합을 구한다.
        }
        System.out.println(sum / n); // 총합 나누기 점수의 갯수(요솟수) = 평균값
    }
}
