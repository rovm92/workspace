"use strict"

var arr =['홍길동','임꺽정','유관순','안중근','윤봉길']
var functionList =[];

for (var i = 0; i < arr.length; i++) {
  functionList[i] =function(){
    console.log(i);
    console.log(arr[i]);
  }
}
console.log(i);
functionList[0]();
console.log(i);
functionList[1]();
functionList[2]();
functionList[3]();
functionList[4]();
