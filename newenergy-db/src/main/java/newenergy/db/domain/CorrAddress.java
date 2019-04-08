package newenergy.db.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "corr_address")
public class CorrAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //地址编号，aabbc，aa是小区编号00-zz，bb是楼栋数00-zz，c是单元号0-z，索引
    @Column(length = 5)
    private String address_num;

    //具体地址信息
    private String address_dtl;

    //安全属性：添加时间
    private LocalDateTime safe_changed_time;

    //安全属性： 添加人id
    private Integer safe_changed_userid;

    //安全属性：是否删除，1删除，0未删除
    @Column(columnDefinition = "tinyint default 0")
    private Integer safe_delete;

    //安全属性：上次修改记录的id
    private  Integer sage_parent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress_num() {
        return address_num;
    }

    public void setAddress_num(String address_num) {
        this.address_num = address_num;
    }

    public String getAddress_dtl() {
        return address_dtl;
    }

    public void setAddress_dtl(String address_dtl) {
        this.address_dtl = address_dtl;
    }

    public LocalDateTime getSafe_changed_time() {
        return safe_changed_time;
    }

    public void setSafe_changed_time(LocalDateTime safe_changed_time) {
        this.safe_changed_time = safe_changed_time;
    }

    public Integer getSafe_changed_userid() {
        return safe_changed_userid;
    }

    public void setSafe_changed_userid(Integer safe_changed_userid) {
        this.safe_changed_userid = safe_changed_userid;
    }

    public Integer getSafe_delete() {
        return safe_delete;
    }

    public void setSafe_delete(Integer safe_delete) {
        this.safe_delete = safe_delete;
    }

    public Integer getSage_parent() {
        return sage_parent;
    }

    public void setSage_parent(Integer sage_parent) {
        this.sage_parent = sage_parent;
    }
}
