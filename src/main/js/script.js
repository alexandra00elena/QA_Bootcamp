function test() {
    console.log("Start of the script");
    var x = 100;
    console.log(x);                                 // 100

    let myValue = x + x / 2;
    let isOdd = x % 2 == 0;
    console.log(myValue);                           // 150
    console.log(typeof isOdd);                      // boolean

    let myNumber = 2e3;
    let nr2 = NaN;
    console.log(myNumber);                          // 2000
    console.log(nr2);                               // Nan

    let variable1 = "ana";
    let variable2 = "are mere";
    console.log(variable1 + ' ' + variable2);       // ana are mere

    let y = "2";
    console.log(x + y);                             // 1002

    const T = true;
    const F = false;
    console.log((T && (F || T)) || F);              // true

    let num1 = 2;
    let num2 = 5;
    console.log(num1 + " is " + (num1 > num2 ? 'greater' : 'smaller') + " than " + num2);           // 2 is smaller than 5
    console.log(`${num1} is ${num1 > num2 ? 'greater' : 'smaller'} than ${num2}`);                  // 2 is smaller than 5
}

function add(a = 100, b = 200) {
    console.log(arguments);
    return a + b;
}

console.log(add());                                 // 300
console.log(add(500));                              // 700
console.log(add(400, 500));                         // 900

const add2 = function (a = 100, b = 200) {
    console.log(arguments);
    return a + b;
}

console.log(add2(400, 500));                        // 900

// pentru functii rapide
const arrowAdd = (a, b) => a + b;
console.log(arrowAdd(5, 6));                        // 11
console.log(typeof arrowAdd);

//const arrowAdd2 = (a, b) => {console.log(arguments); return a + b;}
//console.log(arrowAdd2(100, 500));                   // 600

const arrowSubstract = (a, b) => a - b;

function evaluate(x, y, f) {
    return f(x, y);
}

console.log(evaluate(100, 200, arrowAdd));
console.log(evaluate(100, 200, arrowSubstract));

const arrayFunc = () => {
    const myFunct = (a, b, c) => a + b * c;
    let myarr = [1, 2, 3];
    let mixArr = [6, 'ana are mere', myarr, myFunct];
    return mixArr;
}

let arr1 = arrayFunc();
console.log(arr1[0]);                                  // 6
console.log(arrayFunc()[1]);                           // ana are mere
console.log(arrayFunc()[3]);                           // (a, b, c) => a + b * c
console.log(arrayFunc()[3](1, 5, 7));                  // 36

const animal1 = {
    type: "dog",
    name: "toby",
    age: 5,
    race: "labrador",
    eat() {
        console.log(`My ${this.type} is called ${this.name} and has ${this.age} years. It is a ${this.race} that is well fed now.`);
    }
}

animal1.eat();

const a1 = new Animal("dog", "toby", 5, "labrador");
console.log(a1);
a1.printAnimal();
//console.log(a1.name);
console.log(a1.getName());
a1.colour = "Brown";
const d1 = new Dog("sophie", 5, "labrador");
console.log(d1);