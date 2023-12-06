package fr.ensim.app.controller;

import fr.ensim.app.AppApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {
    @Autowired
    RestTemplate template;
    @PostMapping("/meteo")
    public String showAddresse(@RequestParam(name="addressPOST", required=true) String addressPOST, Model model) {
        addressPOST = addressPOST.replaceAll(" ","+");
        String requestEtalab="https://api-adresse.data.gouv.fr/search/?q="+addressPOST;String response = template.getForObject(requestEtalab, String.class);
        String latitude;
        String longitude;
        String postcode;
        String requestMeteo="https://api.meteo-concept.com/api/forecast/daily?latlng="+latitude+"%2C"+longitude+"&insee="+postcode+"&world=false&start=0&end=1&token=4783cf1fb649b591b37828a253be0af4020c810615c86a054a79ce8ffb597c13";
        model.addAttribute("nomTemplate", response);
        return "meteo";
    }
}
