interface TypeCCharger {
    void chargeTypeC();
}
class MicroUsbCharger {
    public void chargeMicroUsb() {
        System.out.println("Charging with Micro-USB charger");
    }
}
class MicroUsbToTypeCAdapter implements TypeCCharger {
    private MicroUsbCharger charger;
    public MicroUsbToTypeCAdapter(MicroUsbCharger charger) {
        this.charger = charger;
    }
    public void chargeTypeC() {
        System.out.println("Adapter converts Type-C request to Micro-USB");
        charger.chargeMicroUsb();
    }
}
class Phone {
    public void charge(TypeCCharger charger) {
        System.out.println("Phone asks for Type-C charging...");
        charger.chargeTypeC();
    }
}
public class lab9_2 {
    public static void main(String[] args) {
        MicroUsbCharger oldCharger = new MicroUsbCharger();
        TypeCCharger adapter = new MicroUsbToTypeCAdapter(oldCharger);
        Phone phone = new Phone();
        phone.charge(adapter);
    }
}
