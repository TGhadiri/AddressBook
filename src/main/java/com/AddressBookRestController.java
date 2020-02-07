package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class AddressBookRestController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    private static final String template = "Hello!";

    @PostMapping(value="/addressbook", produces = "application/json")
    @ResponseBody
    public AddressBook createAddressBook() {
        AddressBook ab = new AddressBook();
        BuddyInfo bi = new BuddyInfo("Tra" , "ashgv", "12");
        ab.addBuddy(bi);
        addressBookRepository.save(ab);
        return ab;
    }
    //We are doing a get to retrieve the buddies saved on the addressbook
    @GetMapping(value="/addressbooks", produces = "application/json")
    @ResponseBody
    public Iterable<AddressBook> retrieveAll() {
        return addressBookRepository.findAll();
    }

//    @RequestMapping(value="", method = RequestMethod.DELETE)
//    public void removeBuddy(@RequestParam Long id) {
//        optional<AddressBook> = addressBookRepository.findById(id);
//        addressBookRepository.delete(buddyInfoRepository.findById(id));
//    }
}

//@RestController
//public class AddressBookRestController {
//
//    @Autowired
//    private BuddyInfoRepository buddyInfoRepo;
//    private static final String template = "Hello, %s!";
//
//    @RequestMapping(value="/buddyInfo/buddyInfo", method = RequestMethod.POST)
//    public BuddyInfo buddyInfo(@RequestBody BuddyInfo bi) {
//        buddyInfoRepo.save(bi);
//        return bi;
//
//    @RequestMapping(value="/buddyInfo/buddyInfo", method = RequestMethod.DELETE)
//    public void removeBuddy(@RequestParam Long id) {
//        bud = buddyInfoRepo.findById(id);
//        buddyInfoRepo.delete(bud);
//        //buddyInfoRepo.deleteById();
//    }
//}



