package com.lk.controller;

import com.lk.entity.Inventory;
import com.lk.service.InventoryService;
import com.lk.util.InventoryReadUtil;
import io.ebean.PagedList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/inventory")
public class InventoryAct {
    @Resource
    private InventoryService service;
    @Resource
    private InventoryReadUtil readUtil;

    @RequestMapping("/list")
    public String list(Integer pageNo, Integer pageSize, ModelMap model) {
        PagedList<Inventory> pageList = service.getPage(pageNo, pageSize);
        List<Inventory> list = pageList.getList();
        model.addAttribute("list", list);
        model.addAttribute("totalCount", pageList.getTotalCount());
        model.addAttribute("totalPage", pageList.getTotalPageCount());
        return "inventory/list";
    }

    @RequestMapping("/read")
    public String readInventory(ModelMap model) throws Exception {
        readUtil.readFile();
        return "inventory/index";
    }

    @RequestMapping("/")
    public String index(ModelMap model) {
        return "inventory/index";
    }
}
