package tr.com.huseyinaydin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

@Controller
public class AnasayfaController extends AbstractController {

	@RequestMapping(value = "/anasayfa", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("anahtarKelime", "Selamlar Spring MVC" );	
		return "AnasayfaView";
	}

	@RequestMapping(value = "/karsilama.aspx", method = RequestMethod.GET)
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws Exception {
		String adi = "Ömer";
		String soyadi = "Faruk";
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("p_adi",adi);
		modelAndView.addObject("p_soyadi",soyadi);
		
		return modelAndView;
	}
}