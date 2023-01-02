function solution(numbers) {
  const answer = numbers.reduce(function add(sum, currValue) {
    return sum + currValue;
  }, 0);
  return answer / numbers.length;
}
