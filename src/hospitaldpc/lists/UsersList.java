package hospitaldpc.lists;

import hospitaldpc.elements.User;
import java.util.ArrayList;

public class UsersList {

    private ArrayList<User> users;

    public UsersList() {
        this.users = new ArrayList<>();
    }//end constructor

    public void addUser(User user) {
        this.users.add(user);
    }//end addUser

    public User getUser(int index) {
        return this.users.get(index);
    }//end getUser

    public int sizeUserList() {
        return this.users.size();
    }//end sizeUserList

}//end class
