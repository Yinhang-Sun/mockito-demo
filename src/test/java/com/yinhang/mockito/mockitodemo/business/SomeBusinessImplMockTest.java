package com.yinhang.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_oneValueTest() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(35, businessImpl.findTheGreatestFromAllData());
	}

}