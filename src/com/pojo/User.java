package com.pojo;

public class User {
    private Integer id;

    private String phone;

    private String password;

    private String username;

    private Integer money;

    private Integer role;

    private String state;

//    可选的参数
    private Detail userDetail;
    
    
    
    public Detail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(Detail userDetail) {
        this.userDetail = userDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", password=" + password
				+ ", username=" + username + ", money=" + money + ", role="
				+ role + ", state=" + state + ", userDetail=" + userDetail
				+ "]";
	}
    
    
}