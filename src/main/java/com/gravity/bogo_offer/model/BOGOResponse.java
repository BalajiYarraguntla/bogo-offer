package com.gravity.bogo_offer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class BOGOResponse {
    private List<Integer> payableItems;
    private List<Integer> discountedItems;
}
