package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;



public class TestBowlingScoreCalculator {

	@Test
	public void test1() {
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("x");
		assertEquals(10,result);
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("f");
		assertEquals(0,result);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("g");
		assertEquals(0,result);
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void test4() {
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("5");
		assertEquals(5,result);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test5() {
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("5");
		assertEquals(5,result);
		//fail("Not yet implemented");
	}
		
		@Test
		public void test6() {
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			//fail("Not yet implemented");
		}
	
		
		@Test
		public void test7() {
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			//fail("Not yet implemented");
		
	}
		
		@Test
		public void test8() {
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			//fail("Not yet implemented");
	
		}
	
}
