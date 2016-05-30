/*
 * Copyright (c) 2015 Igola Travel Consultant and Services Company Ltd.
 * www.igola.com
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Igola Travel Consultant and Services Company Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with Igola Travel Consultant and Services Company Ltd.
 */

package com.symbio.supplyQuery.domain;

import java.util.Date;

/**
 * @author Zhang Wuhui on 5/30/16
 */
public class ProvisionTimeline {
    String material;
    String start;
    String end;
    int amount;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}