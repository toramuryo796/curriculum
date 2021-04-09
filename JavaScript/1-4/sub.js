//while文 + break
console.log("while文");
let number = 1;
while (number <= 100){
  if(number === 10){
    break;
  }

  console.log(number);
  number ++;
}

//do..while文
console.log("do..while");
number = 1
do{
  console.log(number);
  number ++
} while (number <= 100);

//for文
console.log("for文");
for(let num = 1; num <= 100; num++){
  console.log(num);
}

//while + continue
number = 0;
while(number < 5){
  if(number === 3){
    number ++;
    continue;
  }
  console.log(number);
  number++;
}