let scores = [50, 60, 70, 80, 90];
console.log(scores);
console.log(scores[2]);
console.log("要素数" + scores.length);

console.log("for文で中身を全て出す");
for(let i = 0; i < scores.length; i++){
  console.log(scores[i]);
}

scores = [80, 90, '百点'];
console.log(scores[2]);

let human = {
  name : 'yamada',
  height : 170, 
  weight : 60,
  gender : '男',
  age : 30
};

console.log(human.name);