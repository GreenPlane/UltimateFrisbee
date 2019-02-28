public class Captain extends UltimatePlayer {
    private boolean type;
    private String captainType;

    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);

        this.type = type;

        if (type == true){
            captainType = "offense";
        }
        else{
            captainType = "defense";
        }
    }

    public String toString(){
        return super.toString() + "\n   Captain: " + captainType;
    }
}
