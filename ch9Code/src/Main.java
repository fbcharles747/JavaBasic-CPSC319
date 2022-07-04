public class Main {
    public static void main(String[] args) {
        ITelephone charlesPhone;
        charlesPhone=new DeskPhone(123456);
        charlesPhone.powerOn();
        charlesPhone.callPhone(123456);
        charlesPhone.answer();

        charlesPhone=new MobilePhone(24564);
        charlesPhone.powerOn();
        charlesPhone.callPhone(24564);
        charlesPhone.answer();
    }
}
