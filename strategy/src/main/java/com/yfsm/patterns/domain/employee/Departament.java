package com.yfsm.patterns.domain.employee;

public enum Departament {

    SALES(0.9),
    FINANCE(0.7),
    IT(1.1);

    public final double fixedValueAdjustIntern;

    public double getFixedValueAdjustIntern() {
        return fixedValueAdjustIntern;
    }

    Departament(double fixedValueAdjustIntern) {
        this.fixedValueAdjustIntern = fixedValueAdjustIntern;
    }
}
