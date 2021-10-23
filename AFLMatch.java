import java.util.Scanner;
public class AFLMatch {
    private String homeTeam, awayTeam;
    private int homeGoal = 6;
    private int homeBehind = 1;
    private int awayGoal = 6;
    private int awayBehind = 1;

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeGoal() {
        return homeGoal;
    }

    public void setHomeGoal(int homeGoal) {
        this.homeGoal = homeGoal;
    }

    public int getHomeBehind() {
        return homeBehind;
    }

    public int getAwayGoal() {
        return awayGoal;
    }

    public void setAwayGoal(int awayGoal) {
        this.awayGoal = awayGoal;
    }

    public int getAwayBehind() {
        return awayBehind;
    }

    public void setAwayBehind(int awayBehind) {
        this.awayBehind = awayBehind;
    }

    public void setHomeBehind(int homeBehind) {
        this.homeBehind = homeBehind;
    }

    public static void main(String args[]) {
        AFLPlayer obj = new AFLPlayer();
        obj.setNumber('1');
        obj.setFirstName("Adam");
        obj.setLastName("Treloar");
        obj.setPosition("COACH");

        System.out.println(obj.getNumber() + " " + obj.getFirstName() + " " + obj.getLastName() + " " + obj.getPosition());

        AFLMatch obj1 = new AFLMatch();
        Scanner sc = new Scanner(System.in);
        int homebehind = 0, homegoal = 0, awaybehind = 0, awaygoal = 0, homescore = 0,awayscore = 0;
        for (int j = 1; j < 6; j++) {
            System.out.println("Which team scored ?");
            char userinput1 = sc.next().charAt(0);
            System.out.println("Goal or behind ?");
            char userinput2 = sc.next().charAt(0);

            for (int i = 0; i < j; i++) {
                if (userinput1 == 'h' && userinput2 == 'b') {
                     homebehind = homebehind + 1;

                } else if (userinput1 == 'h' && userinput2 == 'g') {
                     homegoal = homegoal + 6;

                } else if (userinput1 == 'a' && userinput2 == 'b') {
                     awaybehind = awaybehind + 1;

                } else if (userinput1 == 'a' && userinput2 == 'g') {
                     awaygoal = awaygoal + 6;
                    //System.out.println("Score is :"+homescore+ "to" +awayscore);
                }
                homescore = homegoal + homebehind;
                awayscore = awaygoal + awaybehind;
            }

            System.out.println("The current score is "+ homescore + " to " + awayscore);
        }
    }
}




