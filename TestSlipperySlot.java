import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestSlipperySlot {
	
	@Test
	public void fiveSame() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValues = {3,3,3,3,3};
		int testPayOff = 1000000;
		
		assertEquals(testPayOff, bs.payOff(testValues));
	}
	
	@Test
	public void fourSame() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValuesSet1 = {3,3,3,3,7};
		int[] testValuesSet2 = {3,7,7,7,7};
		
		int testPayOff = 10000;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	@Test
	public void threeSameAndTwoSame() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValuesSet1 = {3,3,3,7,7};
		int[] testValuesSet2 = {7,3,3,3,7};
		int[] testValuesSet3 = {7,7,11,11,11};
		
		int testPayOff = 5000;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
	}
	
	@Test
	public void threeSameAndTwoDifferent() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValuesSet1 = {3,3,3,5,7};
		int[] testValuesSet2 = {3,5,5,5,7};
		int[] testValuesSet3 = {3,5,7,7,7};
		
		int testPayOff = 100;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
	}
	
	@Test
	public void twoSame() {
		SlipperySlot bs = new SlipperySlot();
		
		// One set of one pair
		
		int[] testValuesSet1 = {3,5,7,11,11};
		int[] testValuesSet2 = {3,5,7,7,11};
		int[] testValuesSet3 = {3,5,5,7,11};
		int[] testValuesSet4 = {3,3,5,7,11};
		
		// Two sets of two pairs
		
		int[] testValuesSet5 = {3,3,5,5,7};
		int[] testValuesSet6 = {3,3,5,7,7};
		int[] testValuesSet7 = {3,5,5,7,7};
		
		int testPayOff = 10;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		assertEquals(testPayOff, bs.payOff(testValuesSet4));
		assertEquals(testPayOff, bs.payOff(testValuesSet5));
		assertEquals(testPayOff, bs.payOff(testValuesSet6));
		assertEquals(testPayOff, bs.payOff(testValuesSet7));
		
	}
	
	// Test five same + some added bonus
	@Test
	public void fiveSameAndPerfectSquare() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValues = {9,9,9,9,9}; // All 5 perfect square
		
		int testPayOff = 1000007;
		
		assertEquals(testPayOff, bs.payOff(testValues));
		
	}
	
	@Test
	public void fiveSameAndPerfectSquareAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValues = {16,16,16,16,16}; // Perfect Square and power of 2
		
		int testPayOff = 1000010;
		
		assertEquals(testPayOff, bs.payOff(testValues));
		
	}
	
	@Test
	public void fiveSameAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValues = {8,8,8,8,8};
		
		int testPayOff = 1000003;
		
		assertEquals(testPayOff, bs.payOff(testValues));
		
	}
	
	@Test
	public void fiveSameAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValues = {42,42,42,42,42};
		
		int testPayOff = 1000002;
		
		assertEquals(testPayOff, bs.payOff(testValues));
	}
	
	
	
	// Test four same + Some added bonus
	
	@Test
	public void fourSameAndPerfectSquare() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square
		int[] testValuesSet1 = {3,3,3,3,25}; 
		int[] testValuesSet2 = {9,9,9,9,11};
		
		int[] testValuesSet3 = {9,9,9,9,25};

		int testPayOff = 10007;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void fourSameAndPerfectSquareAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square and power of 2
		int[] testValuesSet1 = {3,3,3,3,16};
		int[] testValuesSet2 = {16,16,16,16,17};
		
		int[] testValuesSet3 = {8,8,8,8,16};
		
		int[] testValuesSet4 = {4,4,4,4,16};
		
		int testPayOff = 10010;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		assertEquals(testPayOff, bs.payOff(testValuesSet4));
		
	}
	
	@Test
	public void fourSameAndPerfectSquareAndPowerOfTwoAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square, power of 2, and 42
		int[] testValuesSet1 = {16,16,16,16,42};
		int[] testValuesSet2 = {16,42,42,42,42};
		
		
		int testPayOff = 10012;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	@Test
	public void fourSameAndPerfectSquareAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square and 42
		int[] testValues = {9,9,9,9,42};
		
		int testPayOff = 10009;
		
		assertEquals(testPayOff, bs.payOff(testValues));
		
	}
	
	@Test
	public void fourSameAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValuesSet1 = {3,3,3,3,8};
		int[] testValuesSet2 = {3,8,8,8,8};
		
		int[] testValuesSet3 = {8,32,32,32,32};
		
		int testPayOff = 10003;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void fourSameAndPowerOfTwoAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValuesSet1 = {42,42,42,42,8};
		int[] testValuesSet2 = {8,8,8,8,42};
		
		int testPayOff = 10005;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	@Test
	public void fourSameAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValuesSet1 = {3,3,3,3,42};
		int[] testValuesSet2 = {3,42,42,42,42};
		
		int testPayOff = 10002;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
	}
	
