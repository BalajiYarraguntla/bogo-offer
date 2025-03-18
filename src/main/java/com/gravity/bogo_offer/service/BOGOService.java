package com.gravity.bogo_offer.service;

import com.gravity.bogo_offer.model.BOGOResponse;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BOGOService {

    public BOGOResponse calculateBOGO(List<Integer> productPrices) {
        // Sort in descending order
        productPrices.sort(Collections.reverseOrder());

        List<Integer> payableItems = new ArrayList<>();
        List<Integer> discountedItems = new ArrayList<>();

        // Process pairs for BOGO
        for (int i = 0; i < productPrices.size(); i++) {
            if (i % 2 == 0) {
                payableItems.add(productPrices.get(i));
            } else {
                discountedItems.add(productPrices.get(i));
            }
        }

        return new BOGOResponse(payableItems, discountedItems);
    }
}
