CREATE TABLE todo (
                      todo_id INT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(50) NOT NULL,
                      date DATE NOT NULL,
                      content TEXT NOT NULL,
                      completed BOOLEAN DEFAULT FALSE
);