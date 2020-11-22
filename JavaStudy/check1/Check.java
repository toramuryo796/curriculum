/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3, 1, 2, 7, 5};
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            for (int j = (data.length-1); j > i; j--) { //後ろから見ていく？
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                // 後ろの数字の方が大きい時に、前の数字と入れ替える
                if(data[i] > data[j]){ 
                  int box = data[j]; //入れ替え時に要素の値が変化するため、小さい方の数字を変数boxに代入しておく
                  data[j] = data[i]; //大きい数字が2つある状態
                  data[i] = box; //大きい数字に小さい数字を代入する。
                }
            }
        }

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}