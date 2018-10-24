package com.lk.util;

import com.lk.entity.Inventory;
import com.lk.service.InventoryService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@Component
public class InventorySaveThread extends Thread {
    private static List<Thread> runningThreads = new ArrayList<>();

    private InventoryService service;
    private List<Inventory> list;
    private CountDownLatch threadsSignal;

    public InventoryService getService() {
        return service;
    }

    public void setService(InventoryService service) {
        this.service = service;
    }

    public List<Inventory> getList() {
        return list;
    }

    public void setList(List<Inventory> list) {
        this.list = list;
    }

    public InventorySaveThread() {

    }

    public InventorySaveThread(InventoryService service, List<Inventory> list, CountDownLatch threadsSignal) {
        super();
        this.service = service;
        this.list = list;
        this.threadsSignal = threadsSignal;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        save();
        threadsSignal.countDown();//线程结束时计数器减1
        System.out.println("录入结束:" + (System.currentTimeMillis() - start) + "还有" + threadsSignal.getCount() + " 个线程");
    }


    public void save() {
        service.addList(list);
    }
}
