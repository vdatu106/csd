package com.steerlean.fizzbuzz;

import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class AppTest {
	
	@Test
	@SuppressWarnings("unchecked")
	public void testApp() {
		NumberProcessor numberProcessorMock = mock(NumberProcessor.class);
		App app = new App(numberProcessorMock);
		
//		ArgumentCaptor<Integer> lowerLimit = ArgumentCaptor.forClass(Integer.class);
//		ArgumentCaptor<Integer> upperLimit = ArgumentCaptor.forClass(Integer.class);
		app.start();
		
//ASSERT		
		verify(numberProcessorMock, times(1)).processRange(1,100, new ArrayList<String>());
//		Assert.assertEquals(1, lowerLimit.getValue().intValue());
//		Assert.assertEquals(100, upperLimit.getValue().intValue());
	}
}
