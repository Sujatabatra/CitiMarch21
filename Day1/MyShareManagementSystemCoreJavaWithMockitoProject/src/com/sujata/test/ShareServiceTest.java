package com.sujata.test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.sujata.bean.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.service.ShareService;
import com.sujata.service.ShareServiceImpl;

/*
 * test for boolean addShare(Share share),getAllShare() of Share service class (Assignment)
 */
@RunWith(MockitoJUnitRunner.class)
public class ShareServiceTest {

	@InjectMocks
	private ShareService shareService=new ShareServiceImpl();
	
	@Mock
	private ShareDao shareDao;

	@Test
	public void testSearchRecordById() {
		Share share=new Share(1, "CITI", 4500);
		try {
			when(shareDao.searchShareById(1)).thenReturn(share);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Share share1=shareService.searchShareRecordById(1);
			
			assertEquals("CITI",share1.getInstrumentName() );
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
