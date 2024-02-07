import java.util.*;
class Solution {
	public String[] solution(String[] strings, int n) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			//맨앞에 붙여준다.
			list.add(strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(list);

		String[] answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).substring(1);
		}
		return answer;
	}
}
