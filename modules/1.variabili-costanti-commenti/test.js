// let teacher: string = "Fabio"; 
// console.log(teacher);
// let nome: string = "Gennaro";
// console.log(nome);
// let arr: string[] = ["ciao", "a", "tutti"];
// arr.unshift("primo");
// arr.push("ultimo");
// console.log("--------------------------------------");
// console.log(arr);
// console.log("--------------------------------------");
// console.log(arr.pop());
// console.log("--------------------------------------");
// console.log("ordine crescente:");
// arr.sort();
// console.log(arr);
// console.log("--------------------------------------");
// console.log("reverse:");
// arr.reverse();
// console.log(arr);
// // Crea un array di interi e stampane ogni elemento.
// let abc: number[] = [1,2,3,4,5,6];
// for (let i = 1; i <= abc.length; i++){
//     console.log(i);
// }
//  //Calcola la somma di tutti gli elementi di un array.
//   let ar: number[] =[ 2,5,6,8];
//    let sum: number= 0;
//    for( let j=0; j < ar.length; j++){
//      sum += ar[j]   
//    }
//       console.log(sum); 
// //Trova il valore massimo in un array di interi.
// let numbers: number[] = [1, 2, 3, 4, 5, 6];
// let numeroMax: number = 0;
// for(let numero of numbers) {
//     if(numeroMax < numero) {
//         numeroMax = numero;
//     }
// }
// console.log(numeroMax);
// //Calcola la media aritmetica degli elementi di un array.
// let numbers: number[] = [1, 2, 3, 4, 5, 6];
// let somma1 : number = 0;
// let avg = 0;
// for(let numero of numbers) {
//     somma1 += numero;
// }
// avg = somma1 / numbers.length;
// console.log(avg);
// //Trova il valore minimo in un array di interi.
// let numbers: number[] = [1, 2, 3, 4, 5, 6];
// let numeroMin: number = numbers[0];
// for(let numero of numbers) {
//     if(numeroMin > numero) {
//         numeroMin = numero;
//     }
// }
// console.log(numeroMin);
// Conta il numero di elementi pari in un array.
// let pari: number = 0;
// let npari: number[] = [1, 2, 3, 4, 5];
// for (let index = 0; index < npari.length; index++) {
//   if (npari[index] % 2 == 0) {
//     pari++;
//   }
// }
// console.log(pari);
// Stampa gli elementi dell’array in ordine inverso.
// let npari: number[] = [1, 2, 3, 4, 5];
// npari.reverse();
// console.log(npari);
//prodotto con caratteristiche, propriità che prende un array
//stampare il nome e l'array
// const prodotto: {
//   //prima parola sempre in minuscolo a parte classi e enumeration
//   nome: string;
//   prezzo: number;
//   clienti: string[];
// } = {
//   nome: "pasta",
//   prezzo: 10,
//   clienti: ["Mario Rossi", "Maria Bianchi", "Luigi Verdi"],
// };
// console.log("\n");
// console.log("prodotto = ".concat(prodotto.nome));
// console.log(...prodotto.clienti);
// console.log("\n");
// //Traccia: Crea un oggetto persona con nome e età.
// const persona: {
//     id: number;
//     nome: string;
//     eta: number;
// } = {
//     id: 1,
//     nome: "Cristian",
//     eta: 30
// };
// console.log("\n");
// console.log(persona.nome);
// console.log(persona.eta);
// console.log("\n");
// Traccia: Crea un oggetto con un metodo che saluta.
// function utente() {
//     const utente = {
//         nome: "Anna",
//         saluta(){
//             return ciao sono ${this.nome};
//         }
//     };
//     console.log(utente.saluta());
// }
// utente();
// Traccia: Crea un oggetto auto con proprietà modello e opzionale anno.
// function auto() {
//     const auto: {
//         modello: string,
//         anno ?: number; //opzionale con (?);
//     } = {
//         modello: "GX230"
//     };
//     console.log(auto);
// }
// console.log("\n");
// auto();
// console.log("\n");
// //Traccia: Crea un oggetto con un altro oggetto dentro.
// function studente() {
//     const studente = {
//         nome: "Riccardo",
//         indirizzo: {via: "Via Roma 1", città: "Milano"}
//     }
//     console.log(studente);
// }
// studente();
// console.log("");
// //Traccia: Crea un oggetto classe con un array di studenti.
// function classe() {
//     const classe = {
//         nome: "3A",
//         studenti: ["Riccardo", "Francesca", "Marta"]
//     }
//     console.log(classe)
// }
// classe();
// console.log("");
// //Traccia: Passa un oggetto a una funzione.
// function persona1(p: {nome: string; età: number}) {
//     console.log(${p.nome} ${p.età});
// }
// persona1({nome: "Riccardo", età: 39});
// console.log("");
// /Oggetto come ritorno
//       // Traccia: Una funzione deve restituire un oggetto.
//          function auto () {
//            return{
//             marca : "Fiat",
//             modello : "Panda",
//            }
//          }
//              console.log(auto());
//        //. Oggetto con chiavi dinamiche
//        //Traccia: Crea un oggetto rubrica con chiavi assegnate a runtime.
//            function rubrica () {
//                 let rubrica : {[ nome: string] : string} = {
//                 }
//                     rubrica [ "Mario"] = "12345";
//                     rubrica [ "Andrea"] = "45678";
//                  console.log(rubrica)              
//            }
//                rubrica();
//       // Oggetto con unione di tipi
//       //Traccia: Una proprietà può essere string o number.
//          function pagamento() {
//             let pagamento :{
//               tipo: string | number;
//              } = {
//                  tipo: "carte"
//              }
//               console.log(pagamento);
//          }
//             pagamento ();
// //Traccia: Crea un array contenente più oggetti.
// //Traccia: Stampa tutte le chiavi e i valori di un oggetto.
// function prodotti() {
//     let prodotti = [ 
//         { nome: "pane", prezzo: 10 },
//         { nome: "Cornetto", prezzo: 2},
//         { nome: "uova", prezzo: 3}
//     ]
//     console.log(prodotti);
// }
// prodotti();
// function nomi() {
//     let nomi = {
//         nome: "Fabio",
//         eta: 39
//     }
//     for(let chiave in nomi){
//         console.log(${chiave}:${nomi[chiave as keyof typeof nomi]})
//     }
// }
// nomi();
// // Esempi di Tupla
//       let prodotti :[ string, string, boolean, number ];
//        prodotti = [ " pasta", "barilla", true, 20];
//        console.log(prodotti);
// //Traccia: Crea una tupla [string, number, boolean].
// const tupla: [string, number, boolean] = ["Mario", 30, true];
// console.log("Tupla singola:", tupla);
// //Traccia: Crea un array che contiene più tuple [string, number].
// const arrayDiTuple: [string, number][] = [
//   ["Luca", 25],
//   ["Giulia", 28],
//   ["Marco", 35]
// ];
// //Traccia: Scorri un array di tuple e stampa i dati.
// for (const [nome, eta] of arrayDiTuple) {
//   console.log(`Nome: ${nome}, Età: ${eta}`);
// }
// //Destrutturazione di tuple
// //Traccia: Estrai i valori da una tupla in variabili separate.
// const persona: [string, number] = ["Alice", 22];
// const [nome, eta] = persona;
// console.log("Nome:", nome);
// console.log("Età:", eta);
// //Funzione con parametro tupla
// //Traccia: Crea una funzione che accetta una tupla [string, number].
// function stampaPersona(persona: [string, number]): void {
//   const [nome, eta] = persona;
//   console.log(`Nome: ${nome}, Età: ${eta}`);
// }
// stampaPersona(["Paolo", 40]);
// //Tuple opzionali
// //Traccia: Definisci una tupla dove il terzo elemento è opzionale.
// // Tupla con terzo elemento opzionale
// type Persona = [string, number, boolean?];
// const persona1: Persona = ["Luca", 30, true];
// const persona2: Persona = ["Sara", 25];
// function descriviPersona(persona: Persona) {
//   const [nome, eta, isAttivo] = persona;
//   console.log(`Nome: ${nome}`);
//   console.log(`Età: ${eta}`);
//   if (isAttivo !== undefined) {
//     console.log(`Attivo: ${isAttivo}`);
//   } else {
//     console.log("Stato attivo non specificato");
//   }
// }
// descriviPersona(persona1);
// descriviPersona(persona2);
// //Tupla con tipo readonly
// //Traccia: Definisci una tupla immutabile
// const persona: readonly [string, number] = ["Elena", 29];
// //Tupla come chiave-valore
// //Traccia: Crea una funzione che ritorna una tupla chiave-valore.
// function creaCoppia<K, V>(chiave: K, valore: V): [K, V] {
//   return [chiave, valore];
// }
// // Esempio d'uso
// const coppia1 = creaCoppia("nome", "Giulia");   
// const coppia2 = creaCoppia("età", 35);            
// console.log(coppia1); 
// console.log(coppia2);
// //Uso avanzato con map
// //Traccia: Dato un array di tuple [string, number], incrementa tutti i numeri di 1.
// const dati: [string, number][] = [
//   ["Alice", 20],
//   ["Bob", 30],
//   ["Carla", 40]
// ];
// const incrementati = dati.map(([nome, numero]): [string, number] => {
//   return [nome, numero + 1];
// });
// console.log(incrementati);
// //Traccia: Scrivi una funzione che prende due numeri e ritorna la loro somma.
// function somma(a: number, b: number): number {
//   return a + b;
// }
// // Esempio d'uso
// console.log(somma(5, 3));
// //Traccia: Scrivi una funzione che riceve un numero e stampa se è pari o dispari.
// function stampaPariODispari(n: number): void {
//   if (n % 2 === 0) {
//     console.log(`${n} è pari`);
//   } else {
//     console.log(`${n} è dispari`);
//   }
// }
// stampaPariODispari(4); 
// stampaPariODispari(7); 
// //Traccia: Scrivi una funzione che prende una stringa e la ritorna in maiuscolo.
// function inMaiuscolo(testo: string): string {
//   return testo.toUpperCase();
// }
// console.log(inMaiuscolo("ciao"));
// //Primo carattere di una stringa
// //Traccia: Scrivi una funzione che ritorna il primo carattere di una stringa.
// function primoCarattere(testo: string): string {
//   return testo.charAt(0);
// }
// console.log(primoCarattere("ciao"));
// //Lunghezza di un array
// //Traccia: Scrivi una funzione che ritorna il numero di elementi in un array.
// function lunghezzaArray<T>(arr: T[]): number {
//   return arr.length;
// }
// console.log(lunghezzaArray([1, 2, 3, 4]));
// //Somma elementi array
// //Traccia: Scrivi una funzione che somma tutti i numeri in un array.
// function sommaArray(numeri: number[]): number {
//   return numeri.reduce((acc, curr) => acc + curr, 0);
// }
// console.log(sommaArray([1, 2, 3, 4]));
// //Traccia: Scrivi una funzione che ritorna il maggiore tra due numeri.
// function maggiore(a: number, b: number): number {
//   return a > b ? a : b;
// }
// console.log(maggiore(10, 7));
// //Traccia: Scrivi una funzione che conta quante vocali ci sono in una stringa.
// function contaVocali(testo: string): number {
//   const vocali = "aeiouAEIOU";
//   let count = 0;
//   for (const char of testo) {
//     if (vocali.includes(char)) {
//       count++;
//     }
//   }
//   return count;
// }
// console.log(contaVocali("Ciao Mondo"));
// //Traccia: Scrivi una funzione che controlla se un valore è presente in un array.
// function contieneElemento<T>(array: T[], valore: T): boolean {
//   return array.includes(valore);
// }
// console.log(contieneElemento([1, 2, 3], 2));
// console.log(contieneElemento(["a", "b"], "c")); 
// //Crea un enum chiamato Giorno con i giorni della settimana. Stampa tutti i valori usando un ciclo for.
// enum Giorno {
//   Lunedì,
//   Martedì,
//   Mercoledì,
//   Giovedì,
//   Venerdì,
//   Sabato,
//   Domenica
// }
// for (let giorno in Giorno) {
//   if (isNaN(Number(giorno))) {
//     console.log(giorno); 
//   }
// }
// //Traccia: Crea un enum Stagione con quattro valori. Usa switch per stampare un messaggio diverso per ogni stagione.
// enum Stagione {
//   Primavera,
//   Estate,
//   Autunno,
//   Inverno
// }
// function descriviStagione(stagione: Stagione): void {
//   switch (stagione) {
//     case Stagione.Primavera:
//       console.log("È primavera: tutto fiorisce!");
//       break;
//     case Stagione.Estate:
//       console.log("È estate: fa caldo e si va al mare!");
//       break;
//     case Stagione.Autunno:
//       console.log("È autunno: le foglie cadono.");
//       break;
//     case Stagione.Inverno:
//       console.log("È inverno: fa freddo e forse nevica.");
//       break;
//   }
// }
// descriviStagione(Stagione.Estate);
// //Type alias con più campi
// //Traccia: Definisci un tipo Persona con nome e età.
// type Persona = {
//   nome: string;
//   età: number;
// };
// const persona1: Persona = {
//   nome: "Luca",
//   età: 30
// };
// console.log(`Nome: ${persona1.nome}, Età: ${persona1.età}`);
// //Tipo unione
// //Traccia: Crea un tipo Risultato che può essere "success" o "error".
// type Risultato = "success" | "error";
// function mostraMessaggio(risultato: Risultato): void {
//   if (risultato === "success") {
//     console.log("Operazione completata con successo!");
//   } else {
//     console.log("Si è verificato un errore.");
//   }
// }
// mostraMessaggio("success"); 
// mostraMessaggio("error");
// //Array tipizzato
// //Traccia: Crea un tipo Studente e un array di studenti.
// type Studente = {
//   nome: string;
//   matricola: number;
// };
// const studenti: Studente[] = [
//   { nome: "Alice", matricola: 101 },
//   { nome: "Luca", matricola: 102 },
//   { nome: "Sara", matricola: 103 }
// ];
// console.log(studenti);
// //Tipo funzione
// //Traccia: Crea un tipo che rappresenta una funzione somma(a,b).
// type SommaFunzione = (a: number, b: number) => number;
// const somma: SommaFunzione = (a, b) => a + b;
// console.log(somma(5, 7));
// //Tipo con union e oggetti
// //Traccia: Crea un tipo Pagamento che può essere con carta o contanti
// type Pagamento =
//   | { metodo: "carta"; numeroCarta: string }
//   | { metodo: "contanti" };
// function descriviPagamento(pagamento: Pagamento): void {
//   switch (pagamento.metodo) {
//     case "carta":
//       console.log(`Pagamento con carta: ${pagamento.numeroCarta}`);
//       break;
//     case "contanti":
//       console.log("Pagamento in contanti");
//       break;
//   }
// }
// const p1: Pagamento = { metodo: "carta", numeroCarta: "1234-5678-9012-3456" };
// const p2: Pagamento = { metodo: "contanti" };
// descriviPagamento(p1);
// descriviPagamento(p2);
// //Traccia: Unisci i tipi Persona e Contatti.
// type Persona = {
//   nome: string;
//   età: number;
// };
// type Contatti = {
//   email: string;
//   telefono: string;
// };
// type PersonaCompleta = Persona & Contatti;
// const persona1: PersonaCompleta = {
//   nome: "Luca",
//   età: 28,
//   email: "luca@example.com",
//   telefono: "1234567890"
// };
// console.log(persona1);
// //Traccia: Crea un tipo Studente e uno Indirizzo, poi uniscili.
// type Studente = {
//   matricola: number;
//   corso: string;
// };
// type Indirizzo = {
//   via: string;
//   città: string;
//   cap: string;
// };
// type StudenteConIndirizzo = Studente & Indirizzo;
// const studente1: StudenteConIndirizzo = {
//   matricola: 202301,
//   corso: "Informatica",
//   via: "Via Roma 10",
//   città: "Milano",
//   cap: "20100"
// };
// console.log(studente1);
// //Veicolo + Assicurazione
// //Traccia: Aggiungi dati di assicurazione a un veicolo.
// type Veicolo = {
//   targa: string;
//   tipo: string;
// };
// type Assicurazione = {
//   compagnia: string;  
//   scadenza: string;
// };
// type VeicoloAssicurato = Veicolo & Assicurazione;
// const auto1: VeicoloAssicurato = {
//   targa: "CV769SP",
//   tipo: "Audi",
//   compagnia: "Allianz",
//   scadenza: "2025-12-31"
// };
// console.log("Dati veicolo assicurato:");
// console.log(`Targa: ${auto1.targa}`);
// console.log(`Tipo: ${auto1.tipo}`);
// console.log(`Compagnia: ${auto1.compagnia}`);
// console.log(`Scadenza: ${auto1.scadenza}`);
// // Persona + Lavoro + Hobby
// //Traccia: Usa più di due tipi in un’intersezione
// type Persona = {
//   nome: string;
//   età: number;
//   email: string;
//   telefono: number;
// };
// type Lavoro = {
//   azienda: string;
//   ruolo: string;
// };
// type Hobby = {
//   sport: string;
// };
// type PersonaCompleta = Persona & Lavoro & Hobby;
// const persona1: PersonaCompleta = {
//   nome: "Nicola",
//   età: 24,
//   email: "nicolanarduccibusiness@gmail.com",
//   telefono: 3896643368,
//   azienda: "Deloitte",
//   ruolo: "Software Developer",
//   sport: "Nuoto"
// };
// console.log("Dati completi:");
// console.log(persona1);
//Array generico
// //Traccia: Crea una funzione che accetta un array generico e ne restituisce la lunghezza.
// function getArrayLength<T>(arr: T[]): number {
//   return arr.length;
// }
// console.log(getArrayLength<number>([1, 2, 3]));      // Output: 3
// console.log(getArrayLength<string>(["a", "b"]));     // Output: 2
// console.log(getArrayLength<boolean>([true, false])); // Output: 2
// //Traccia: Crea un tipo generico Coppia<T, U> che contiene due valori.
// type Coppia<T, U> = {
//   primo: T;
//   secondo: U;
// };
// const coppia1: Coppia<number, string> = { primo: 42, secondo: "risposta" };
// const coppia2: Coppia<boolean, number[]> = { primo: true, secondo: [1, 2, 3] };
// const coppia3: Coppia<string, string> = { primo: "nome", secondo: "cognome" };
// console.log(coppia1);
// //Traccia: Crea una funzione che accetta un array di tipo generico e stampa ogni elemento.
// function stampaElementi<T>(array: T[]): void {
//   array.forEach((elemento) => {
//     console.log(elemento);
//   });
// }
// stampaElementi<number>([1, 2, 3]);
// stampaElementi<string>(["a", "b", "c"]);
// stampaElementi<boolean>([true, false, true]);
// Traccia: Crea una funzione che combina due valori generici in una tupla.
// function creaTupla<T, U>(valore1: T, valore2: U): [T, U] {
//   return [valore1, valore2];
// }
// const tupla1 = creaTupla<number, string>(10, "ciao");
// const tupla2 = creaTupla<boolean, number[]>(true, [1, 2]); 
// const tupla3 = creaTupla<string, string>("nome", "cognome"); 
// console.log(tupla1);
// console.log(tupla2);
// console.log(tupla3);
// // Funzione generica base
// //Traccia: Crea una funzione generica che restituisce lo stesso valore passato.
// function identita<T>(valore: T): T {
//   return valore;
// }
// // Esempi di utilizzo
// const numero = identita<number>(42); 
// const parola = identita<string>("ciao");
// const flag = identita<boolean>(true); 
// const oggetto = identita<{ nome: string }>({ nome: "Luca" });
// console.log(numero);
// console.log(parola);
// console.log(flag);
// console.log(oggetto);
// // Traccia: Crea un tipo generico Coppia<T, U> che contiene due valori.
// type Coppia<T, U> = {
//   primo: T;
//   secondo: U;
// };
// const esempio: Coppia<number, string> = {
//   primo: 42,
//   secondo: "ciao"
// };
// console.log(esempio);
// //Traccia: Crea una funzione che accetta un array generico e ne restituisce la lunghezza.
// function getLunghezza<T>(arr: T[]): number {
//   return arr.length;
// }
// console.log(getLunghezza([1, 2, 3]));
// console.log(getLunghezza(["a", "b", "c"])); 
// //Traccia: Crea una funzione che accetta un array di tipo generico e stampa ogni elemento.
// function stampaElementi<T>(arr: T[]): void {
//   arr.forEach(elemento => {
//     console.log(elemento);
//   });
// }
// stampaElementi([10, 20, 30]);
// stampaElementi(["x", "y", "z"]);
// Generics con più parametri
// Traccia: Crea una funzione che combina due valori generici in una tupla.
function combina(first, second) {
    return [first, second];
}
var result4 = combina("Nicola", 24);
console.log(result4);
// Mapper generico
// Traccia: Crea una funzione che trasforma un array generico con map.
function mapArray(arr, transform) {
    return arr.map(transform);
}
var numeri = [1, 2, 3, 4];
var double = mapArray(numeri, function (n) { return n * 2; });
console.log(double);
