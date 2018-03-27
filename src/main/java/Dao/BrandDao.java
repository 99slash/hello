package Dao;

import demain.bbs_brand;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/1/5.
 */
@Repository
public class BrandDao {
    @Resource
    SessionFactory sessionFactory;

    /**
     * 查询所有品牌
     * @return
     */
    public List<bbs_brand> findBrandAll(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from bbs_brand");
        List<bbs_brand> bbsBrands=query.list();
        return bbsBrands;
    }
}
