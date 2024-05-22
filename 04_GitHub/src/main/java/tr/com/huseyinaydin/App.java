package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994 
* @category Java EE
*
*/

public class App {

    public static void main( String[] args ){
    	Islem islem = new Islem();
    	islem.goster();
    	selamla();
    }
 
	private static void selamla() {
		 System.out.println( "----------------" );		
		 System.out.println( "Selamlar gardaş Github!" );		
		 System.out.println( "----------------" );		
	}
}