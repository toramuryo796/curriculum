class Taiyaki{
  // コンストラクター、受け取った味をいれる
  constructor(taste){
    this.taste = taste;
  }

  //たい焼きの中身を出力するメソッドを作成
  type(){
    console.log(`中身は${this.taste}です`);
  }
}

//各中身のをインスタンス化
let anko = new Taiyaki('あんこ');
let cream = new Taiyaki('クリーム');
let cheese = new Taiyaki('チーズ');

//中身をコンソールに出力
anko.type();
cream.type();
cheese.type();