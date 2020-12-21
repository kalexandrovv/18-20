package OnlainMagazin;

public class Main {

	  public static void main(String[] args) {
	       
	     
	        Product[] pa = new Product[7];
	       
	       
	        pa[0] = new TV(1000, "Samsung", 30);
	        pa[1] = new TV(2000, "Sony", 50);
	        pa[2] = new MP3Player(250, "Apple", "blue");
	        pa[3] = new Book(34, "Sun press", 1992);
	        pa[4] = new Book(15, "Korea press", 1986);
	        pa[5] = new ChildrenBook(15, "Steven King", 2012, 12);
	        pa[6] = new ComicBook(14, "Frank Lampard", 2019, "blue");
	       
	        
	        double totalRegularPrice = 0;
	        double totalSalePrice = 0;
	       
	        for (int i=0; i<pa.length; i++){
	           
	           
	            totalRegularPrice += pa[i].getRegularPrice();
	           
	          
	            totalSalePrice += pa[i].computeSalePrice();
	           
	            System.out.println("Item number " + i +
	                    ": Type = " + pa[i].getClass().getName() +
	                    ", Regular price = " + pa[i].getRegularPrice() +
	                    ", Sale price = " + pa[i].computeSalePrice());
	        }
	        System.out.println("totalRegularPrice = " + totalRegularPrice);
	        System.out.println("totalSalePrice = " + totalSalePrice);
	    }
	   
	}
