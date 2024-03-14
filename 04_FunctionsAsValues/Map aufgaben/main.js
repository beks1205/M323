// Aufgabe 1 Elemente mal 2
let array = [1, 2, 3, 4, 5];

array = array.map(doubleparam);

function doubleparam(item) {
  return item * 2;
}

console.log(array);

//Aufgabe 2 Namen in Gross Buchstaben

let namesArray = ["Alice", "Bob", "Charlie"];

namesArray = namesArray.map(nameCaseUp);

function nameCaseUp(item) {
  return item.toUpperCase();
}

console.log(namesArray);

//Aufgabe 3 Hälfte der Zahl

let numbers = [12, 45, 68, 100];

numbers = numbers.map(halfFunc);

function halfFunc(item) {
  return item / 2;
}

console.log(numbers);

//Aufgabe 4

class Adresse {
  constructor(strasse, hausnummer, postleitzahl, stadt) {
    this.strasse = strasse;
    this.hausnummer = hausnummer;
    this.postleitzahl = postleitzahl;
    this.stadt = stadt;
  }
}

const adressen = [
  new Adresse("Hauptstrasse", 10, "12345", "Musterstadt"),
  new Adresse("Nebenstrasse", 5, "23456", "Beispielburg"),
];

let formattedAdress = adressen.map(convertAdressToString);

function convertAdressToString(item) {
  return (
    item.strasse +
    " " +
    item.hausnummer.toString() +
    " " +
    item.postleitzahl +
    " " +
    item.stadt
  );
}

console.log(formattedAdress);

let namenList = ["Max Mustermann", "Erika Mustermann"];

namenListFormatted = namenList.map(vornameSorter);

function vornameSorter(item) {
  let array = item.split(" ");
  return array[0].toUpperCase();
}
console.log(namenListFormatted);
