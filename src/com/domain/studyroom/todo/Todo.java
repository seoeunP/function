package com.domain.studyroom.todo;

public class Todo {
    private int todoId;
    private String username;
    private String date;
    private String content;
    private boolean completed;

    public Todo() {
    }

    public Todo(int todoId, String username, String date, String content, boolean completed) {
        this.todoId = todoId;
        this.username = username;
        this.date = date;
        this.content = content;
        this.completed = completed;
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
