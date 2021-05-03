let num1 = 10;
let num2 = 4;
let result;

result = num1 + num2;
console.log(result);

result = num1 - num2;
console.log(result);

result = num1 * num2;
console.log(result);

result = num1 / num2;
console.log(result);

result = num1 % num2;
console.log(result);

let lastName = "田中";
let firstName = "一郎";
let fullName = lastName + firstName;

console.log(fullName);

let x = 10;
let y = 10;
x++;
y--;
console.log(x);
console.log(y);

// 条件分岐
let score = 90;
if(score >= 70){
  console.log('合格');
} else {
  console.log('不合格');
}

score = 60;
if(score >= 70){
  console.log('合格');
} else if(score === 0){
  console.log('0点はまずい');
} else {
  console.log('不合格');
}


//条件の範囲を示す
let a = 15;
// 15~20
if(a >= 10 && a <= 20){
  console.log(a);
}
//偶数奇数
a = 10;
let b = 15;

if(a % 2 === 0){
  console.log(a + 'は偶数');
}

if(b % 2 !== 0){
  console.log(b + 'は奇数');
}