package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sujata.bean.Share;
import com.sujata.util.ShareRowMapper;

@Component
public class ShareDaoImpl implements ShareDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ArrayList<Share> getAllShareRecords(){		
		ArrayList<Share> shareList =(ArrayList)jdbcTemplate.query("select * from share", new ShareRowMapper());
		return shareList;
	}

	@Override
	public boolean insertShareRecord(Share share){
		
		int rows=jdbcTemplate.update("insert into Share values(?,?,?)", share.getInstrumentId(),share.getInstrumentName(),share.getMarketRate());
		
		if (rows > 0)
			return true;

		return false;
	
	}

	@Override
	public Share searchShareById(int shareId){
		Share share=jdbcTemplate.queryForObject("select * from share where instrumentId=?", new Object[] {shareId}, new ShareRowMapper());
		return share;
	}

}
