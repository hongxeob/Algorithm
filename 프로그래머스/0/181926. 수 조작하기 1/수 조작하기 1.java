class Solution {
	public int solution(int n, String control) {
		String[] arr = control.split("");
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
				case "w" -> {
					n++;
				}
				case "s" -> {
					n--;
				}
				case "d" -> {
					n += 10;
				}
				case "a" -> {
					n -= 10;
				}
			}
		}


		return n;
	}
}
