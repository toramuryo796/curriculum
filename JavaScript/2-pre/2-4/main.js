// 該当するクラス名の最初の要素のみ
let box = document.querySelector('.box');
console.log(box);

// 該当するid名の最初に見つけたもののみ
let box2 = document.querySelector('#box');
console.log(box2);

// 該当するクラス名の全ての要素
box = document.querySelectorAll('.box');
for(let i = 0; i < box.length; i++){
  console.log(box[i]);
}

//親要素の子要素から取得
let elems = document.querySelectorAll('form > .box');
for (let i = 0; i < elems.length; i++){
  console.log(elems[1]);
}

//inputの中のタイプで取得
let elems2 = document.querySelectorAll('input[type=radio]');
for(let i = 0; i < elems2.length; i++){
  console.log(elems2[i]);
}