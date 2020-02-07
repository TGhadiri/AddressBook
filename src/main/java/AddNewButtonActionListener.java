import com.BuddyInfo;

import java.awt.event.ActionEvent;

public class AddNewButtonActionListener extends ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        BuddyInfo buddy = new BuddyInfo("Carl","Spring","2456");
        list.add ("buddy: " +  buddy);
        table.revalidate();
    }
}