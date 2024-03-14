// Aufgabe 1 nur gerade Zahlen

let array = [1, 2, 3, 4, 5];

array = array.filter(evenNumbers);

function evenNumbers(number) {
  if (number % 2 == 0) {
    return number;
  }
}
console.log(array);

//Augabe 2 Namen mehr als 4 Buchstaben

let names = ["Alice", "Bob", "Charlie", "Diana"];

names = names.filter(nameMoreThanFour);

function nameMoreThanFour(name) {
  if (name.length > 4) {
    return name;
  }
}

console.log(names);

//Aufgabe 3 Zahlen die grösser sind als 50

let numbers = [12, 45, 68, 100];

numbers = numbers.filter(numbersGreaterThan);

function numbersGreaterThan(item) {
  if (item > 50) {
    return item;
  }
}

console.log(numbers);

//Aufgabe 4 Wörter die S beinhalten

let words = ["Scala", "ist", "fantastisch"];

words = words.filter(wordsWithS);

function wordsWithS(word) {
  word = word.toLowerCase();
  if (word.startsWith("s")) {
    return word;
  }
}

console.log(words);

//Aufgabe 5 filter und map

class Buch {
  constructor(titel, autor, jahr) {
    this.titel = titel;
    this.autor = autor;
    this.jahr = jahr;
  }
}

let buecher = [
  new Buch("1984", "George Orwell", 1949),
  new Buch("Brave New World", "Aldous Huxley", 1932),
  new Buch("Fahrenheit 451", "Ray Bradbury", 1953),
];

buecher = buecher.filter(booksOlderThan1950).map((book) => book.titel);

function booksOlderThan1950(item) {
  if (item.jahr > 1950) {
    return item;
  }
}

console.log(buecher);
