package sustainable;

import java.util.LinkedList;

public class user {
    private String name;
    private static int friends;
    static LinkedList<user> friendsArr;
    private int score;

    public user(String n) {
        assert n != null;
        name= n;
        friends= 0;
        score= 0;
        friendsArr= new LinkedList<>();
    }

    public user(String n, int f, int s) {
        assert n != null;
        assert f >= 0 && s >= 0;
        name= n;
        friends= f;
        score= s;
        friendsArr= new LinkedList<>();
    }

    public String name() {
        return name;
    }

    public int friends() {
        return friends;
    }

    public int score() {
        return score;
    }

    public int addPoints(String p) {
        int p1= Integer.parseInt(p);
        if (p1 == 1) {
            score+= 10;
        } else if (p1 == 2) {
            score+= 15;
        } else if (p1 == 3) {
            score+= 20;
        } else if (p1 == 4) {
            score+= 15;
        } else if (p1 == 5) {
            score+= 10;
        } else if (p1 == 6) {
            score+= 15;
        } else if (p1 == 7) {
            score+= 10;
        } else if (p1 == 8) {
            score+= 20;
        }
        return score;
    }

    public void addFriends(String s) {
        assert s != null;
        String[] arrOfStr= s.split(" ");
        for (int i= 0; i < arrOfStr.length; i++ ) {
            if (i != arrOfStr.length - 1) {
                System.out.print(arrOfStr[i] + ", ");
            } else {
                System.out.println(arrOfStr[i]);
            }
        }
    }

    public String opportunities() {
        return " - Ithaca ReUse Center: 214 Elmira Road, Ithaca, New York \n - IthaCan& Bottle Return: 614 Elmira Road, Ithaca, New York \n - Thrifty Shopper: 376 Elmira Road, Ithaca, New York \n - Climate Action Week: November 14-18th, 2022";
    }

}
