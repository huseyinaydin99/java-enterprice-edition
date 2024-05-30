package tr.com.huseyinaydin.controller;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.axis2.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.huseyinaydin.SelamWSStub;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java EE
 *
 */

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/{adiSoyadi}", method = RequestMethod.GET)
	public String home(@PathVariable("adiSoyadi") String adiSoyadi, Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		// model.addAttribute("serverTime", formattedDate );

		SelamWSStub stub = null;
		try {
			stub = new SelamWSStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Web servisine istegimizi yapalim.
		SelamWSStub.SelamVer istek = new SelamWSStub.SelamVer();
		istek.setAdiSoyadi(adiSoyadi);

		// WebServisini cagiralim ve cavbimizi alalim.
		SelamWSStub.SelamVerResponse cevap = null;
		try {
			cevap = stub.selamVer(istek);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("WEB SERVISINDEN GELEN CEVAP : " + cevap.get_return());

		model.addAttribute("serverTime", cevap.get_return());
		return "home";
	}
}