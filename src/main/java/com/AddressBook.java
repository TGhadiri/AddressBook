package com;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public AddressBook(ArrayList arrayList) {
        this.buddies=arrayList;
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void setBuddies(List<BuddyInfo> buddies){
        buddies= buddies;
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    @Override
    public String toString(){

        String result="";
        for(BuddyInfo buddy : buddies ){
            result += buddy.toString() + '\n';
        }
        return result;
    }

    public static void main(String [] args) {
//        System.out.println("First test");
//        com.AddressBook myBook = new com.AddressBook();
//        com.BuddyInfo John = new com.BuddyInfo("John", "Bank", "2345");
//        com.BuddyInfo Mary = new com.BuddyInfo("Mary", "Kent", "04389");
//        myBook.addBuddy(John);
//        myBook.addBuddy(Mary);
//        System.out.println(myBook.toString());

        Launcher launcher = new Launcher();
        launcher.launch();
    }


}
