class Solution {
public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		String[] arr = String.valueOf(x).split("");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += Integer.parseInt(arr[i]);
			System.out.println(sum);
		}

		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}
	}
}
