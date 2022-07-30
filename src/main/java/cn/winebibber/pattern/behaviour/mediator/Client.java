package cn.winebibber.pattern.behaviour.mediator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description:
 */
public class Client {
    public static void main(String[] args) {

        MediatorStructure mediator = new MediatorStructure();
        Tenant tenant = new Tenant("阿飞", mediator);
        HouseOwner houseOwner = new HouseOwner("包租婆", mediator);

        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.constact("我要租一个单间");
        houseOwner.constact("我这有，你要租吗？");
    }
}
