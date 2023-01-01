const fs = require('fs');
const inputData = fs.readFileSync(0,'utf8').toString().trim().split(' ').map(Number) //[2,1,2,1,2,1]

const blackNum = [1,1,2,2,2,8]

const result = blackNum.map((ele,idx) => ele - inputData[idx]); //blackNum 각 요소에서 inputData값의 요소들을 빼줌.
//console.log(result); [ -1, 0, 0, 1, 0, 7 ]
console.log(result.join(' ')) // 출력값이 띄어쓰기로 구분 되어 있으므로 join을 이용하여 출력함. -1 0 0 1 0 7