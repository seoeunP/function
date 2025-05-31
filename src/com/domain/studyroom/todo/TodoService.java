package com.domain.studyroom.todo;

import java.util.List;

public class TodoService {
    private final TodoStorage storage = new TodoStorage();

    public void addTodo(Todo todo) throws Exception {
        storage.insertTodo(todo);
    }

    public List<Todo> getTodos(String username, String date) throws Exception {
        return storage.selectTodos(username, date);
    }

    public void updateTodo(int todoId, Todo todo) throws Exception {
        storage.updateTodo(todoId, todo);
    }

    public void deleteTodo(int todoId) throws Exception {
        storage.deleteTodo(todoId);
    }
}
