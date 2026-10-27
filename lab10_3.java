interface FanState {
    void pull(Fan fan);
}

class OffState implements FanState {
    public void pull(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is now at LOW speed");
    }
}

class LowState implements FanState {
    public void pull(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is now at MEDIUM speed");
    }
}

class MediumState implements FanState {
    public void pull(Fan fan) {
        fan.setState(new HighState());
        System.out.println("Fan is now at HIGH speed");
    }
}

class HighState implements FanState {
    public void pull(Fan fan) {
        fan.setState(new OffState());
        System.out.println("Fan is now OFF");
    }
}

class Fan {
    private FanState state = new OffState();

    public void setState(FanState state) { this.state = state; }

    public void pullChain() { state.pull(this); }
}

public class lab10_3 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        for (int i = 0; i < 5; i++) fan.pullChain();
    }
}
