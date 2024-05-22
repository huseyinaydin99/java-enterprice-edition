package tr.com.huseyinaydin;

import java.io.Serializable;
import java.lang.String;
import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.IDENTITY;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

@Entity
@Table(name = "Persons")
public class Personel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private int personelId;
	
	private String personelAdi;
	
	private String personelSoyadi;

	public Personel() {
		super();
	}

	public int getPersonelId() {
		return this.personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getPersonelAdi() {
		return this.personelAdi;
	}

	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public String getPersonelSoyadi() {
		return this.personelSoyadi;
	}

	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}

	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", personelAdi=" + personelAdi + ", personelSoyadi="
				+ personelSoyadi + "]";
	}
}