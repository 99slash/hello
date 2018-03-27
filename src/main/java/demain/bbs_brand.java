package demain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lenovo on 2017/1/5.
 */
@Entity
public class bbs_brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;//名称
    private String description;//描述
    private String img_url;//图片Url
    private String web_site;//品牌网址
    private int sort;//排序:最大最排前
    private int is_display;//是否可见 1:可见 0:不可见

    public bbs_brand() {
    }

    public bbs_brand(String name, String description, String img_url, String web_site, int sort, int is_display) {
        this.name = name;
        this.description = description;
        this.img_url = img_url;
        this.web_site = web_site;
        this.sort = sort;
        this.is_display = is_display;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getWeb_site() {
        return web_site;
    }

    public void setWeb_site(String web_site) {
        this.web_site = web_site;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getIs_display() {
        return is_display;
    }

    public void setIs_display(int is_display) {
        this.is_display = is_display;
    }


}
