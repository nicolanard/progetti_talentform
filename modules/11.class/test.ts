// class BankAccounts{

//     constructor(  public balance = 0,  public  firstDeposit = 0,
//     public firstDraw = 0,
//     private secondDeposit = 0,
//     private seconDraw = 0) {


//         this.balance = balance
//         this.firstDeposit = firstDeposit
//         this.firstDraw = firstDraw
//         this.secondDeposit = secondDeposit
//         this.seconDraw = seconDraw
//     }


//     public getFirstDeposit() {
    
//       return this.balance + this.firstDeposit

//     }


//     public getFirstDraw() {


//         return this.getFirstDeposit() - this.firstDraw
//     }


//     public getSeconDeposit() {

//         return this.getFirstDraw() + this.secondDeposit
//     }

//     public getTotalAccount() {

//         return this.getSeconDeposit() - this.seconDraw
//     }



// }



// let accounts = new BankAccounts(0, 300, 100, 50, 30)
// console.log(accounts.getTotalAccount());



// abstract class Professionista {


//     abstract getUtileTasse();
 
// }


// interface IProfessionista {


//     getTassaInps()
//     getTassaIrpef()
// }


// class LavoratoriAutonomi extends Professionista implements IProfessionista {


//     constructor(public redditoAnnuoLordo = 0, public coeffRedd = 0,
//         public aliquotaTassaInps = 0, public aliquotaTassaIrpef = 0
//     ) {
//         super()
//         this.redditoAnnuoLordo = redditoAnnuoLordo
//         this.coeffRedd = coeffRedd
//         this.aliquotaTassaInps = aliquotaTassaInps
//         this.aliquotaTassaIrpef = aliquotaTassaIrpef


//     }
    

//     public getUtileTasse() {

//         return this.redditoAnnuoLordo * this.coeffRedd / 100
//     }
    
//     public getTassaInps() {
        
//         return this.getUtileTasse() * this.aliquotaTassaInps /100
//     }
 
//     public getTassaIrpef() {

//         return this.getUtileTasse() * this.aliquotaTassaIrpef /100
//     }

//     public getRedditoAnnuoNetto() {

//         return this.redditoAnnuoLordo - (this.getTassaInps() + this.getTassaIrpef())
//     }

// }


// let reddito = new LavoratoriAutonomi(85000, 78, 26, 15)
// console.log(reddito.getRedditoAnnuoNetto());

// class BankAccounts{

//     private balance: number
//     private firstDeposit: number
//     private firstDraw: number
//     private secondDeposit: number
//     private secondDraw:number

//     constructor( balance = 0,firstDeposit = 0,
//     firstDraw = 0,
//      secondDeposit = 0,
//     secondDraw = 0) {


//         this.balance = balance
//         this.firstDeposit = firstDeposit
//         this.firstDraw = firstDraw
//         this.secondDeposit = secondDeposit
//         this.secondDraw = secondDraw
//     }


//     public getFirstDeposit() :number {
    
//       return this.balance + this.firstDeposit

//     }


//     public getFirstDraw() :number {


//         return this.getFirstDeposit() - this.firstDraw
//     }


//     public getSeconDeposit() :number {

//         return this.getFirstDraw() + this.secondDeposit
//     }

//     public getTotalAccount():number {

//         return this.getSeconDeposit() - this.secondDraw
//     }



// }



// let accounts = new BankAccounts(0, 300, 100, 50, 30)
// console.log(accounts.getTotalAccount());



// abstract class Professionista {


//     abstract getUtileTasse():number
 
// }


// interface IProfessionista {


//     getTassaInps():number
//     getTassaIrpef():number
// }


// class LavoratoriAutonomi extends Professionista implements IProfessionista {

//     private redditoAnnuoLordo: number
//     private coeffRedd: number
//     private aliquotaInps: number
//     private aliquotaIrpef: number


//     constructor(redditoAnnuoLordo = 0, coeffRedd = 0,
//         aliquotaInps = 0, aliquotaIrpef = 0
//     ) {
//         super()
//         this.redditoAnnuoLordo = redditoAnnuoLordo
//         this.coeffRedd = coeffRedd
//         this.aliquotaInps = aliquotaInps
//         this.aliquotaIrpef = aliquotaIrpef


//     }
    

//     public getUtileTasse(): number {

//         return this.redditoAnnuoLordo * this.coeffRedd / 100
//     }
    
//     public getTassaInps() :number {
        
//         return this.getUtileTasse() * this.aliquotaInps /100
//     }
 
//     public getTassaIrpef():number {

