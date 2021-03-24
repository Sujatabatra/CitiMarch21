package com.sujata.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.sujata.bean.CustomerShareDetail;

public class CustomerShareDetailDaoImpl implements CustomerShareDetailDao {

	private DataSource dataSource;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public ArrayList<CustomerShareDetail> getAllRecord() throws SQLException {
		Connection connection = dataSource.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("select detailId,shareType,quantity,customerName,instrumentName from share,customer,CustomerShareDetails\r\n"
				+ "where share.instrumentId=CustomerShareDetails.instrumentId \r\n"
				+ "and\r\n"
				+ "customer.customerId=CustomerShareDetails.customerId;\r\n"
				+ "");

		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<CustomerShareDetail> customerShareDetails=new ArrayList<CustomerShareDetail>();
		
		while(resultSet.next()) {
			CustomerShareDetail customerShareDetail=new CustomerShareDetail();
			customerShareDetail.setDetailId(resultSet.getInt("detailId"));
			customerShareDetail.setShareType(resultSet.getString("shareType"));
			customerShareDetail.setQuantity(resultSet.getInt("quantity"));
			customerShareDetail.setCustomerName(resultSet.getString("customerName"));
			customerShareDetail.setInstrumentName(resultSet.getString("instrumentName"));
			
			customerShareDetails.add(customerShareDetail);
		}
		connection.close();
		
		return customerShareDetails;
	}

}
