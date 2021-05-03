// Humanクラスを作成
class Human{
  // コンストラクタ(yamadaと25の値を受け取るための処理を入力)
  constructor(name, age){
    this.name =  name;
    this.age = age;
  }
}

// Humanクラスをインスタンス化してyamadaを作成
let yamada = new Human('yamada', 25);

// yamadaの名前を取り出す
console.log(yamada.name);

class Human2{
  constructor(name, height, weight,gender, age){
    this.name = name; 
    this.height = height;
    this.weight = weight;
    this.gender = gender;
    this.age = age;
  }
}

//山田オブジェクトを作成
yamada = new Human2('山田', 170, 60, '男', 30 );
//鈴木オブジェクト作成
suzuki = new Human2('鈴木', 180, 70, '女', 35);

console.log(yamada);
console.log(suzuki);

//関数とメソッド
class Person{
  constructor(name, height, weight, gender, age){
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.gender = gender;
    this.age = age;
  }

  //歩くメソッド (class内の関数は'function'がいらない)
  walk(){
    console.log(`身長:${this.height}cm, 体重:${this.weight}kg, 氏名:${this.name}(${this.gender})が歩きました`);
  }
}

//田中オブジェクトを作成
let tanaka = new Person('田中', 172, 70, '男', 25);
tanaka.walk();