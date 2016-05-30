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

package com.symbio.supplyQuery.bean;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.symbio.supplyQuery.domain.ProductRawMaterial;
import com.symbio.supplyQuery.domain.ProvisionTimeline;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Zhang Wuhui on 4/20/16
 */
@Component
public class DataSource {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSource.class);
    @Autowired
    private ResourceLoader resourceLoader;
    private List<ProductRawMaterial> productRawMaterials = Lists.newArrayList();
    private List<ProvisionTimeline> provisionTimelines = Lists.newArrayList();
    @PostConstruct
    private void init(){
        try {
            productRawMaterials = JSON.parseArray(loadJson("productRawMaterials.json"), ProductRawMaterial.class);
            provisionTimelines = JSON.parseArray(loadJson("provisionTimelines.json"), ProvisionTimeline.class);
        }catch(Exception e) {
            LOGGER.error("load events.json failed",e);
        }
    }

    private String loadJson(String fileName) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:"+ fileName);
        File file = resource.getFile();
        return IOUtils.toString(file.toURI());
    }

}
