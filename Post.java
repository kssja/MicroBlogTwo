package microblogtwo;

import microblogtwo.MicroBlogTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class Post {

    private String url, p;
    private int blogno, userNo;
    private String userChoice, userName, user;
    private Object curUser;
    private String needName;

    public Post(int userNo, String userName, String p, String url, int blogno) {
        this.userNo = userNo;
        this.userName = userName;
        this.p = p;
        this.url = url;
        this.blogno = blogno;
    }

    public int getuserNo() {
        return userNo;
    }

    public void setuserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getId() {
        return this.blogno;
    }

    public void setId(int blogno) {
        this.blogno = blogno;
    }

    public String getuserName() {
        return this.userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public void setUrl(String url) {
        this.url = url;

    }

    public String getUrl() {
        return this.url;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getP() {
        return this.p;
    }

    public void getPostInfo() {
        ArrayList<Post> postArray = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        userNo = MicroBlogTwo.currentPost;
        setuserNo(userNo);

        userName = MicroBlogTwo.needName;
        setuserName(userName);

        blogno = MicroBlogTwo.blogn;
        setId(blogno);

        System.out.println("BlogPost :     ");
        p = read.nextLine();
        setP(p);

        System.out.println("Please enter the following :Your url:  ");
        url = read.nextLine();
        setUrl(url);

    }

    @Override
    public String toString() {

        return "User Number:  " + userNo + "    User Name:  " + userName + " \t Url: " + url + "\t\tBlog Post:  " + p + " \t Blog No:  " + blogno;

    }

}
