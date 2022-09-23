// getting elements
const TASK_CREATOR = document.getElementById("task-creation");

// will be activated in the future
const TASK_REMOVAL = document.getElementById("task-deletion");

// vars
var title;
var div;

// onclick action
TASK_CREATOR.addEventListener("click", createTask);

function createTask() {
    // get input value
    title = document.getElementById("task-title").value;
    
    // stating div
    div = `<input type="checkbox">
                    <span>${title}</span>
                    <button id="task-deletion"></button>`;
    
    // creating element
    const task = document.createElement('div');
    
    // adding class to new element
    task.className = "task-box";

    // adding content to new element
    task.innerHTML = div;

    // adding new element to HTML website
    document.getElementById("task-wrapper").appendChild(task);
    resetInputValue();
}

function resetInputValue() {
    // clear input field
    document.getElementById("task-title").value = "";
}





