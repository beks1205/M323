// foldleft implementation
function foldLeft(array, initialValue, reducerFunction) {
  return array.reduce(reducerFunction, initialValue);
}
var numbers = [1, 2, 3, 4, 5];
var sum = numbers.reduce(function (accumulator, currentValue) {
  return accumulator + currentValue;
}, 0);
console.log("Summe aller Zahlen:", sum);
var strings = ["Hallo", " ", "Welt", "!"];
var combinedString = strings.reduce(function (accumulator, currentValue) {
  return accumulator + currentValue;
}, "");
console.log("Kombinierter String:", combinedString);
var points = [
  [1, 3],
  [2, 5],
  [4, 8],
  [6, 2],
];
var sumtp = points.reduce(
  function (acc, point) {
    return [acc[0] + point[0], acc[1] + point[1]];
  },
  [0, 0]
);
var average = sumtp.map(function (value) {
  return value / points.length;
});
var centroid = average;
console.log("Centroid:", centroid);
