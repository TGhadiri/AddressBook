package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;

@Controller
@RequestMapping("/books")
public class AddressBookRestController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    //Part 1: serving the get request from client (first load of the page)
    @GetMapping(value="/getbuddies")
    public String getbuddies(Model model) {
        model.addAttribute("buddies", buddyInfoRepository.findAll());
        model.addAttribute("buddyInstance", new BuddyInfo());
        return "buddyinfo";
    }

    //Part 1: serving the post request of client; update the repo
    @PostMapping("/getbuddies")
    public String buddySubmit(@ModelAttribute BuddyInfo buddyInfo) {
        buddyInfoRepository.save(buddyInfo);
        return "result";
    }

    //Part 2: serving the get request from client (first load of the page)
    @GetMapping(value="/getbuddiesjson")
    public String getbuddiesjson(Model model) {
        model.addAttribute("buddyInstance", new BuddyInfo());
        return "buddyinfojson";
    }

    // Part 2: serving the post from client; returning a list of buddies in the repo
    @PostMapping(value="/getbuddiesjson", produces = "application/json")
    @ResponseBody
    public List<BuddyInfo> buddySubmitJson(@ModelAttribute BuddyInfo buddyInfo) {
        buddyInfoRepository.save(buddyInfo);
        return (List<BuddyInfo>) buddyInfoRepository.findAll();
    }
}
