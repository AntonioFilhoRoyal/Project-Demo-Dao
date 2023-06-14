package db.model.dao;

import db.connector.DbConnect;
import db.model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoJdbc(DbConnect.getConnection());
	}
}
