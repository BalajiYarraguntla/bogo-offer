package com.gravity.bogo_offer.controller;

import com.gravity.bogo_offer.model.BOGOResponse;
import com.gravity.bogo_offer.service.BOGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bogo")
public class BOGOController {

    @Autowired
    private BOGOService bogoService;

    @PostMapping("/calculate")
    public BOGOResponse calculateBOGO(@RequestBody List<Integer> productPrices) {
        return bogoService.calculateBOGO(productPrices);
    }
}

