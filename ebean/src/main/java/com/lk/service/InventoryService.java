package com.lk.service;

import com.lk.entity.Inventory;
import io.ebean.EbeanServer;
import io.ebean.PagedList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InventoryService {
    @Resource
    private EbeanServer server;

    public PagedList<Inventory> getPage(Integer pageNo, Integer pageSize) {
        if (pageNo == null) {
            pageNo = 0;
        }
        if (pageSize == null) {
            pageSize = 20;
        }
        return server.find(Inventory.class).setFirstRow(pageNo * pageSize).setMaxRows(pageSize).findPagedList();
    }

    public void addList(List<Inventory> list) {
        server.saveAll(list);
    }
}
