package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		for (int i = 1; i <=15; i++) {
			System.out.print("□");
			   if (i==5)
	                System.out.println();
			   if (i==9)
	                System.out.println();
			   if (i==12)
	                System.out.println();
			   if (i==14)
	                System.out.println();

         if(i==5)
        	 System.out.print("■");
         if(i==9)
        	 System.out.print("■"+"■");
         if(i==12)
        	 System.out.print("■"+"■"+"■");
         if(i==14)
        	 System.out.print("■"+"■"+"■"+"■");


         }

    }
}
