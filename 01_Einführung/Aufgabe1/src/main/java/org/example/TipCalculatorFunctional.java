package org.example;

import java.util.List;

public class TipCalculatorFunctional {

    public static int calculateTipPercentage(List<String> customers){
        if (customers.size() > 5) {
            return 20;
        } else if (!customers.isEmpty()) {
            return 10;
        } else {
            return 0;
        }
        }
    }
