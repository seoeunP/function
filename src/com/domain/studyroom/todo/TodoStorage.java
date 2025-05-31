package com.domain.studyroom.todo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoStorage {
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/java_studyroom_project?serverTimezone=UTC&characterEncoding=UTF-8";
        String user = "root";
        String pass = "0107";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    public void insertTodo(Todo todo) throws Exception {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO todo (username, date, content, completed) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, todo.getUsername());
            pstmt.setString(2, todo.getDate());
            pstmt.setString(3, todo.getContent());
            pstmt.setBoolean(4, todo.isCompleted());
            pstmt.executeUpdate();
        }
    }

    public List<Todo> selectTodos(String username, String date) throws Exception {
        List<Todo> list = new ArrayList<>();
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM todo WHERE username = ? AND date = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, date);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                list.add(new Todo(
                        rs.getInt("todo_id"),
                        rs.getString("username"),
                        rs.getString("date"),
                        rs.getString("content"),
                        rs.getBoolean("completed")
                ));
            }
        }
        return list;
    }

    public void updateTodo(int todoId, Todo todo) throws Exception {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE todo SET content = ?, completed = ? WHERE todo_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, todo.getContent());
            pstmt.setBoolean(2, todo.isCompleted());
            pstmt.setInt(3, todoId);
            pstmt.executeUpdate();
        }
    }

    public void deleteTodo(int todoId) throws Exception {
        try (Connection conn = getConnection()) {
            String sql = "DELETE FROM todo WHERE todo_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, todoId);
            pstmt.executeUpdate();
        }
    }
}
