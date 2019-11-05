package Generic;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        printDouble(list);


        FootballPlayer akshay = new FootballPlayer("Akshay");
        FootballPlayer mohit = new FootballPlayer("Mohit");
        FootballPlayer rohit = new FootballPlayer("Rohit");
        FootballPlayer nitin = new FootballPlayer("Nitin");
        FootballPlayer sahil = new FootballPlayer("Sahil");


        SoccerPlayer jatin = new SoccerPlayer("Jatin");
        SoccerPlayer ritika = new SoccerPlayer("Ritika");
        SoccerPlayer nidhi = new SoccerPlayer("Nidhi");
        SoccerPlayer poonam = new SoccerPlayer("Poonam");
        SoccerPlayer priyanka = new SoccerPlayer("Priyanka");


        Team<FootballPlayer> footballTeam = new Team<>("Gujarat Team");
        footballTeam.addPlayer(akshay);
        footballTeam.addPlayer(mohit);
        footballTeam.addPlayer(rohit);


        Team<FootballPlayer> footballPlayerTeam = new Team<>("Haryana Team");
        footballPlayerTeam.addPlayer(nitin);
        footballPlayerTeam.addPlayer(sahil);

        System.out.println(footballTeam.numberOfPlayer());



        Team<SoccerPlayer> soccerTeam = new Team<>("Chandigarh Team");
        soccerTeam.addPlayer(jatin);
        soccerTeam.addPlayer(ritika);
        soccerTeam.addPlayer(nidhi);


        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Delhi Team");
        soccerPlayerTeam.addPlayer(poonam);
        soccerPlayerTeam.addPlayer(priyanka);


        System.out.println(soccerTeam.numberOfPlayer());

        footballTeam.matchResult(footballPlayerTeam,1,0);
        soccerTeam.matchResult(soccerPlayerTeam,5,2);
        soccerTeam.matchResult(soccerPlayerTeam,2,2);

        System.out.println(footballTeam.ranking());
        System.out.println(soccerPlayerTeam.ranking());









    }

//    private static void printDouble(ArrayList<Integer> n){
//        for (int i: n) {
//            System.out.println(i * 2);
//        }
//    }
}
