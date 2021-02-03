package demo.store.impl;

import com.alibaba.fastjson.JSON;
import demo.store.ICommodity;
import goods.DeliverReq;
import goods.GoodsService;

import java.util.Map;

public class GoodsCommodityService implements ICommodity {
    private GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
    }
}
