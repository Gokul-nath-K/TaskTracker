package main.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private long id;
    private String description;
    private String status;
    private Date createdAt;
    private Date updatedAt;

    public Task() { }

    public Task(long id, String description, String status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return String.format("Task ID: %d%nDescription: %s%nStatus: %s%nCreated At: %s%nUpdated At: %s",
                id,
                description,
                status,
                dateFormat.format(createdAt),
                dateFormat.format(updatedAt));
    }
}
