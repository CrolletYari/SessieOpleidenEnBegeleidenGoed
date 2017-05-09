package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import domain.Product;
import domain.Winkel;
import org.junit.*;
public class WinkelTest {
	private Winkel winkel;
	@Before
	public void begin(){
	winkel	= new Winkel();
	}
	@Test
	public void test_addProduct_voegt_een_product_toe_en_getProduct_geeft_het_juiste_product_terug() {
		
		Product product =new Product("id1","test",15.00);
		winkel.VoegProductToe(product);
		assertEquals(product, winkel.getProduct(product.getNaam()));
	}
	@Test
	public void test_remove_product_verwijderd_product() {
		
		Product product =new Product("id1","test",15.00);
		winkel.VoegProductToe(product);
		
		assertEquals(product, winkel.getProduct(product.getNaam()));
		winkel.removeProduct("id1");
		assertNull(winkel.getProduct(product.getNaam()));
	}
	@Test
	public void test_get_producten_geeft_producten_terug() {
		ArrayList<Product> producten = new ArrayList<Product>();
		Product product =new Product("id1","test",15.00);
		producten.add(product);
		Product p2 = new Product("id2","test2",12.00);
		producten.add(p2);
		Product p3 = new Product("id3","test3",15.00);
		producten.add(p3);
		Product p4 = new Product("id4","test4",16.00);
		producten.add(p4);
		Product p5 = new Product("id5","test5",10.00);
		producten.add(p4);
		for(Product pr : producten){
			winkel.VoegProductToe(pr);
		}
		assertEquals(producten, winkel.getProducten());
		
	}
	

}
