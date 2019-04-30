package pl.slawek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.slawek.data.AdvertisementRepository;
import pl.slawek.data.DocumentRepository;
import pl.slawek.model.Advertisement;
import pl.slawek.model.Document;

@Controller
public class HomeController {

	AdvertisementRepository advertisementRepository;
	DocumentRepository documentRepository;
	
	@Autowired
	public HomeController(AdvertisementRepository advertisementRepository, DocumentRepository documentRepository) {
		this.advertisementRepository = advertisementRepository;
		this.documentRepository = documentRepository;
	}

	@GetMapping({"/","/main","/menu"})
    public String menu(Model model) {
		List <Advertisement> newsList = advertisementRepository.findAll();
		model.addAttribute("newsList",newsList);
    	return "menu";
    }
	
	@GetMapping("/documents")
	public String documents(Model model) {
		List <Document> documentsList = documentRepository.findAll();
		model.addAttribute("documentsList",documentsList);
		return "documents";
	}
}
