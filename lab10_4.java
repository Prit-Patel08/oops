interface PhoneMode {
    void receiveCall();
    void pressModeButton(Phone phone);
}

class NormalMode implements PhoneMode {
    public void receiveCall() { System.out.println("Incoming call: Ring ring!"); }
    public void pressModeButton(Phone phone) {
        phone.setMode(new VibrateMode());
        System.out.println("Mode changed to VIBRATE");
    }
}

class VibrateMode implements PhoneMode {
    public void receiveCall() { System.out.println("Incoming call: Bzzz bzzz..."); }
    public void pressModeButton(Phone phone) {
        phone.setMode(new SilentMode());
        System.out.println("Mode changed to SILENT");
    }
}

class SilentMode implements PhoneMode {
    public void receiveCall() { System.out.println("Incoming call: (no sound, screen lights up)"); }
    public void pressModeButton(Phone phone) {
        phone.setMode(new NormalMode());
        System.out.println("Mode changed to NORMAL");
    }
}

class Phone {
    private PhoneMode mode = new NormalMode();

    public void setMode(PhoneMode mode) { this.mode = mode; }
    public void receiveCall() { mode.receiveCall(); }
    public void pressModeButton() { mode.pressModeButton(this); }
}

public class lab10_4 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.receiveCall();
        phone.pressModeButton();
        phone.receiveCall();
        phone.pressModeButton();
        phone.receiveCall();
    }
}
