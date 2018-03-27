package demain;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by lenovo on 2016/12/5.
 */
public class User {
    @NotEmpty(message = "名字不能为空")
    private String name;
    private int id;
    private int pwd;
    private Addcity addcity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String bir;

    public User(){}
    public User(String name, int id, int pwd, Addcity addcity) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.addcity = addcity;
    }

    public User(String name, int id, int pwd, Addcity addcity, String bir) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.addcity = addcity;
        this.bir = bir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public Addcity getAddcity() {
        return addcity;
    }

    public void setAddcity(Addcity addcity) {
        this.addcity = addcity;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }
}
