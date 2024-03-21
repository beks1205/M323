//Erstellen Sie eine Liste aller Mitarbeiter in der "IT"-Abteilung, deren Gehalt über 50000 liegt.
// Zusätzlich sollen alle Vornamen in Grossbuchstaben umgewandelt und der Nachname entfernt werden (z.B. "MAX").
class Mitarbeiter {
  constructor(name, abteilung, gehalt) {
    this.name = name;
    this.abteilung = abteilung;
    this.gehalt = gehalt;
  }
}

const mitarbeiter = [
  new Mitarbeiter("Max Mustermann", "IT", 50000),
  new Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
  new Mitarbeiter("Klaus Klein", "IT", 55000),
  new Mitarbeiter("Julia Gross", "HR", 40000),
];

let result = mitarbeiter.filter(checkIt).map(onlyNames);

function checkIt(mitarbeiterElem) {
  if ((mitarbeiterElem.abteilung = "IT" && mitarbeiterElem.gehalt >= 50000)) {
    return mitarbeiterElem;
  }
}

function onlyNames(mitarbeiter) {
  return mitarbeiter.name.split(" ")[0].toUpperCase();
}

console.log(result);

//Kursnamen formatieren und sortieren

const kurse = [
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen",
];

//Filtern Sie die Kursnamen, um nur diejenigen zu behalten, die das Wort "Daten" enthalten.

kursmitDaten = kurse.filter(onlyDaten);

function onlyDaten(kurseElem) {
  return kurseElem.includes("Daten");
}

console.log(kursmitDaten);

//Filtern Sie die Kursnamen, um nur diejenigen zu behalten, die das Wort "Daten" enthalten.

const kurseOhneLeerzeichen = kurse.map((kurs) => kurs.replace(/\s/g, ""));

console.log(kurseOhneLeerzeichen);

//Sortieren Sie die Kursnamen alphabetisch.

kurse.sort();

console.log(kurse);

//Sortieren sie umgekehrt alphabetisch

kurse.sort((a, b) => b.localeCompare(a));

console.log(kurse);
