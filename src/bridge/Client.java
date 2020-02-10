package bridge;

import bridge.abstraction.Android;
import bridge.abstraction.IOS;
import bridge.abstraction.Phone;
import bridge.implementer.Apple;
import bridge.implementer.HuaWei;
import bridge.implementer.OS;

public class Client {
    public static void main(String[] args) {
        OS appleOS = new Apple();
        Phone iPhone = new IOS(appleOS);
        iPhone.open();
        iPhone.call();
        iPhone.close();

        OS huaWeiOS = new HuaWei();
        Phone huaWeiPhone = new Android(huaWeiOS);
        huaWeiPhone.open();
        huaWeiPhone.call();
        huaWeiPhone.close();
    }
}
