package newenergy.db.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users_register_info")
public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //登记号
    @Column(unique = true, length = 14)
    private String register_id;

    //用户姓名
    private String user_name;

    //小区编号，见数据对应表-小区
    @Column(length = 2)
    private String plot_num;

    //地址编号，见数据对应表-地址
    @Column(length = 5)
    private String address_num;

    //房间号
    @Column(length = 4)
    private String room_num;

    //机型编号，见数据对应表-机型
    @Column(length = 2)
    private String type_num;

    //装机序号，第几台机器（0-z）
    @Column(length = 1)
    private String device_seq;

    //所属机房编号，见数据对应表-机房
    @Column(length = 2)
    private String pump_num;

    //联系电话
    private String phone;

    //房间面积
    private Double area;

    //额定流量，单位T/h
    private Double rated_flow;

    //机器编码
    private String device_num;

    //购机日期
    private LocalDateTime buy_time;

    //安装设备日期
    private LocalDateTime install_time;

    //验收设备日期
    private LocalDateTime receive_time;

    //微信openid
    private String openid;

    //流量预警阈值
    @Column(columnDefinition = "int default 10")
    private Integer threshold;

    //安全属性：添加时间
    private LocalDateTime safe_changed_time;

    //安全属性： 添加人id
    private Integer safe_changed_userid;

    //安全属性：是否删除，1删除，0未删除
    @Column(columnDefinition = "tinyint default 0")
    private Integer safe_delete;

    //安全属性：上次修改记录的id
    private Integer safe_parent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegister_id() {
        return register_id;
    }

    public void setRegister_id() {
        this.register_id = this.address_num + this.room_num + this.type_num + this.device_seq + this.pump_num;
    }

    public void setRegister_id(String register_id) {
        this.register_id = register_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPlot_num() {
        return plot_num;
    }

    public void setPlot_num(String plot_num) {
        this.plot_num = plot_num;
    }

    public String getAddress_num() {
        return address_num;
    }

    public void setAddress_num(String address_num) {
        this.address_num = address_num;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    public String getType_num() {
        return type_num;
    }

    public void setType_num(String type_num) {
        this.type_num = type_num;
    }

    public String getDevice_seq() {
        return device_seq;
    }

    public void setDevice_seq(String device_seq) {
        this.device_seq = device_seq;
    }

    public String getPump_num() {
        return pump_num;
    }

    public void setPump_num(String pump_num) {
        this.pump_num = pump_num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRated_flow() {
        return rated_flow;
    }

    public void setRated_flow(double rated_flow) {
        this.rated_flow = rated_flow;
    }

    public String getDevice_num() {
        return device_num;
    }

    public void setDevice_num(String device_num) {
        this.device_num = device_num;
    }

    public LocalDateTime getBuy_time() {
        return buy_time;
    }

    public void setBuy_time(LocalDateTime buy_time) {
        this.buy_time = buy_time;
    }

    public LocalDateTime getInstall_time() {
        return install_time;
    }

    public void setInstall_time(LocalDateTime install_time) {
        this.install_time = install_time;
    }

    public LocalDateTime getReceive_time() {
        return receive_time;
    }

    public void setReceive_time(LocalDateTime receive_time) {
        this.receive_time = receive_time;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
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

    public Integer getSafe_parent() {
        return safe_parent;
    }

    public void setSafe_parent(Integer safe_parent) {
        this.safe_parent = safe_parent;
    }
}
