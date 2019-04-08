package newenergy.db.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "corr_pump")
public class CorrPump {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //所属机房编号，见数据对应表-机房
    @Column(length = 2)
    private String pump_num;

    //安全属性：添加时间
    private LocalDateTime safe_changed_time;

    //安全属性： 添加人id
    private Integer safe_changed_userid;

    //安全属性：是否删除，1删除，0未删除
    @Column(columnDefinition = "tinyint default 0")
    private Integer safe_delete;

    //安全属性：上次修改记录的id
    private  Integer sage_parent;
}
