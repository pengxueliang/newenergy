package newenergy.db.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "corr_plot")
public class CorrPlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //小区编号，从00到zz，索引
    @Column(length = 2)
    private String plot_num;

    //小区信息
    private String plot_dtl;

    //充值系数，元/吨
    private Double plot_factor;

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

    public String getPlot_num() {
        return plot_num;
    }

    public void setPlot_num(String plot_num) {
        this.plot_num = plot_num;
    }

    public String getPlot_dtl() {
        return plot_dtl;
    }

    public void setPlot_dtl(String plot_dtl) {
        this.plot_dtl = plot_dtl;
    }

    public Double getPlot_factor() {
        return plot_factor;
    }

    public void setPlot_factor(Double plot_factor) {
        this.plot_factor = plot_factor;
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
