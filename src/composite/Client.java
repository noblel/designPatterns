package composite;

/**
 * @author Noblel
 * 组合模式
 */
class Client {
    public static void main(String[] args) {
        PayDemo demo = new PayDemo();

        PayDemo.MarketBranch rootBranch = demo.new MarketBranch("总店");
        PayDemo.MarketBranch qhdBranch = demo.new MarketBranch("秦皇岛分店");
        PayDemo.MarketJoin hgqJoin = demo.new MarketJoin("秦皇岛分店一海港区加盟店");
        PayDemo.MarketJoin btlJoin = demo.new MarketJoin("秦皇岛分店二白塔岭加盟店");

        qhdBranch.add(hgqJoin);
        qhdBranch.add(btlJoin);
        rootBranch.add(qhdBranch);
        rootBranch.payByCard();
    }
}
