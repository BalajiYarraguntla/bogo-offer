package com.gravity.bogo_offer.service;

import com.gravity.bogo_offer.model.BOGOResponse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class BOGOServiceTest {

    private final BOGOService bogoService = new BOGOService();

    @Test
    void testCalculateBOGO() {
        // Given
        var productPrices = Arrays.asList(10, 20, 30, 40, 50, 60);

        // When
        BOGOResponse response = bogoService.calculateBOGO(productPrices);

        // Then
        assertEquals(Arrays.asList(60, 40, 20), response.getPayableItems());
        assertEquals(Arrays.asList(50, 30, 10), response.getDiscountedItems());
    }
}

