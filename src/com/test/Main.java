package com.test;

/**
 *
 * @author 23653_000
 * @version 创建时间：2017年6月24日 下午8:26:13
 */
public class Main {
	private static int specialNum[] = new int[3];
	private static String word[] = { "Fizz", "Buzz", "Whizz" };

	public Main(int a,int b, int c) {
		// TODO Auto-generated constructor stub
		specialNum[0] = a;
		specialNum[1] = b;
		specialNum[2] = c;
	}
	public void countOff() {
		for (int i = 1; i < 101; i++) {
			System.out.println(judge(i));
		}
	}
	
	public String judge(int num) {
		StringBuilder result = new StringBuilder();
		// 是否包含第一个特殊数
		String numStr = String.valueOf(num);
		if (numStr.contains(String.valueOf(specialNum[0]))) {
			result.append(word[0]);
			return result.toString();
		}

		for (int i = 0; i < specialNum.length; i++) {

			if (num % specialNum[i] == 0) {
				// 倍数情况
				result.append(word[i]);
			}
		}
		if (result.length() == 0) {
			result.append(num);
		}
		return result.toString();
	}
}
