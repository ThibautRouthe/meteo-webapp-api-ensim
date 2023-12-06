package fr.ensim.app.controller;

import fr.ensim.app.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddressController {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/addresses")
    public String showAddresses(@RequestParam(name="nameGET", required=false, defaultValue="World") String nameGET, Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        model.addAttribute("nomTemplate", nameGET);
        return "addresses";
    }
}
