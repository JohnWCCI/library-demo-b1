package com.wecancodeit.library.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wecancodeit.library.Models.Campus;
import com.wecancodeit.library.Repositories.CampusRepository;

import jakarta.annotation.Resource;

@Controller
public class CampusController {

    @Resource
    private CampusRepository campusRepository;

    @RequestMapping({ "", "/", "/campuses","john" })
    public String displayCampuses(Model model) {
        model.addAttribute("campuses", campusRepository.findAll());
        return "campusesView";
    }

    @GetMapping("/campuses/{location}")
    public String displaySingleCampus(@PathVariable String location, Model model) {
        Campus campus = campusRepository.findCampusByLocation(location);
        model.addAttribute("campus", campus);
        return "campusView";
    }

    @PostMapping("/add-campus")
    public String addCampus(@RequestParam String location) {
        Campus campus = campusRepository.findCampusByLocation(location);
        if (campus == null) {
            campus = new Campus(location);
            campusRepository.save(campus);
        }
        return "redirect:campuses";
    }

}
