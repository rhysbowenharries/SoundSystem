import java.util.ArrayList;

public class CDPlayer extends Component{

    ArrayList<String> collectionOfCDs;

    public CDPlayer(String make, String model){
        super(make, model);
        this.collectionOfCDs = new ArrayList<String>();
    }

    public void insertCD(String selectedCD){
        this.collectionOfCDs.add(selectedCD);
    }


    public int disksInPlayer() {
       return this.collectionOfCDs.size();
    }

    public String selectCD(int diskNumber){
        return collectionOfCDs.get(diskNumber --);
    }
}
