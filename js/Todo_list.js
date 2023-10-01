// Define an empty array to store tasks
var tasks = [];

// Function to add a task to the list
function addTask(task) {
    tasks.push(task);
    console.log(`Task "${task}" added.`);
}

// Function to delete a task from the list
function deleteTask(task) {
    var index = tasks.indexOf(task);
    if (index !== -1) {
        tasks.splice(index, 1);
        console.log(`Task "${task}" deleted.`);
    } else {
        console.log(`Task "${task}" not found.`);
    }
}

// Function to list all tasks
function listTasks() {
    if (tasks.length === 0) {
        console.log("No tasks in the list.");
    } else {
        console.log("Tasks:");
        tasks.forEach(function (task, index) {
            console.log(`${index + 1}. ${task}`);
        });
    }
}

// Example usage
addTask("Buy groceries");
addTask("Do laundry");
addTask("Write code");

listTasks();

deleteTask("Do laundry");
listTasks();
