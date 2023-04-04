package lecture.lec05.structural_patterns.facade;


public class ShopKeeper {
	
	
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	private MobileShop sony;
	
	public ShopKeeper(){
		
		iphone= new Iphone();
		
		samsung=new Samsung();
		
		blackberry=new Blackberry();

		sony = new Sony();
		
	}
	
	
	
	public void iphoneSale(){
		
		iphone.modelNo();
		iphone.price();
		
	}
	
    public void samsungSale(){
		
		samsung.modelNo();
		samsung.price();
		
	}


   public void blackberrySale(){
	
	blackberry.modelNo();
	blackberry.price();
	
}
	

}