// Test three same + Two Same + Some added bonus

	@Test
	public void threeSameTwoSameAndPerfectSquare() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square
		int[] testValuesSet1 = {3,3,3,9,9}; 
		int[] testValuesSet2 = {9,9,9,11,11};
		int[] testValuesSet3 = {9,9,9,25,25};
		
		int testPayOff = 5007;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
	}
	
	@Test
	public void threeSameTwoSameAndPerfectSquareAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square and power of 2
		int[] testValuesSet1 = {9,9,9,16,16};
		int[] testValuesSet2 = {16,16,16,17,17};
		int[] testValuesSet3 = {8,8,8,16,16};
		int[] testValuesSet4 = {8,8,8,25,25};
		
		int testPayOff = 5010;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		assertEquals(testPayOff, bs.payOff(testValuesSet4));
		
	}
	
	@Test
	public void threeSameTwoSameAndPerfectSquareAndPowerOfTwoAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square, power of 2, and 42
		int[] testValuesSet1 = {16,16,16,42,42};
		int[] testValuesSet2 = {4,4,42,42,42};
		
		int testPayOff = 5012;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	@Test
	public void threeSameTwoSameAndPerfectSquareAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square and 42
		int[] testValuesSet1 = {9,9,42,42,42};
		int[] testValuesSet2 = {9,9,9,42,42};
		
		
		int testPayOff = 5009;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	@Test
	public void threeSameTwoSameAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		// Power of 2
		int[] testValuesSet1 = {3,3,3,8,8};
		int[] testValuesSet2 = {8,8,8,11,11};
		int[] testValuesSet3 = {8,8,8,32,32};
		
		int testPayOff = 5003;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void threeSameTwoSameAndPowerOfTwoAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Power of 2 and 42
		int[] testValuesSet1 = {8,8,8,42,42};
		int[] testValuesSet2 = {8,8,42,42,42};
		
		int testPayOff = 5005;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	@Test
	public void threeSameTwoSameAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// 42
		int[] testValuesSet1 = {3,3,3,42,42};
		int[] testValuesSet2 = {3,3,42,42,42};
		
		int testPayOff = 5002;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
		
