package com.luan.gravity.exceptions;

import com.luan.gravity.mode.GravityType;

public class GravityTypeNotAllowedException extends Exception{

    public GravityTypeNotAllowedException(GravityType gravityType, int currentLevel) {
        super(String.format("Gravity Type: %s not allowed with level %s!" , gravityType.name(), currentLevel));
    }
}
