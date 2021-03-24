package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.sujata.bean.Share;


public class ShareDaoImpl implements ShareDao {

	//singleton
	private DataSource dataSource;
	
		public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public ArrayList<Share> getAllShareRecords() throws SQLException {

		Connection connection = dataSource.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("select * from share");

		ResultSet resultSet = preparedStatement.executeQuery();

		ArrayList<Share> shareList = new ArrayList<Share>();

		while (resultSet.next()) {
			Share share = new Share();
			share.setInstrumentId(resultSet.getInt("instrumentId"));
			share.setInstrumentName(resultSet.getString("instrumentName"));
			share.setMarketRate(resultSet.getInt("marketRate"));

			shareList.add(share);

		}

		connection.close();
		return shareList;
	}

	@Override
	public boolean insertShareRecord(Share share) throws SQLException {
		
		Connection connection = dataSource.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into Share values(?,?,?)");
		preparedStatement.setInt(1, share.getInstrumentId());
		preparedStatement.setString(2, share.getInstrumentName());
		preparedStatement.setInt(3, share.getMarketRate());

		int rows = preparedStatement.executeUpdate();

		connection.close();

		if (rows > 0)
			return true;

		return false;
	}

	@Override
	public Share searchShareById(int shareId) throws  SQLException {
		
		Connection connection=dataSource.getConnection();		
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from share where instrumentId=?");
		preparedStatement.setInt(1, shareId);

		ResultSet resultSet = preparedStatement.executeQuery();

		Share share = null;

		if (resultSet.next()) {
			share = new Share();
			share.setInstrumentId(resultSet.getInt("instrumentId"));
			share.setInstrumentName(resultSet.getString("instrumentName"));
			share.setMarketRate(resultSet.getInt("marketRate"));
		}

		return share;
	}

}
