//Array kann man nicht Kopieren da es in der Funktion immer neu gelesen wird
let cartItems = [];

function addToCart(cartItems, item) {
  const newCartItems = [...cartItems, item];
  return newCartItems;
}

console.log(addToCart(cartItems, "Apple"));
cartItems.push("Apple");
console.log(addToCart(cartItems, "Banana"));
cartItems.push("Banana");
console.log(addToCart(cartItems, "Orange"));
cartItems.push("Orange");

// Random kann man nicht als pure machen deshalb wird diese Zahl dem benutzer überlassen
function multiplyWithRandom(number, randomNumber) {
  return number * randomNumber;
}

console.log(multiplyWithRandom(2, 9));

// Divsion durch 0 handle
function pureDivision(dividend, divisor) {
  if (!divisor == 0) {
    return dividend / divisor;
  }
  return 0;
}

console.log(pureDivision(4, 3));
console.log(pureDivision(4, 0));

//Console.log wurde entfernt da sie 2 Rückgabe Werte zurück bekommen

function returnString(str) {
  return str; // Rückgabe der Zeichenkette
}

console.log(returnString("Hallo"));
