package demo.store.impl;

import com.alibaba.fastjson.JSON;
import coupon.CouponResult;
import coupon.CouponService;
import demo.store.ICommodity;

import java.util.Map;

public class CouponCommodityService implements ICommodity {
    private CouponService couponService = new CouponService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }
}
