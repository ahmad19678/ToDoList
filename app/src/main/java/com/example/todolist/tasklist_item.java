package com.example.todolist;


public class tasklist_item {
    String taskName;
    Boolean isCheeked;
    String taskId;
    String taskListid;

    public tasklist_item() {
        this.taskName = taskName;
        this.isCheeked = isCheeked;
        this.taskId = taskId;
        this.taskListid = taskListid;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getCheeked() {
        return isCheeked;
    }

    public void setCheeked(Boolean cheeked) {
        isCheeked = cheeked;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskListid() {
        return taskListid;
    }

    public void setTaskListid(String taskListid) {
        this.taskListid = taskListid;
    }
}