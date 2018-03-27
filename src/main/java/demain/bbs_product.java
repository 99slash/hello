package demain;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/1/5.
 */
@Entity
public class bbs_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String no;//商品编号
    private String name;//商品名称
    private double weight;//重量 单位:克
    private int is_new;//是否新品:0:旧品,1:新品
    private int is_hot;//是否热销:0,否 1:是
    private int is_commend;//推荐 1推荐 0 不推荐
    private String create_time;//
    private String create_user_id;//
    private String check_time;//
    private String check_user_id;//
    private int is_show;//上下架:0否 1是
    private int is_del;//是否删除:0删除,1,没删除
    private String keywords;//检索关键词
    private int sales;//销量
    private String description;//商品描述
    private String package_list;//包装清单
    private String feature;//商品属性集
    private String color;//颜色集
    private String size;//尺寸集
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private bbs_brand brand_id;//品牌ID


    public bbs_product() {
    }

    public bbs_product(int id, String no, String name, double weight, int is_new, int is_hot, int is_commend, int is_show, int is_del, String keywords, int sales, String description, String package_list, String feature, String color, String size, bbs_brand brand_id) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.weight = weight;
        this.is_new = is_new;
        this.is_hot = is_hot;
        this.is_commend = is_commend;
        this.is_show = is_show;
        this.is_del = is_del;
        this.keywords = keywords;
        this.sales = sales;
        this.description = description;
        this.package_list = package_list;
        this.feature = feature;
        this.color = color;
        this.size = size;
        this.brand_id = brand_id;
    }

    public bbs_product(int id, String no, String name, double weight, int is_new, int is_hot, int is_commend, String create_time, String create_user_id, String check_time, String check_user_id, int is_show, int is_del, String keywords, int sales, String description, String package_list, String feature, String color, String size, bbs_brand brand_id) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.weight = weight;
        this.is_new = is_new;
        this.is_hot = is_hot;
        this.is_commend = is_commend;
        this.create_time = create_time;
        this.create_user_id = create_user_id;
        this.check_time = check_time;
        this.check_user_id = check_user_id;
        this.is_show = is_show;
        this.is_del = is_del;
        this.keywords = keywords;
        this.sales = sales;
        this.description = description;
        this.package_list = package_list;
        this.feature = feature;
        this.color = color;
        this.size = size;
        this.brand_id = brand_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIs_new() {
        return is_new;
    }

    public void setIs_new(int is_new) {
        this.is_new = is_new;
    }

    public int getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(int is_hot) {
        this.is_hot = is_hot;
    }

    public int getIs_commend() {
        return is_commend;
    }

    public void setIs_commend(int is_commend) {
        this.is_commend = is_commend;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public String getCheck_user_id() {
        return check_user_id;
    }

    public void setCheck_user_id(String check_user_id) {
        this.check_user_id = check_user_id;
    }

    public int getIs_show() {
        return is_show;
    }

    public void setIs_show(int is_show) {
        this.is_show = is_show;
    }

    public int getIs_del() {
        return is_del;
    }

    public void setIs_del(int is_del) {
        this.is_del = is_del;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackage_list() {
        return package_list;
    }

    public void setPackage_list(String package_list) {
        this.package_list = package_list;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public bbs_brand getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(bbs_brand brand_id) {
        this.brand_id = brand_id;
    }
}
