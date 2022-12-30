function solution(denum1, num1, denum2, num2) {
  var answer = [];
  let topNum = (denum1 * num2) + (denum2 * num1);
  let downNum = num1 * num2;
  let maxNum = 1;
  for (let i = 1; i <= topNum; i++) {
    if (topNum % i === 0 && downNum % i === 0) {
      maxNum = i;
    }
  }
  return [topNum / maxNum, downNum / maxNum];
}
