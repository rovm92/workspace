"use strict"

//학생의 이름 및 학생정보
var scores = [
  ['홍길동1',100,100,100,300,100],
  ['홍길동2',90,90,90,270,90],
  ['홍길동3',80,80,80,240,80],
  ['홍길동4',70,70,70,210,70],
  ['홍길동5',60,60,60,180,60]
]

console.log("홍길동3의 총점은?", scores[2][4]);
console.log('-----------------------');

var scores2=[
  {name: '홍길동', kor: 100, eng: 100, math: 100, sum: 300, avg: 100},
  {name: '홍길동2', kor: 90, eng: 90, math: 90, sum: 270, avg: 90},
  {name: '홍길동3', kor: 80, eng: 80, math: 80, sum: 240, avg: 80},
  {name: '홍길동4', kor: 70, eng: 70, math: 70, sum: 210, avg: 70},
  {name: '홍길동5', kor: 60, eng: 60, math: 60, sum: 180, avg: 60}
]

console.log("홍길동3의 총점은?",scores2[2].sum);