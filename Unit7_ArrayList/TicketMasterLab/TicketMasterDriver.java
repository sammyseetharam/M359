package Unit7_ArrayList.TicketMasterLab;
import java.io.File;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster master = new TicketMaster();
        master.fillArrayList();
        System.out.println(master);
        System.out.println();
        master.citySearch();
    }
}
