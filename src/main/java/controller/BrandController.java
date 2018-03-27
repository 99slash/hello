package controller;

import demain.bbs_brand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BrandService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/1/5.
 */
@Controller
@RequestMapping("/brand")
public class BrandController {
    @Resource
    BrandService brandService;

    /**
     * 显示首页面
     * @param map
     * @return
     */
    @RequestMapping("/list")
    public String list( Map map) {
        List<bbs_brand> brands = brandService.findBrandAll();
        map.put("brands", brands);
        return "showBrand";
    }
}
