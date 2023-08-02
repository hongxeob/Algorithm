import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();


        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        for (int i = 0; i < A; i++) {
            int num = sc.nextInt();
            mapA.put(num, 0);
            listA.add(num);
        }

        for (int i = 0; i < B; i++) {
            int num = sc.nextInt();
            mapB.put(num, 0);
            listB.add(num);
        }

        for (int num : listB) {
            if (mapA.containsKey(num)) {
                mapA.remove(num);
            }
        }
        
        for (int num : listA) {
            if (mapB.containsKey(num)) {
                mapB.remove(num);
            }
        }

        System.out.println(mapA.size() + mapB.size());
    }
}
