package com.sujata.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public interface ShareDao {

	ArrayList<Share> getAllShareRecords();
	boolean insertShareRecord(Share share);
	Share searchShareById(int shareId);
	
}
