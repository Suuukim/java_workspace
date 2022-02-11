package db.day3;

public class ProductDao {
	//변수명 한꺼번에 바꾸기 : alt + shift + r
	private static ProductDao productDao = new ProductDao();

	private ProductDao() {
	}
	
	public static ProductDao getInstance() {
		return productDao;
	}
	
	
	
}