// Test three same + Two Diff + Some added bonus

	@Test
	public void threeSameTwoDiffAndPerfectSquare() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square
		int[] testValuesSet1 = {3,3,3,7,9};
		int[] testValuesSet2 = {9,9,9,11,17};
		int[] testValuesSet3 = {9,9,9,7,25};
		
		int testPayOff = 107;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void threeSameTwoDiffAndPerfectSquareAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square and power of 2
		int[] testValuesSet1 = {3,3,3,8,25};
		int[] testValuesSet2 = {3,3,3,5,16};
		int[] testValuesSet3 = {3,3,3,16,25};
		int[] testValuesSet4 = {8,9,9,9,32};
		int[] testValuesSet5 = {16,16,16,17,19};
		int[] testValuesSet6 = {8,8,8,16,25};
		
		int testPayOff = 110;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		assertEquals(testPayOff, bs.payOff(testValuesSet4));
		assertEquals(testPayOff, bs.payOff(testValuesSet5));
		assertEquals(testPayOff, bs.payOff(testValuesSet6));
		
	}
	
	@Test
	public void threeSameTwoDiffAndPerfectSquareAndPowerOfTwoAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square, power of 2, and 42
		int[] testValuesSet1 = {8,9,42,42,42};
		int[] testValuesSet2 = {16,16,16,42,47};
		int[] testValuesSet3 = {16,16,16,42,49};
		int[] testValuesSet4 = {9,9,9,16,42};
		
		int testPayOff = 112;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		assertEquals(testPayOff, bs.payOff(testValuesSet4));
		
	}
	
	@Test
	public void threeSameTwoDiffAndPerfectSquareAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Perfect square and 42
		int[] testValuesSet1 = {3,9,42,42,42};
		int[] testValuesSet2 = {3,9,9,9,42};
		int[] testValuesSet3 = {9,9,9,25,42};
		
		int testPayOff = 109;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void threeSameTwoDiffAndPowerOfTwo() {
		SlipperySlot bs = new SlipperySlot();
		
		// Power of 2
		int[] testValuesSet1 = {3,3,3,8,11};
		int[] testValuesSet2 = {8,8,8,11,13};
		int[] testValuesSet3 = {8,8,8,11,32};
		
		int testPayOff = 103;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void threeSameTwoDiffAndPowerOfTwoAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// Power of 2 and 42
		int[] testValuesSet1 = {8,8,8,42,47};
		int[] testValuesSet2 = {5,8,42,42,42};
		int[] testValuesSet3 = {8,32,42,42,42};
		
		int testPayOff = 105;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		assertEquals(testPayOff, bs.payOff(testValuesSet3));
		
	}
	
	@Test
	public void threeSameTwoDiffAnd42() {
		SlipperySlot bs = new SlipperySlot();
		
		// 42
		int[] testValuesSet1 = {3,3,3,5,42};
		int[] testValuesSet2 = {3,5,42,42,42};
		
		int testPayOff = 102;
		
		assertEquals(testPayOff, bs.payOff(testValuesSet1));
		assertEquals(testPayOff, bs.payOff(testValuesSet2));
		
	}
	
	// Test two same + Some added bonus

		@Test
		public void twoSameAndPerfectSquare() {
			SlipperySlot bs = new SlipperySlot();
			
			// Perfect square
			int[] testValuesSet1 = {3,3,5,7,9}; 
			int[] testValuesSet2 = {9,9,11,13,17};
			int[] testValuesSet3 = {9,9,23,25,31};
			int[] testValuesSet4 = {9,9,25,25,31};
			
			int testPayOff = 17;

			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			assertEquals(testPayOff, bs.payOff(testValuesSet3));
			assertEquals(testPayOff, bs.payOff(testValuesSet4));
			
		}
		
		@Test
		public void twoSameAndPerfectSquareAndPowerOfTwo() {
			SlipperySlot bs = new SlipperySlot();
			
			// Perfect square and power of 2
			int[] testValuesSet1 = {3,3,5,8,9};
			int[] testValuesSet2 = {3,3,5,7,16};
			int[] testValuesSet3 = {3,3,5,9,16};
			int[] testValuesSet4 = {9,9,16,16,17};
			int[] testValuesSet5 = {4,4,16,16,17};
			
			int testPayOff = 20;
			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			assertEquals(testPayOff, bs.payOff(testValuesSet3));
			assertEquals(testPayOff, bs.payOff(testValuesSet4));
			assertEquals(testPayOff, bs.payOff(testValuesSet5));
			
		}
		
		@Test
		public void twoSameAndPerfectSquareAndPowerOfTwoAnd42() {
			SlipperySlot bs = new SlipperySlot();
			
			// Perfect square, power of 2, and 42
			int[] testValuesSet1 = {3,3,8,9,42};
			int[] testValuesSet2 = {3,3,16,17,42};
			int[] testValuesSet3 = {3,3,16,16,42};
			int[] testValuesSet4 = {3,5,16,16,42};
			int[] testValuesSet5 = {9,9,16,17,42};
			int[] testValuesSet6 = {3,5,16,42,42};
						
			int testPayOff = 22;
			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			assertEquals(testPayOff, bs.payOff(testValuesSet3));
			assertEquals(testPayOff, bs.payOff(testValuesSet4));
			assertEquals(testPayOff, bs.payOff(testValuesSet5));
			assertEquals(testPayOff, bs.payOff(testValuesSet6));
			
		}
		
		@Test
		public void twoSameAndPerfectSquareAnd42() {
			SlipperySlot bs = new SlipperySlot();
			
			// Perfect square and 42
			int[] testValuesSet1 = {3,5,9,42,42};
			int[] testValuesSet2 = {9,9,11,13,42};
			
			int testPayOff = 19;
			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			
		}
		
		@Test
		public void twoSameAndPowerOfTwo() {
			SlipperySlot bs = new SlipperySlot();
			
			// Power of 2
			int[] testValuesSet1 = {3,3,7,8,11};
			int[] testValuesSet2 = {8,8,11,13,17};
			int[] testValuesSet3 = {8,8,11,32,32};
			
			int testPayOff = 13;
			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			assertEquals(testPayOff, bs.payOff(testValuesSet3));
			
		}
		
		@Test
		public void twoSameAndPowerOfTwoAnd42() {
			SlipperySlot bs = new SlipperySlot();
			
			// Power of 2 and 42
			int[] testValuesSet1 = {3,5,8,8,42};
			int[] testValuesSet2 = {3,5,8,42,42};
			
			int testPayOff = 15;
			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			
		}
		
		@Test
		public void twoSameAnd42() {
			SlipperySlot bs = new SlipperySlot();
			
			// 42
			int[] testValuesSet1 = {3,3,5,7,42};
			int[] testValuesSet2 = {3,5,7,42,42};
			
			int testPayOff = 12;
			
			assertEquals(testPayOff, bs.payOff(testValuesSet1));
			assertEquals(testPayOff, bs.payOff(testValuesSet2));
			
		}
	
	
	@Test
	public void allDifferent() {
		SlipperySlot bs = new SlipperySlot();
		
		int[] testValues = {3, 5, 7, 11, 13};
		
		int testPayOff = 0;
		assertEquals(testPayOff, bs.payOff(testValues));
	}
	
}
