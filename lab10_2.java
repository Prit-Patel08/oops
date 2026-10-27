import java.util.ArrayList;
import java.util.List;

interface ScoreObserver {
    void update(int runs, int wickets, double overs);
}

class MobileApp implements ScoreObserver {
    public void update(int runs, int wickets, double overs) {
        System.out.println("Mobile App : India " + runs + "/" + wickets + " (" + overs + " overs)");
    }
}

class TVDisplay implements ScoreObserver {
    public void update(int runs, int wickets, double overs) {
        System.out.println("TV Display : India " + runs + "/" + wickets + " (" + overs + " overs)");
    }
}

class Website implements ScoreObserver {
    public void update(int runs, int wickets, double overs) {
        System.out.println("Website : India " + runs + "/" + wickets + " (" + overs + " overs)");
    }
}

class ScoreBoard {
    private List<ScoreObserver> observers = new ArrayList<>();

    public void addObserver(ScoreObserver observer) { observers.add(observer); }

    public void setScore(int runs, int wickets, double overs) {
        for (ScoreObserver observer : observers) observer.update(runs, wickets, overs);
    }
}

public class lab10_2 {
    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard();
        board.addObserver(new MobileApp());
        board.addObserver(new TVDisplay());
        board.addObserver(new Website());
        board.setScore(120, 3, 15.2);
    }
}
