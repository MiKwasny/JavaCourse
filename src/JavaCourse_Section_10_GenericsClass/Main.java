package JavaCourse_Section_10_GenericsClass;

import sun.reflect.generics.scope.Scope;

public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer mat = new SoccerPlayer("Mat");
        Team<FootBallPlayer> adelaideCrows = new Team<>("Aleaide crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(mat);

        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseBallTeam = new Team<>("Chichacko pubs");
        baseBallTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("lalala");
        soccerTeam.addPlayer(mat);

        Team<FootBallPlayer> hawthorn = new Team<>("Hawtorn");
        Team<FootBallPlayer> fremantle = new Team<>("Freemantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        adelaideCrows.matchResult(baseBallTeam,1,1);
    }

}
