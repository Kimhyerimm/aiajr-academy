package test;

public class Servise {
	
	// Service Ŭ������ DaoŬ������ �����Ѵ�.
	// Dao dao = new Dao();
	
	Dao dao;
	
	public void setDao(Dao dao) {
		this.dao=dao;
	}
	
	public void print() {
		dao.print();
	}
	
	
}
