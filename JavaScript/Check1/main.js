//問１
console.log("問１");

let numbers = [2, 5, 12, 13, 15, 18, 22];

//回答
for(let i = 0; i < numbers.length; i++){
  if(numbers[i] % 2 === 0){
    isEven(numbers[i]);
  }
}

function isEven(num){
  console.log(num + 'は偶数です');
}


//問２
console.log("問２");
class Car{
  constructor(gass, number){
    this.gass = gass;
    this.number = number;
  }

  getNumGass(){
    console.log(`ガソリンは${this.gass}です。ナンバーは${this.number}です。`);
  }
}

let carA = new Car(20.5, 1234);
carA.getNumGass();