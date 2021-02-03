package demo;

import demo.store.ICommodity;
import demo.store.impl.CardCommodityService;
import demo.store.impl.CouponCommodityService;
import demo.store.impl.GoodsCommodityService;

/**
 * ⼯⼚模式
 * */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
