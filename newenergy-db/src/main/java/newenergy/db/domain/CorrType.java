package newenergy.db.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "corr_type")
public class CorrType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 2)
    private String type_num;

    private String type_dtl;

    private Double rated_flow;

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

    public String getType_num() {
        return type_num;
    }

    public void setType_num(String type_num) {
        this.type_num = type_num;
    }

    public String getType_dtl() {
        return type_dtl;
    }

    public void setType_dtl(String type_dtl) {
        this.type_dtl = type_dtl;
    }

    public Double getRated_flow() {
        return rated_flow;
    }

    public void setRated_flow(Double rated_flow) {
        this.rated_flow = rated_flow;
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
