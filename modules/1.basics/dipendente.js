/*

Scrivere la classe Dipendente che ha i seguenti attributi matricola: una stringa indicante il numero di matricola del dipendente, stipendio: un numero con la virgola indicante lo stipendio base che possiede il dipendente, straordinario: un numero con la virgola indicante l’importo dovuto per ciascuna ora di straordinario effettuata dal dipendente.
Il costruttore ha come parametri una stringa per la matricola, un numero con la virgola per lo stipendio ed un numero con la virgola per lo straordinario ed assegna opportunamente i valori dei parametri agli attributi.
Scrivere il metodo getStipendio che restituisce il valore dell’attributo stipendio, 

scrivere inoltre il metodo paga che ha come parametro un numero intero indicante il numero di ore di straordinario effettuate dal dipendente, 
il metodo restituisce il valore ottenuto sommando all’attributo stipendio il risultato del prodotto tra il parametro del metodo e l’attributo straordinario. 

Scrivere il metodo stampa che stampa il valore degli attributi della classe

*/

class Dipendente {
  matricola = "";
  stipendio = 0.0;
  straordinario = 0.0;

  constructor(matricola, stipendio, straordinario) {
    this.matricola = matricola;
    this.stipendio = stipendio;
    this.straordinario = straordinario;
  }

  getStipendio() {
    return this.stipendio;
  }

  paga(oreStraordinario) {
    this.stipendio =
      this.getStipendio() + this.straordinario * oreStraordinario;
    return this.stipendio;
  }

  stampa() {
    return {
      matricola: this.matricola,
      stipendio: this.getStipendio(),
      straordinario: this.straordinario,
    };
  }
}

let d1 = new Dipendente("A01", 2000, 10);
console.log(d1.getStipendio());
console.log(d1.paga(5));
console.log(d1.stampa());

/*

Scrivere la sottoclasse DipendenteA della classe Dipendente che ha in più l’attributo malattia: 
un numero intero indicante i giorni di malattia presi che viene inizializzato a zero. 

Aggiungere il metodo prendiMalattia che ha come parametro un numero intero indicante i giorni di malattia presi, il metodo modifica il valore dell’attributo malattia aggiungendogli il valore del parametro. 

Ridefinire il metodo paga in modo che prima definisce una variabile p a cui assegna il valore ottenuto richiamando il metodo paga della superclasse, poi se l’attributo malattia è uguale a zero il metodo restituisce il valore di p altrimenti restituisce il valore ottenuto sottraendo a p il valore del prodotto tra malattia e 15,0. 
Definire un metodo stampaMalattia che stampa il valore dell’attributo malattia

*/

class DipendenteA extends Dipendente {
  malattia = 0;

  constructor() {
    super("A01", 2000, 10);
  }

  prendiMalattia(malattia) {
    this.malattia += malattia;
    return this.malattia;
  }

  paga(oreStraordinario) {
    let p = super.paga(oreStraordinario);
    return this.malattia == 0 ? p : p - this.malattia * 15;
  }

  stampaMalattia() {
    return {
      malattia: this.malattia,
    };
  }
}

let d2 = new DipendenteA();
console.log(d2.prendiMalattia(30));
console.log(d2.paga(10));
console.log(d2.stampaMalattia());