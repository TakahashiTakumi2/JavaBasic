package practice07;

import java.security.SecureRandom;

/*
 * PTra07_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_05 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言して、5個の領域を確保してくださいz
		int[] array = new int [5];


		/*
		 * ★ 下記の仕様でfor文を記述してください
		 *
		 * 初期化：変数iを宣言し、0で初期化してください
		 * 条件式：変数iが、arrayの長さ未満である限り繰り返しを行います
		 * 後処理：変数iに1を足して、変数iを上書きしてください
		 */
		//------for start
         for(int i = 0; i<5;i++) {
        	 i +=1;


			// ★ 0～100000の中からランダムで値を取得して、配列arrayのi番目に代入してください
        	 SecureRandom test = new SecureRandom();
        	 int result = test.nextInt(1000000);
        	 String resultStr = result + "";
        	 if (resultStr.length() != 6)
        	     for (int x = resultStr.length(); x < 6; x++) resultStr = "0" + resultStr;
        	 System.out.println(resultStr);

			// ★ 配列arrayのi番目の値を出力してください
        	 



		//------for end
	}
}
}
