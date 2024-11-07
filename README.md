# To-Do List Application

## Project Overview
The To-Do List Application is a simple Java-based program that allows users to manage their tasks by providing functionality to add, view, edit, delete, and mark tasks as completed. The application helps users keep track of their to-do items with basic features such as sorting tasks and saving them to a file for persistence.

## Features
- **Add Task**: Users can add new tasks with a description and an optional due date.
- **View Tasks**: Users can view all tasks with details like the description, due date, and completion status.
- **Edit Task**: Users can modify the description and due date of an existing task.
- **Delete Task**: Users can remove a task from the list.
- **Mark Task as Completed**: Users can mark a task as completed.
- **Persistence** (Optional): Tasks can be saved to and loaded from a file, ensuring data is preserved between sessions.

## Technologies Used
- **Java**: Core programming language for the application.
- **ArrayList**: Data structure used to store tasks dynamically.
- **File I/O** (Optional): Used to persist tasks to a file.

## How to Use
1. **Clone the repository**: 
   - `git clone <repository-url>`
2. **Navigate to the project directory**:
   - `cd to-do-list-java`
3. **Compile the code**:
   - `javac *.java`
4. **Run the application**:
   - `java ToDoListApp`

### Interactive Menu:
- `1. Add Task`: Add a new task with a description and due date.
- `2. View Tasks`: Display all tasks with their details.
- `3. Edit Task`: Modify an existing task's description or due date.
- `4. Delete Task`: Remove a task from the list.
- `5. Mark Task as Completed`: Mark a task as completed.
- `6. Exit`: Exit the application.

## Future Enhancements
- **Priority Levels**: Implement priority (low, medium, high) for tasks.
- **Task Sorting**: Allow users to sort tasks by due date or priority.
- **Graphical User Interface (GUI)**: Use JavaFX or Swing for a graphical version of the app.
- **Advanced Persistence**: Save tasks to a database or use more advanced file handling techniques for persistence.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
