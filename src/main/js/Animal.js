import Utils from "./Utils.js";

export default class Animal {
    #age;
    #type;
    #name;
    #race;
    #colour
    #price;

    constructor (type, name, age, race) {
        this.#age = age;
        this.#type = type;
        this.#name = name;
        this.#race = race;
        this.#price = Utils.getIntRandom(100, 1000);
    }

    printAnimal() {
        console.log(`My ${this.#type} is called ${this.#name} and has ${this.#age} years. It is a ${this.#race}!`);
    }

    get colour() {
        return this.#colour;
    }

    set colour(colour) {
        this.#colour = colour;
    }

    setPrice(price) {
        this.#price = price;
    }

    getPrice() {
        return this.#price;
    }

    getName() {
        return this.#name;
    }


}