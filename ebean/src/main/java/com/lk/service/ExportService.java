package com.lk.service;

import com.lk.entity.Export;
import io.ebean.EbeanServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExportService {
    @Resource
    private EbeanServer server;

    public List<Export> getList() {
        return server.find(Export.class).findList();
    }
}
