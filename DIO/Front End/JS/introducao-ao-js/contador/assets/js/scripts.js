// Variables

const currentNumberWrapper = document.getElementById('currentNumber');
var currentNumber = 0;
const increment = document.getElementById("incBtn");
const decrement = document.getElementById("decBtn");

// Running functions

increment.addEventListener("click", incrementCount);
decrement.addEventListener("click", decrementCount);

// Functions

function incrementCount() {

    if (currentNumberWrapper.innerHTML >= 10) {
        increment.disabled = true;
        decrement.disabled = false;
    } else {
        increment.disabled = false;
        decrement.disabled = false;

        currentNumber++;
        currentNumberWrapper.innerHTML = currentNumber;
        currentNumberWrapper.style.color = 'black';
    }
}

function decrementCount() {

    if (currentNumberWrapper.innerHTML < 0) {
        decrement.disabled = true;
        increment.disabled = false;
    } else {
        increment.disabled = false;
        decrement.disabled = false;
        
        currentNumber--;
        currentNumberWrapper.innerHTML = currentNumber;
    
        if (currentNumberWrapper.innerHTML < 0) {
            currentNumberWrapper.style.color = 'red';
        }
    }
}

// increment + decrement funtions without addEventListener

/*
function increment() {
    currentNumber = currentNumber + 1;
    currentNumberWrapper.innerHTML = currentNumber;
}

function decrement() {
    currentNumber = currentNumber - 1;
    currentNumberWrapper.innerHTML = currentNumber;
}
*/