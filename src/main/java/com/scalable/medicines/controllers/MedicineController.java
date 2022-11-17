package com.scalable.medicines.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalable.medicines.model.Medicine;

@RestController
@RequestMapping("/")
public class MedicineController {

    @Autowired
    private Environment env;

    @RequestMapping("/medicines")
    public List<Medicine> getMedicines() {
        List<Medicine> medicines = Arrays.asList(
                new Medicine(1, "Tata 1mg Women's Multivitamin, Zinc, Vitamin C, Calcium, Vitamin D, and Iron  Immunity Booster Tablet",445f,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/qh1au45w8u7cfvf3lg3i/tata-1mg-women-s-multivitamin-zinc-vitamin-c-calcium-vitamin-d-and-iron-immunity-booster-tablet.jpg", 995f, "bottle of 60 tablets", "897 ratings","4.3"),
                new Medicine(2, "Zincovit Tablet",90f,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ibcufhk27uqhpgy9kfcg/zincovit-tablet.jpg", 105f, "strip of 15 tablets", "6228 ratings","4.5"),
                new Medicine(3, "Nutrabay Pro Active Multivitamin Men Capsule",310f,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/aywb3kusfcv1tnyyt8qy/dr.-morepen-multi-vitamin-men-with-omega-3-herbs-natural-energy-immunity-booster-tablet.jpg", 699f, "bottle of 60 capsules", "9 ratings","3.9"));
        return medicines;
    }
}
