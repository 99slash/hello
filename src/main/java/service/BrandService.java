package service;

import Dao.BrandDao;
import demain.bbs_brand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/1/5.
 */
@Service
public class BrandService {
    @Resource
    BrandDao brandDao;

    /**
     * 查询所有品牌
     * @return
     */
    public List<bbs_brand> findBrandAll(){
        List<bbs_brand> brandAll = brandDao.findBrandAll();
        return brandAll;
    }
}
