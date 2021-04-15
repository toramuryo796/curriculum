function myfunc(){
  //idがtargetの要素を取得して、変数名changeに代入
  let change = document.getElementById('target');
  
  //textContentを使用し、表示する文字を書き換える
  change.textContent = 'こんにちは';
}

//h1タグ要素を全て取得し、変数にいれる
let elems = document.getElementsByTagName('h1');

console.log(elems[0]);
console.log(elems[1]);

//nameで属性を探す
let boxes = document.getElementsByName('box');
for (let i = 0 ; i < boxes.length ; i++){
  console.log(boxes[i]);
}

//class名から要素を取得する
let boxVer2 = document.getElementsByClassName('box2');
for(let i = 0; i < boxVer2.length; i++){
  console.log(boxVer2[i]);
}
