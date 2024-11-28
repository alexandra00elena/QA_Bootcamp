export default class Utils {

    static getRandom(min, max) {
        return Math.random() * (max - min) + min;
    }

    static getIntRandom(min, max) {
        return Math.floor(this.getRandom(min, max));
    }
}