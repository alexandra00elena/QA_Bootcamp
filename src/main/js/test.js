import Animal from './Animal.js';
import Cat from './Cat.js';
import Dog from './Dog.js';
import Fish from './Fish.js';

const a1 = new Animal("cat", "Garfield", 2, "unkown");
const d1 = new Dog("bobitza", 10, "unknown");
console.log(a1.getName());
// a1.printAnimal();
// d1.printAnimal();

const c1 = new Cat("Luna", 1, "mainekooon");
c1.catchMouse();
// c1.printAnimal();

const f1 = new Fish("Nemo", 1, "clownfish");
f1.swim();

const petStore = [a1, d1, c1, f1];
console.log(`My Petstore has ${petStore.length} animals: `);
let priceValue = 0;
for (const animal of petStore) {
    animal.printAnimal();
    priceValue += animal.getPrice();
}

console.log(`My petstore animals are worth $${priceValue}!`);