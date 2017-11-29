package microblogtwo;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MicroBlogTwo {

// *
    // @author ksiegel
    ///
    static String url, p, userName, firstName, lastName, emailAddr, choice, userNumber, needName, needpost;
    static int blogno = 5;
    static String blno, curP, needPost, name;
    static int blogn, bloggno, uchoice, userNumb, userNum, userNo, currentPost;
    static int nom = 0;
    static Scanner read2 = new Scanner(System.in);

    public static ArrayList menu1(ArrayList<User> userArray) {

        User usernew = new User(userNum, url, userName, firstName, lastName, emailAddr);
        {
            usernew.getUserInfo(userArray);
            userArray.add(usernew);
            return userArray;
        }
    }

    public static ArrayList menu3(ArrayList<Post> postArray) {

        Post postNew = new Post(userNo, userName, p, url, blogno);

        {
            postNew.getPostInfo();

            postArray.add(postNew);
            return postArray;
        }
    }

    static void printUser(ArrayList<User> userArray) {

        System.out.println("User List");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s%5s %38s %45s", "Url", "User Name", "Full Name ", "Email Address", "User Number");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int cnt = 0; cnt < userArray.size(); cnt++) {

            System.out.println(userArray.get(cnt) + "   User Number: " + (cnt + 1));
        }

    }

    static void printPost(ArrayList<Post> postArray) {
        System.out.println("Blog Posts");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s %30s %15s %45s %55s", "User No", "User Name", "URL", "Blog Post", "Blog No");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int cnt = 0; cnt < postArray.size(); cnt++) {
            System.out.println(postArray.get(cnt));
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static String menuChoice(String choice) {
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Main Menu");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Please select from one of the following options");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1. Create a new user");
        System.out.println("2. Beome an existing user");
        System.out.println("3. Create a post as the current user");
        System.out.println("4. Print all post");
        System.out.println("5. Print all users");
        System.out.println("6. Quit");
        System.out.println("Enter choice here:  ");

        Scanner read = new Scanner(System.in);
        choice = read.nextLine();
        return choice;

    }

    public static void main(String[] args) {

        boolean answer = true;

        ArrayList<User> userArray = new ArrayList<>();
        User newUser1 = new User(1, "NorthPole001.com       ", " ChrisKringle", "Santa ", "Clause ", "1northpole@yahoo.com");
        User newUser2 = new User(2, "RabbitHole10.com        ", " BunnyHoppe", "Easter ", "Bunny", " basketofeggs@gmail.com");
        User newUser3 = new User(3, "PumpkinPatch.com       ", " OneandOnly ", "Great", "Pumpkin", " WaitingforGodot.com");
        User newUser4 = new User(4, "wizards&wand.com        ", "GreatWizard ", "Wizard", "of Oz", " notinKansasanymore.com");
        User newUser5 = new User(5, "candyisdandy!.com       ", " Wonkamann", " Willie", "Wonka", " candymancan.com");
        User newUser6 = new User(6, "duckducknogo.com       ", " Donneyduck", "Donald", "Duck ", " imnotdaffy.com");

        userArray.add(newUser1);
        userArray.add(newUser2);
        userArray.add(newUser3);
        userArray.add(newUser4);
        userArray.add(newUser5);
        userArray.add(newUser6);

        ArrayList<Post> postArray = new ArrayList<>();

        Post newPost1 = new Post(1, "Chris        ", "Christmas is on its way! And all the presents are wrapped", "  1northpolesnow.com ", 1);
        Post newPost2 = new Post(2, "BunnyHop", "Here comes Peter Cottontail hopping down the bunny trail", "  basketofeggs@gmail.com", 2);
        Post newPost3 = new Post(3, "OneandOnlyOne", "Wait in the pumpkin patch, when the moon is full !!!!!!!!", "  WaitingforGodot.com,3", 3);
        Post newPost4 = new Post(5, "Wonkaman", "Candy is dandy and I make the best around. You should try", "  dandycandyandnuts.org", 4);
        Post newPost5 = new Post(3, "OneandOnlyOne", "The Great Pumpkin is here! and I saw him myself, twice!", "  WaitingforGodot.com,", 5);

        postArray.add(newPost1);
        postArray.add(newPost2);
        postArray.add(newPost3);
        postArray.add(newPost4);
        postArray.add(newPost5);

        while (answer) {

//Run main menu
            String mychoice = menuChoice(choice);

// if user choose 1, set up for new user
            if (mychoice.equals("1")) {

                menu1(userArray);

                //if user choose 2 - user selects from a list of existing users
            } else if (mychoice.equals("2")) {

                while (true) {
                    for (int a = 0; a < userArray.size(); a++) {
                        int b = a + 1;
                        System.out.println(b + "  " + userArray.get(a).getuserName());
                    }

                    try {

                        uchoice = read2.nextInt();

                        User curUser = (userArray.get(uchoice - 1));

                        System.out.println("You are user  " + curUser.getuserName() + "  What would you like to do?");
                        break;

                    } catch (Exception e) {

                        System.out.println("Incorrect entry please select a user number from the userlist displayed.,continue");
                        read2.next();
                    }
                }

                // if a user selects 3 - user may post a blog
            } else if (mychoice.equals("3")) {
                try {
                    boolean poster = true;
                    User curUser = (userArray.get(uchoice - 1));
                    currentPost = (curUser.getuserNumb());
                    needName = userArray.get(currentPost - 1).getuserName();

                    for (int j = 0; j < postArray.size(); ++j) {

                        nom = postArray.get(j).getuserNo();

                        if (nom == (currentPost)) {

                            bloggno = postArray.get(j).getId();

                            needpost = postArray.get(j).getP();

                            needName = postArray.get(j).getuserName();
                            poster = false;
                        }
                    }

                    if (poster == false) {
                        System.out.println("Your user number:  " + currentPost + "   " +  "User Name  " + needName +    "  Last post was:    " + needpost + "   your blog no is:  " + bloggno);

                    } else {
                        System.out.println(" Hello  " + needName + "   Start your first post!!!");
                        
                    }

                    for (int c = 5; c <= postArray.size(); c++) {

                        blogn = c + 1;
                    }
                    menu3(postArray);
                } catch (Exception e) {
                    System.out.println("Please reselect #2 on the main menu to choose a user ");

                }

                // if user selects 4 - print out post array
            } else if (mychoice.equals("4")) {
                printPost(postArray);

                //if user selects 5 j- prints out user array
            } else if (mychoice.equals("5")) {
                printUser(userArray);

            } else if (mychoice.equals("6")) {
                System.exit(0);
            } else {
                System.out.println("Illegal entry.  Enter menu choice 1-6");
            }
        }
    }
}
