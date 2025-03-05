//JavaScript elaubt unlogische Operationen
//Zum Beispiel ein Bool mit einem String multiplizieren
//Das Ergebnis ist zwar NaN, der Code läuft jedoch ohne Problem weiter

console.log(true * "Hallo");


//Es kann der Zuweisungsoperator "=" in einem If-Bedingung verwendet werden
//Das führt dazu, dass die Bedingung immer true ist
var h = "Danny"

if(h = "Daniel"){
    console.log("Funktioniert");
    
}

//Das Zeichen "\" funktioniert nur, wenn anschließend kein Zeichen mehr kommt (auch kein Leerzeichen)
console.log("Hallo mein Name \
ist Daniel");


//Javascript gibt unlogische Vergleiche zurück
//Ein leeres Array ist gleich wie false, aber nicht wie ein leeres Array?

console.log([] == 0);      // true
console.log([] == false);  // true
console.log(0 == false);   // true
console.log([] == []);     // false


//Der Computer kann Kommazahlen nicht richtig addieren. Das Ergebnis ist immer "fast" richtig, aber nie ganz genau
console.log(0.1 + 0.2 == 0.3);




