package com.sujata.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public interface ShareDao {

	ArrayList<Share> getAllShareRecords() throws SQLException;
	boolean insertShareRecord(Share share)throws SQLException;
	Share searchShareById(int shareId)throws SQLException;
	
}
