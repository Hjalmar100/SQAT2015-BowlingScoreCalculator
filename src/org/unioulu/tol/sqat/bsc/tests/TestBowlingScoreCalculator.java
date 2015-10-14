package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;



public class TestBowlingScoreCalculator {

	@Test
	public void frame1(){
	for (int i = 0; i < 10; i++ ){
		
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("x");
		assertEquals(10,result);
	}
		
	}
	@Test
	public void frame() {
		for (int i = 0; i < 10; i++ ){
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("f");
		assertEquals(0,result);
		
		}
	}
	
	@Test
	public void frame3() {
		for (int i = 0; i < 10; i++ ){
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("g");
		assertEquals(0,result);
		
		}
	}
	
	
	@Test
	public void frame() {
		for (int i = 0; i < 10; i++ ){
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("5");
		assertEquals(5,result);
		
		}
	}
	
	@Test
	public void frame5() {
		for (int i = 0; i < 10; i++ ){
		BowlingGame bg = new BowlingGame ();
			int result= bg.playBowlingGame("5");
		assertEquals(5,result);
		
		}
	}
		
		@Test
		public void frame() {
			for (int i = 0; i < 10; i++ ){
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			
			}
		}
	
		
		@Test
		public void frame7() {
			for (int i = 0; i < 10; i++ ){
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
		
			}
		
	}
		
		@Test
		public void frame8() {
			for (int i = 0; i < 10; i++ ){
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			//fail("Not yet implemented");
			}
	
		}
		
		@Test
		public void frame9() {
			for (int i = 0; i < 10; i++ ){
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			//fail("Not yet implemented");
			}
	
		}
		
		@Test
		public void frame10() {
			for (int i = 0; i < 10; i++ ){
			BowlingGame bg = new BowlingGame ();
				int result= bg.playBowlingGame("5");
			assertEquals(5,result);
			//fail("Not yet implemented");
			}
	
		}
	
}
