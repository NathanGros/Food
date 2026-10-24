package com.bignat.viktus;

import java.io.Serializable;

public class Supply implements Serializable {
    public String name;
    public double quantity;
    public Unit unit;
    // Checkbox mode: is it ticked. Status mode: true = checkmark, false = cross.
    public boolean checked;

    public Supply(String name, double quantity, Unit unit, boolean checked) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.checked = checked;
    }
}