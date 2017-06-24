package com.test;

import org.junit.Assert;
import org.junit.Test;

/**
*
* @author 23653_000
* @version 创建时间：2017年6月24日 下午8:30:42
*/
public class TestCase {

	private Main main = new Main(3,5,7);
	
	@Test
	public void test() {
		main.countOff();
		Assert.assertEquals("FizzBuzz",main.judge(15));
	}

}
