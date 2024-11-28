import Animal from './Animal.js';

export default class Dog extends Animal {

    constructor(name, age, race) {
        super("dog", name, age, race);
    }

}