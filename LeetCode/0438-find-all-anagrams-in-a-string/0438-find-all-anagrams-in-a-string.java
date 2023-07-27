class Solution {
    public List<Integer> findAnagrams(String str, String pattern) {
List<Integer> res = new ArrayList<>();

		int[] patternArray = new int[256];
		// 찾을 pattern의 아스키코드값에 해당하는 인덱스로 patternArray[]에 1을 기록
		for (int i = 0; i < pattern.length(); i++) {
			patternArray[pattern.charAt(i)]++;
		}

		// 전체 str에 찾을 pattern이 등장하면 strArray[]에 1을 기록

        // limitCompareIndex 지점 이후부터는 비교대상이 넘치기 때문에 확인할 필요가 없음 
		int limitCompareIndex = str.length() - pattern.length() + 1;
		for (int i = 0; i < limitCompareIndex; i++) {
			int[] strArray = new int[256];
            // str의 0번부터 시작해서 pattern의 길이만큼 계속 체크 한다 
			for (int j = 0; j < pattern.length(); j++) {
				strArray[str.charAt(i + j)]++;
			}
            
            // 이렇게 체크한 배열이 서로 같게 되면 애나그램이라는 이야기므로 인덱스를 list에 저장 
			if (isSame(patternArray, strArray)) {
				res.add(i);
			}
		}

		return res;
	}

    // 주어진 두 배열의 요소가 서로 같은지를 비교
	private static boolean isSame(int[] patternArray, int[] strArray) {
		for (int i = 0; i < patternArray.length; i++) {
			if (patternArray[i] != strArray[i]) {
				return false;
			}
		}
		return true;
	}

}