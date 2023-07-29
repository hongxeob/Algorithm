class Solution {
    public String decodeString(String s) {
    StringBuilder result = new StringBuilder();
    Stack<Integer> countStack = new Stack<>();
    Stack<String> resultStack = new Stack<>();
    int index = 0;
    while (index < s.length()) {
      if (Character.isDigit(s.charAt(index))) { // (1)
        int count = 0;
        while (Character.isDigit(s.charAt(index))) {
          count = 10 * count + (s.charAt(index) - '0');
          index++;
        }
        countStack.push(count);
      } else if (s.charAt(index) == '[') { // (2)
        resultStack.push(result.toString());
        result = new StringBuilder();
        index++;
      } else if (s.charAt(index) == ']') { // (3)
        StringBuilder temp = new StringBuilder(resultStack.pop());
        int repeatTimes = countStack.pop();
        temp.append(result.toString().repeat(Math.max(0, repeatTimes)));
        result = new StringBuilder(temp.toString());
        index++;
      } else { // (4)
        result.append(s.charAt(index));
        index++;
      }
    }
    return result.toString();
  }
}