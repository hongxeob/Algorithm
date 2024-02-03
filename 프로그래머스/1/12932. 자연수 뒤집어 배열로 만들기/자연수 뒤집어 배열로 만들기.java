class Solution {
	public int[] solution(long n) {
		String[] arr = String.valueOf(n).split("");

		int[] answer = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			answer[arr.length - 1 - i] = Integer.parseInt(arr[i]);
			System.out.println("answer = " + i + "=" + answer[i]);
		}
		return answer;
	}
}