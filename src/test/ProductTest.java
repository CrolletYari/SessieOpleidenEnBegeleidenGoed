package test;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.Product;

public class ProductTest {
	private Product p = new Product("a", "b", 12.00);

	@Test
	public void test_Constructor_maakt_Product_aan() {
		Product product = new Product("a", "b", 12.00);
		assertEquals("a", product.getNaam());
		assertEquals("B", product.getBeschrijving());
		assertEquals("12.00", product.getPrijs().toString());
	}

	@Test
	public void test_setNaam_maakt_Product_aan_en_getNaam_geeft_naam_terug() {
		String naam = "test";
		p.setNaam(naam);
		assertEquals(naam, p.getNaam());
	}

	@Test
	public void test_setBeschrijving_maakt_Product_aan_en_getBeschrijving_geeft_beschrijving_terug() {
		String beschrijving = "test";
		p.setBeschrijving(beschrijving);

		assertEquals(beschrijving, p.getBeschrijving());
	}

	@Test
	public void test_setPrijs_maakt_Product_aan_en_getPrijs_geef_prijs_terug() {
		double prijs = 50.00;
		p.setPrijs(prijs);

		assertEquals(prijs, p.getPrijs(), 0.00);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_setNaam_faalt_als_naam_is_null(){
		p.setNaam(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_setNaam_faalt_als_naam_is_leeg(){
		p.setNaam(" ");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_setBeschrijving_faalt_als_beschrijving_is_null(){
		p.setBeschrijving(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_setBeschrijving_faalt_als_beschrijving_is_leeg(){
		p.setBeschrijving(" ");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_setPrijs_faalt_als_prijs_is_kleiner_dan_0(){
		p.setPrijs(-1.00);
	}

}
