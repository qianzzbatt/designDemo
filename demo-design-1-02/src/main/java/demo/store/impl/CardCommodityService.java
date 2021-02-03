package demo.store.impl;

import card.IQiYiCardService;
import demo.store.ICommodity;

import java.util.Map;

public class CardCommodityService implements ICommodity {
    private IQiYiCardService cardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        cardService.grantToken(uId,bizId);
    }

}
