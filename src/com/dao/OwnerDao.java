package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.person.Address;
import com.model.person.Owner;

public class OwnerDao {

	private Connection Conn;
	private Address address;

	public OwnerDao(Connection conn) {
		super();
		Conn = conn;
	}

	public boolean addOwner(Owner o) {
		boolean f = false;
		try {
			String sql = "insert into owner(first_name,last_name,age,pib,numberTel,priceFarm,yearOfAcquisition,district,city,street,houseNumber)"
					+ "?,?,?,?,?,?,?,?,?,?,?";

			PreparedStatement ps = Conn.prepareStatement(sql);
			ps.setString(1, o.getFirstName());
			ps.setString(2, o.getLastName());
			ps.setInt(3, o.getAge());
			ps.setInt(4, o.getPib());
			ps.setInt(5, o.getNumberTel());
			ps.setDouble(6, o.getPriceFarm());
			ps.setInt(7, o.getYearOfAcquisition());
			ps.setString(8, address.getDistrict());
			ps.setString(9, address.getCity());
			ps.setString(10, address.getStreet());
			ps.setInt(11, address.getHouseNumber());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;

	}

}
