document.body.textContent = 'hello';
document.title = 'JavaScript 2-1';

//windowオブジェクトの中身をconsole.logで確認する
console.log(window);

//location.hrefでURLを取得して変数に代入
let url = window.location.href;

//ブラウザを更新するとURLが表示される
console.log(url);

//「Hello world」と表示させる
window.alert('Hello World');