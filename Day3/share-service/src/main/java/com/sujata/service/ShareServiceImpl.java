package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Share;
import com.sujata.persistence.ShareDao;

@Component
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareDao;
	
	@Override
	public Share getShareById(int id) {
		return shareDao.getRecordById(id);
	}

}
