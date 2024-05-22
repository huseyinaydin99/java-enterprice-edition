package tr.com.huseyinaydin;
 
//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java EE
 *
 */

public class Araba {
	
	Yakit yakit;
	
	/*
	public Araba() {
		this.yakit = new Yakit();
	}
	*/
	
	public Araba(Yakit yakit) {
		this.yakit = yakit; 
	}

	public void calistir() {
		yakit.depo();
		System.out.println("Araba çalışıyor.");
	}
}