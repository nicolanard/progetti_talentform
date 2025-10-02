//Array di oggetti
//Traccia: Trasforma in oggetto la stringa JSON con array di utenti e mostra il secondo nome
const jsonUtenti = '[{"nome": "Luca"}, {"nome": "Marco"}, {"nome": "Giulia"}]';
const utenti = JSON.parse(jsonUtenti);
const secondoNome = utenti[1].nome;

console.log(secondoNome);

//Convertire un array in JSON
//Traccia: Trasforma l’array [1,2,3,4] in stringa JSON.
const numeri = [1, 2, 3, 4];
const jsonNumeri = JSON.stringify(numeri);

console.log(jsonNumeri);

//Filtrare dati da JSON
//Traccia: Dato un JSON con prodotti, mostra solo quelli con prezzo > 50.
const jsonProdotti = `
[
  {"nome": "Penna", "prezzo": 2},
  {"nome": "Zaino", "prezzo": 55},
  {"nome": "Monitor", "prezzo": 120}
]`;

const prodotti = JSON.parse(jsonProdotti);
const prodottiCostosi = prodotti.filter(p => p.prezzo > 50);

console.log(prodottiCostosi);

