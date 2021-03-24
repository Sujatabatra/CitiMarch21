package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public interface ShareService {

	ArrayList<Share> getAllShares();
	boolean addShare(Share share) ;
	Share searchShareRecordById(int shareId);
	Share convertUpperCase(Share share);
}
