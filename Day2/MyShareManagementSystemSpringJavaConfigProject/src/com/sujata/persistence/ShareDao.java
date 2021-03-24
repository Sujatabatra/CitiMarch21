package com.sujata.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public interface ShareDao {

	ArrayList<Share> getAllShareRecords() throws ClassNotFoundException ,SQLException;
	boolean insertShareRecord(Share share)throws ClassNotFoundException ,SQLException;
	Share searchShareById(int shareId)throws ClassNotFoundException ,SQLException;
	
}
