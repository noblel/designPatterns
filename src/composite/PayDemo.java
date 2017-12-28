package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noblel
 */
class PayDemo {
    public abstract class Market {
        String name;

        public abstract void add(Market m);

        public abstract void remove(Market m);

        public abstract void payByCard();
    }

    /**
     * 分店 下面可以有加盟店
     */
    public class MarketBranch extends Market {
        /**
         * 加盟店列表
         */

        List<Market> list = new ArrayList<Market>();

        public MarketBranch(String s) {
            this.name = s;
        }

        @Override
        public void add(Market m) {
            list.add(m);
        }

        @Override
        public void remove(Market m) {
            list.remove(m);
        }

        /**
         * 消费之后，该分店下的加盟店自动累加积分
         */
        @Override
        public void payByCard() {
            System.out.println(name + "消费,积分已累加入该会员卡");
            for (Market m : list) {
                m.payByCard();
            }
        }
    }

    /**
     * 加盟店 下面不在有分店和加盟店，最底层
     */
    public class MarketJoin extends Market {
        public MarketJoin(String s) {
            this.name = s;
        }

        @Override
        public void add(Market m) {
        }

        @Override
        public void remove(Market m) {
        }

        @Override
        public void payByCard() {
            System.out.println(name + "消费,积分已累加入该会员卡");
        }
    }
}
