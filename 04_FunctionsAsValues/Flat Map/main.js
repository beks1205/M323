var listOfLists = [
  [1, 2],
  [3, 4],
  [5, 6],
];

var doubledList = listOfLists.flatMap((list) => list.map((num) => num * 2));

console.log(doubledList); // Output: [2, 4, 6, 8, 10, 12]

var peopleList = [
  ["Max", ["Blau", "Grün"]],
  ["Anna", ["Rot"]],
  ["Julia", ["Gelb", "Blau", "Grün"]],
];
var uniqueColors = Array.from(
  new Set(
    peopleList.flatMap(function (_a) {
      var _ = _a[0],
        colors = _a[1];
      return colors;
    })
  )
);
console.log(uniqueColors); // Output: ["Blau", "Grün", "Rot", "Gelb"]
