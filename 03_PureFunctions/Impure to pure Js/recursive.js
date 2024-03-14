// Eine Funktion, die aus einer Liste von Zahlen die Summe aller Listenelemente berechnet.

//Rekursiv

//List [3,6,7] = 3 + 6 + 7 = 20;

function recursiveCalc(list, index = 0) {
  if (index === list.length) {
    return 0;
  }
  return list[index] + recursiveCalc(list, index + 1);
}

let TestList = [4, 7, 3, 12];

console.log(recursiveCalc(TestList));

// Eine Funktion, die aus einer Liste von Zahlen den Mittelwert aller Listenelemente berechnet.

function averageCalc(list, index = 0, sum = 0) {
  if (index === list.length) {
    return sum / list.length;
  }
  sum += list[index];
  return averageCalc(list, index + 1, sum);
}

console.log(averageCalc(TestList));

//
