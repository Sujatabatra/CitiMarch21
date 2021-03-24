package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.persistence.ShareDaoImpl;

public class ShareServiceImpl implements ShareService {

	
//	private ShareDao shareDao=new ShareDaoImpl();
	private ShareDao shareDao;
	
	
	public void setShareDao(ShareDao shareDao) {
		this.shareDao = shareDao;
	}

	@Override
	public ArrayList<Share> getAllShares() throws  SQLException {
		return shareDao.getAllShareRecords();
	}

	@Override
	public boolean addShare(Share share) throws SQLException {
		return shareDao.insertShareRecord(share);
	}

	@Override
	public Share searchShareRecordById(int shareId) throws SQLException {
		Share share=shareDao.searchShareById(shareId);
		if(share!=null)
			share=convertUpperCase(share);
		return share;
	}

	//Bussiness Logic
	@Override
	public Share convertUpperCase(Share share) {
		Share share1=new Share();
		share1.setInstrumentId(share.getInstrumentId());
		share1.setInstrumentName(share.getInstrumentName().toUpperCase());
		share1.setMarketRate(share.getMarketRate());
		return share1;
	}

}
