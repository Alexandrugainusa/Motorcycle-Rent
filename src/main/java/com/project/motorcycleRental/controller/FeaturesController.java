package com.project.motorcycleRental.controller;

import com.project.motorcycleRental.model.Feature;
import com.project.motorcycleRental.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class FeaturesController {

    @Autowired
    FeatureService featureService;

    @GetMapping("/features")
    public String getFeatures(Model model){
        List<Feature> featureList = featureService.getFeatures();
        model.addAttribute("features",featureList);
        return "features";
    }

    @PostMapping("/features/addNew")
    public String addNew(Feature feature){
        featureService.save(feature);
        return "redirect:/features";
    }

    @RequestMapping("/features/findById")
    @ResponseBody
    public Optional<Feature> findById(Integer id){
        return featureService.findById(id);
    }

    @RequestMapping(value = "/features/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Feature feature) {
        featureService.save(feature);
        return "redirect:/features";
    }

    @RequestMapping(value = "/features/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id) {
        featureService.delete(id);
        return "redirect:/features";
    }


}
