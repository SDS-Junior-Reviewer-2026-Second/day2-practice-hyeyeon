import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    available
    static void daysGo (ArrayList<Integer> availableRoomList) {
        for (int t = 0; t < availableRoomList.size(); t++) {
            if (availableRoomList.get(t) == 0) continue;
            availableRoomList.set(t, availableRoomList.get(t) - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(0,0,4,2,0,0,1));
        run(lst);
    }
}
