package microblogtwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ksiegel
 */
public class User {

    Scanner read = new Scanner(System.in);

    private String userName, url, firstName, lastName, emailAddr;
    private int userNumb, userNum;

    public User(int userNumb, String url, String userName, String firstName, String lastName, String emailAddr) {
        this.userNumb = userNumb;
        this.url = url;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddr = emailAddr;
    }

    private void setuserNumb(int userNo) {
        this.userNumb = userNumb;
    }

    public int getuserNumb() {
        return userNumb;

    }

    private void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserName() {
        return this.userName;

    }

    private void setfirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getfirstName() {

        return this.firstName;

    }

    private void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getlastName() {
        return this.lastName;
    }

    private void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    private void setemailAddr(String emailAddr) {
        this.emailAddr = emailAddr;

    }

    public String getemailAddr() {
        return this.emailAddr;
    }

    public User getUserInfo(ArrayList userArray) {

        User user = new User(userNumb, url, userName, firstName, lastName, emailAddr);
        userNum = userArray.size();
        userNumb = userNum + 1;
        setuserNumb(userNumb);

        System.out.println("Please enter the following :Your url:  ");
        url = read.nextLine();
        setUrl(url);

        System.out.println("Username:  ");
        userName = read.nextLine();
        setuserName(userName);

        System.out.println("First name: ");
        firstName = read.nextLine();
        setfirstName(firstName);

        System.out.println("Last name: ");
        lastName = read.nextLine();
        setlastName(lastName);

        System.out.println("email address: ");
        emailAddr = read.nextLine();
        setemailAddr(emailAddr);

        return user;

    }

    @Override
    public String toString() {
        return "Url:   " + url + "  User Name:   " + userName + "    Full Name " + firstName + "   " + lastName + "     Email Address:   " + emailAddr;
    }

}