//         return this.getUtileTasse() * this.aliquotaIrpef /100
//     }

//     public getRedditoAnnuoNetto() : number {

//         return this.redditoAnnuoLordo - (this.getTassaInps() + this.getTassaIrpef())
//     }

// }


// let reddito = new LavoratoriAutonomi(85000, 78, 26, 15)
// console.log(reddito.getRedditoAnnuoNetto());


// class SonAccount {

//     private static balance: number
//     private static firstDeposit: number
//     private static firstDraw: number
//     private static secondDeposit: number
//     private  static secondDraw: number
    

//     constructor(balance = 0, firstDeposit = 0,
//         firstDraw = 0, secondDeposit = 0, secondDraw = 0

//     ) {

//         SonAccount.balance = balance
//         SonAccount.firstDeposit = firstDeposit
//         SonAccount.firstDraw = firstDraw
//         SonAccount.secondDeposit = secondDeposit
//         SonAccount.secondDraw = secondDraw


//     }
    


//     public static getFirstDeposit():number {

//         return SonAccount.balance + SonAccount.firstDeposit
//     }

//     public static getFirstDraw() : number {
          
//         return this.getFirstDeposit() - SonAccount.firstDraw
//     }
    
//     public static getSecondDeposit() :number {

//         return this.getFirstDraw() + SonAccount.secondDeposit
//     }
   
//     public static getTotalAccount() :number {

//         return this.getSecondDeposit() - SonAccount.firstDraw
//     }


// }


// let son = new SonAccount(0, 500, 100, 200, 100)
// console.log(SonAccount.getTotalAccount());

/*Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare
con contratto a ricarica.
Tale classe prevede due variabili d'istanza. La prima variabile d'istanza e'
definita come private double carica, e rappresenta il quantitativo di euro
disponibile per le chiamate. La seconda variabile d'istanza e' definita come
private int numeroChiamate, e rappresenta il numero di chiamate effettuate con
il cellulare. La classe deve implementare un costruttore public Cellulare(double
unaCarica), che prende come parametro esplicito la quantita' di euro della
ricarica iniziale. La classe deve inoltre implementare i seguenti metodi. Un
metodo definito come public void ricarica(double unaRicarica), che ricarica il
telefonino. Un metodo definito come public void chiama(double minutiDurata), che
effettua una chiamata di durata in minuti specificata dal parametro esplicito.
Tale metodo dovra' aggiornare la carica disponibile, ed incrementare la memoria
contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo
di 0.20 euro per ogni minuto di chiamata. Un metodo public double numero404(),
che restituisce il valore della carica disponibile. Un metodo public int
getNumeroChiamate(), che restituisce il valore della variabile d'istanza
numeroChiamate. Infine, un metodo public void azzeraChiamate(), che azzera la
variabile contenente il numero di chiamate effettuate dal telefonino. */

interface ICellulare {
    ricarica(unaRicarica : number) : void;
    chiama(minutiDurata : number) : void;
    numero404() : number;
}

abstract class Smartphone{
    abstract getNumeroChiamate() : number;
    abstract azzeraChiamate() : void;
}

class Cellulare extends Smartphone implements ICellulare{

    private carica: number;
    private numeroChiamate: number;

    constructor(unaCarica: number){
        super();
        this.carica = unaCarica;
        this.numeroChiamate = 0;
    }

    public ricarica(unaRicarica: number) : void {
        this.carica += unaRicarica;
    }

    public chiama(minutiDurata: number) : void {
        const costoPerMinuto = 0.2;
        const costoTotale = minutiDurata * costoPerMinuto;

        if(costoTotale <= this.carica){
            this.carica -= costoTotale;
            this.numeroChiamate++;
        } else {
            console.log("Il credito per effettuare la chiamata non è sufficiente. Effettua una ricarica.");
        }
    }

    public numero404() : number {
        return this.carica;
    }

    public getNumeroChiamate() : number {
        return this.numeroChiamate;
    }

    public azzeraChiamate() : void {
        this.numeroChiamate = 0;
    }

}

    const cellulare = new Cellulare(20);

    cellulare.chiama(10);
    console.log("Credito residuo: €", cellulare.numero404());
    console.log("Numero chiamate effettuate: ", cellulare.getNumeroChiamate());

    cellulare.ricarica(10);
    console.log("Nuovo credito telefonico: €", cellulare.numero404());

    cellulare.azzeraChiamate();
    console.log("Numero chiamate effettuate dopo l'azzeramento: ", cellulare.getNumeroChiamate());
