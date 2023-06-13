package db.model.dao;

import db.model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoJdbc();
	}
}
