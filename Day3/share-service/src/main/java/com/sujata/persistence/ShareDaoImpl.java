package com.sujata.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sujata.bean.Share;

@Component
public class ShareDaoImpl implements ShareDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Share getRecordById(int id) {
		Share share=jdbcTemplate.queryForObject("select * from share where instrumentId=?", new Object[] {id}, new ShareRowMapper());
		return share;
	}

}
