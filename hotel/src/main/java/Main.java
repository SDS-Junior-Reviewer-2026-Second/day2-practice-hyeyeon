import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //함수는 동작을 의미한다
    //함수명은 동작을 표현해주어야 한다
    //동사가 먼저 나오는 이름을 권장한다
    //일수가 감수 / 추가할 경우

    static void decreaseDays (ArrayList<Integer> remainingDays) {
        for (int i = 0; i < remainingDays.size(); i++) {
            //주석으로 작성하는 것보다 그냥 변수명으로 작성하기
            int remainingDay = remainingDays.get(i);
            if (remainingDay == 0) continue;
            remainingDays.set(i, remainingDay - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(0,0,4,2,0,0,1));
        run(lst);
    }
}
