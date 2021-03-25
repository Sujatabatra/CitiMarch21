package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Share;

public class ShareRowMapper implements RowMapper<Share> {

	@Override
	public Share mapRow(ResultSet rs, int rowNum) throws SQLException {
		Share share=new Share();
		share.setShareId(rs.getInt("InstrumentId"));
		share.setShareName(rs.getString("InstrumentName"));
		share.setMarketPrice(rs.getInt("marketRate"));
		return share;
	}

}
