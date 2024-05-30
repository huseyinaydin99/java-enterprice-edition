package tr.com.huseyinaydin.dao;

import java.util.List;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

public interface PersonelDAO {

	public String personelEkle(Personel p);

	public List<Personel> personelAra();

	public List<Personel> personelAra(Personel p);

	public String personelDuzenle(Personel p);

	public String personelSil(Personel p);
}