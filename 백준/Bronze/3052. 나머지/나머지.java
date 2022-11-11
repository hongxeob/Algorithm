import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // 10개의 값을 저장 하는 배열
        int[] brr = new int[10]; // 10개의 값을 42로 나눈 나머지를 저장하는 배열
        int b = 42;
        int cnt = 1; // 무조건 숫자 하나는 있으므로 1로 세팅
        for (int i = 0; i < 10; i++) { // arr배열에 입력을 받아 저장 후, 42로 나눈 나머지를 brr배열에 저장.
            arr[i] = sc.nextInt();
            brr[i] = arr[i] % b;
        }

        Arrays.sort(brr); // 오름차순으로 정렬 (같은 숫자끼리 모으기 위해서)

        // ex) brr[5]={0,1,2,2,3}
        // 오름차순으로 정렬한 brr 배열안의 수들을 비교하여 나머지 값이 서로 다르면 cnt가 증가하는 반복문
        for (int j = 0; j < arr.length - 1; j++) { // Q.length-1 해주는 이유
            if (brr[j] != brr[j + 1]) { // A.마지막으로 비교되는 요소(length-1)는 마지막 요소와 비교해 주면된다.결국 마지막 배열의 값은 뒤에 값이 없어서 비교해줄 수 있는 값이 없다.
                cnt++;
            }
        }
        sc.close();
        System.out.println(cnt);
    }
}
