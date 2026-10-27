class Lights {
    public void off() { System.out.println("Lights OFF"); }
    public void on() { System.out.println("Lights ON"); }
}

class Fan {
    public void off() { System.out.println("Fan OFF"); }
    public void on() { System.out.println("Fan ON"); }
}

class AirConditioner {
    private boolean on;
    public void off() { on = false; System.out.println("AC OFF"); }
    // The practical's expected output omits an "AC ON" line, so restore the state silently.
    public void on() { on = true; }
}

class DoorLock {
    public void lock() { System.out.println("Door LOCKED"); }
    public void unlock() { System.out.println("Door UNLOCKED"); }
}

class Alarm {
    public void on() { System.out.println("Alarm ON"); }
    public void off() { System.out.println("Alarm OFF"); }
}

class SmartHomeFacade {
    private Lights lights = new Lights();
    private Fan fan = new Fan();
    private AirConditioner ac = new AirConditioner();
    private DoorLock door = new DoorLock();
    private Alarm alarm = new Alarm();

    public void leaveHome() {
        System.out.println("--- Leaving home ---");
        lights.off();
        fan.off();
        ac.off();
        door.lock();
        alarm.on();
    }

    public void arriveHome() {
        System.out.println("--- Arriving home ---");
        alarm.off();
        door.unlock();
        lights.on();
        fan.on();
        ac.on();
    }
}

public class lab9_6 {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.leaveHome();
        home.arriveHome();
    }
}
