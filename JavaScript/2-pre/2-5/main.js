let btn = document.getElementById('btn');
let box = document.getElementById('box');

//ボタンが押されたらアラートを出す
btn.addEventListener('click', function(){
  btn.style.color = 'red';
}, false);

//ボタンが押されたらアラートを出す
btn.addEventListener('click', function(){
  alert('ボタンが押されました');
}, false);