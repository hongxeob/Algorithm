import javax.security.auth.Subject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // 변수 c를 선언하고 값을 입력받아 c에 저장한다.
        int[] arr; // 점수 배열

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt(); // 전체 학생의 수
            arr = new int[n]; // int 형 배열 arr를 n개 만큼 생성한다.
            double sum = 0; // 점수 합계
            // 성적 입력
            for (int j = 0; j < n; j++) {
                int score = sc.nextInt(); // 성적을 입력받아 그 값을 변수 score에 저장한다.
                arr[j] = score; // 변수 score 값을 변수 j에 저장한다.
                sum += score;
            }

            double avg = (sum / n);
            double count = 0; // 평균 넘는 학생 수

            // 평균 넘는 학생 비율
            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) { // 변수 arr[j]가 평균을 넘을 때마다 if문 안의 값이 실행된다.
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / n) * 100); // (count/n)*100한 결과(전체 학생 수 나누기 평균값을 넘는 학생 수) 값을 소수점 3자리까지 출력한다.
            // 소수점 셋째자리까지 출력하기 위해서는 printf() 를 써서 %.3f 으로 출력 포멧을 지정해주어야 한다.
        }
        sc.close();
    }
}
