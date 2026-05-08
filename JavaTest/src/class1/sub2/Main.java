package class1.sub2;

public class Main {

	public static void main(String[] args) {
		// 상품 객체 생성
		Product product = new Product("P001", "키보드", 35000, 10);
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("--------------------");
		// 가격 수정 및 재고 관리 테스트
		product.updatePrice(30000);
		System.out.println("--------------------");
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("--------------------");
		// 재고 추가
		product.addStock(5);
		System.out.println("--------------------");
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("--------------------");
	}
	
}
class Product {
	
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId,String productName,int price,int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public void updatePrice(int newPrice) {
		System.out.println(productName + " 가격 수정됨");
		price = newPrice;
		
	}
	public void addStock(int add) {
		System.out.println(productName +" "+ add +"개 추가 됨");
		quantity += add;
	}
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
		System.out.println("상품이름 : " + productName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
	
}