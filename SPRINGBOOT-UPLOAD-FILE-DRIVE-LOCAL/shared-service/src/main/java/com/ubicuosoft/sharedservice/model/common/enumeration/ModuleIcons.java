package com.ubicuosoft.sharedservice.model.common.enumeration;

import lombok.Getter;

@Getter
public enum ModuleIcons {
    DASHBOARD(1,"faMicrochip"),
    DEVICE(2,"faMicrochip"),
    MAP(3,"faMicrochip"),
    ACCOUNT(4,"faMicrochip"),
    HELP_CENTER(5,"faMicrochip"),
    SETTING(6,"faMicrochip"),
    REPORT(7,"faMicrochip");

    private final Integer order;
    private final String icon;

    ModuleIcons(int order, String icon){
        this.order=order;
        this.icon=icon;
    }
}
