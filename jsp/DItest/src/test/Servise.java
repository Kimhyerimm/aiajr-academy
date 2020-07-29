package test;

public class Servise {
	
	// Service 클래스는 Dao클래스에 의존한다.
	// Dao dao = new Dao();
	
	Dao dao;
	
	public void setDao(Dao dao) {
		this.dao=dao;
	}
	
	public void print() {
		dao.print();
	}
	
	
}
