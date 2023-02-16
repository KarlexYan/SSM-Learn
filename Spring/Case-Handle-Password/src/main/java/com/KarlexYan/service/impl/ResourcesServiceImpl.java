package com.KarlexYan.service.impl;

import com.KarlexYan.dao.ResourcesDao;
import com.KarlexYan.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    private ResourcesDao resourcesDao;

    @Autowired
    public void setResourcesDao(ResourcesDao resourcesDao) {
        this.resourcesDao = resourcesDao;
    }

    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}
