public class UltimatePlayer extends Person{
    private int jerseyNumber;
    private static int num = 1;
    private String position;

    public UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        position.toLowerCase();

        if (!(position.equals("handler") || (position.equals("cutter")))){
            this.position = "handler";
        }
        else{
            this.position = position;
        }

        this.jerseyNumber = num;
        num++;
    }

    public String getPosition(){
        return position;
    }

    public String toString(){
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }
}
