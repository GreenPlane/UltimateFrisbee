import java.util.ArrayList;

public class UltimateTeam {
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;
    private String strCoach = "COACHES\n";
    private String strPlayer = "\nPLAYERS\n";
    private String strCutters = "";
    private String strHandlers = "";
    private ArrayList<UltimatePlayer> cutters = new ArrayList<UltimatePlayer>();
    private ArrayList<UltimatePlayer> handlers = new ArrayList<UltimatePlayer>();


    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
        this.players = players;
        this.coaches = coaches;

        for (Coach coach : coaches){
            strCoach += coach + "\n";
        }

        for (UltimatePlayer player : players){
            strPlayer += player + "\n";
        }
    }

    public String getCutters(){
        for (UltimatePlayer player : players){
            if (player.getPosition().equals("cutter")){
                cutters.add(player);
                strCutters += player + "\n";
            }
        }
        return strCutters;
    }

    public String getHandlers(){
        for (UltimatePlayer player : players){
            if (player.getPosition().equals("handler")){
                handlers.add(player);
                strHandlers += player + "\n";
            }
        }

        return strHandlers;
    }

    @Override
    public String toString(){
        return strCoach + strPlayer;
        }
    }
