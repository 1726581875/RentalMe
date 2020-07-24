package com.pojo;

public class Itemimage {
    private Integer id;

    private Integer iid;

    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

	@Override
	public String toString() {
		return "Itemimage [id=" + id + ", iid=" + iid + ", pic=" + pic + "]";
	}
    
    
}