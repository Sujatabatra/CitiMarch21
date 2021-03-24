package com.sujata.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.sujata.bean.CustomerShareDetail;
import com.sujata.util.MySqlDbConnection;


public class CustomerShareDetailDaoImpl implements CustomerShareDetailDao {

	@Override
	public ArrayList<CustomerShareDetail> getAllRecord() throws ClassNotFoundException, SQLException {
		Connection connection = MySqlDbConnection.getConnection();

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
