package three.four;

import java.util.Date;

public class Notice {
    int id;
    String title;
    String creator;
    Date createTime;

    public Notice(int id, String title, String creator, Date createTime){
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getId() {
        return id;
    }

    public String getCreator() {
        return creator;
    }

    public String getTitle() {
        return title;
    }
}

