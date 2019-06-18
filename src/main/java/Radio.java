public class Radio implements IPlay{

    private String station;


    public Radio(String station){
        this.station = station;
    }

    public void tune(String selectedStation){
        this.station = selectedStation;
    }

    public String getStation(){
        return this.station;
    }

    public String play(){
        return "la la la, playing hits from " + this.station;
    }


}
