package com.lk.controller;

import com.lk.entity.Export;
import com.lk.service.ExportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/export")
public class ExportAct {
    @Resource
    private ExportService exportService;

    @RequestMapping("/showList")
    public String showList(ModelMap model) {
        List<Export> list = exportService.getList();
        model.addAttribute("list", list);
        return "export/list";
    }

    @RequestMapping("/")
    public String index(ModelMap model) {
        return "export/index";
    }
}
