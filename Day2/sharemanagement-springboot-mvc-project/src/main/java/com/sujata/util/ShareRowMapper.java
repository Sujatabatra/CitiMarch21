package com.sujata.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Share;

public class ShareRowMapper implements RowMapper<Share> {

	//mapping resultset with object
	@Override
	public Share mapRow(ResultSet rs, int rowNum) throws SQLException {
		Share share=new Share();
		share.setInstrumentId(rs.getInt("instrumentId"));
		share.setInstrumentName(rs.getString("instrumentName"));
		share.setMarketRate(rs.getInt("marketRate"));
		return share;
	}

}
