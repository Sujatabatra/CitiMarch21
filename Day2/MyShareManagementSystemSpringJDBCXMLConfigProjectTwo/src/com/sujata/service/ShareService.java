package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public interface ShareService {

	ArrayList<Share> getAllShares() throws SQLException;
	boolean addShare(Share share) throws SQLException;
	Share searchShareRecordById(int shareId)throws SQLException;
	Share convertUpperCase(Share share);
}
