package tr.com.huseyinaydin.composition;

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
	
	public Araba() {
		this.yakit = new Yakit();
	}

	public void calistir() {
		yakit.depo();
		System.out.println("Araba çalışıyor.");
	}
}