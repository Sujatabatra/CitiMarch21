package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public interface ShareService {

	ArrayList<Share> getAllShares() throws ClassNotFoundException ,SQLException;
	boolean addShare(Share share) throws ClassNotFoundException ,SQLException;
	Share searchShareRecordById(int shareId)throws ClassNotFoundException ,SQLException;
	Share convertUpperCase(Share share);
}
