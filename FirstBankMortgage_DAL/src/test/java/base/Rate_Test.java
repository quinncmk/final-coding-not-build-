package base;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import domain.RateDomainModel;

public class Rate_Test {
	private static RateDAL rateTest;
	/*
	private static RateDomainModel rate1;
	private static RateDomainModel rate2;
	private static RateDomainModel rate3;
	private static RateDomainModel rate4;
	
	@BeforeClass
	public static void rateInstance() throws Exception{
		rate1.setRateID(95);
		rate1.setMinCreditScore(500);
		rate1.setInterestRate(2.25);
		
		rate2.setRateID(96);
		rate2.setMinCreditScore(600);
		rate2.setInterestRate(3.25);
		
		rate2.setRateID(97);
		rate2.setMinCreditScore(700);
		rate2.setInterestRate(4.25);
		
		rate2.setRateID(98);
		rate2.setMinCreditScore(800);
		rate2.setInterestRate(5.25);
	}
	*/
	
	@Test
	public void test() {
		rateTest.getRate(650);
		rateTest.getRate(700);
	}

}
