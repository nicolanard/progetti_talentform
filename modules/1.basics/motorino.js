//Scrivere la classe Motorino che ha i seguenti attributi 
// colore: una stringa indicante il colore del motorino
// velocità: un numero con la virgola indicante la velocità in Km/h che possiede il motorino
// tipo: una stringa indicante la marca e il modello del motorino es. “Piaggio scarabeo”
// l’attributo antifurto un boolean che indica se è stato inserito l’antifurto (ha un valore iniziale pari a false). 
// Il costruttore ha come parametri una stringa per il colore, una stringa per il tipo, un numero con la virgola per la velocità ed assegna opportunamente i valori dei parametri agli attributi. 
// Scrivere il metodo getVelocità che restituisce la velocità del motorino
// Scrivere inoltre il metodo accelera che ha come parametro un numero con la virgola indicante i Km/h che si vogliono aggiungere alla velocità
// il metodo verifica il valore dell’attributo antifurto se è false aggiunge il valore del parametro all’attributo velocità, altrimenti non fa nulla. 
// Scrivere il metodo inserisciAntifurto che assegna un valore true all’attributo antifurto.

class Motorino{
    colore = "Nero";
    velocità = 50.4;
    tipo = "Piaggio Scarabeo";
    antifurto = false;

    constructor(colore, tipo, velocità, antifurto){
        this.colore = colore;
        this.tipo = tipo;
        this.velocità = velocità;
        this.antifurto = antifurto;
    }

    getVelocità(){
        return this.velocità;
    }

    accelera(kmAggiunti){
        if(!this.antifurto){
            this.velocità += kmAggiunti;
        } else {
            console.log("Non è consentito accelerare");
        }
    }

    inserisciAntifurto(){
        this.antifurto = true;
    }
   

}

    let motorino = new Motorino("Nero", "Piaggio Scarabeo", 50.4, false);

    console.log("Velocità iniziale: ", motorino.getVelocità());

    motorino.accelera(20.4);
    console.log("Velocità raggiunta con l'accelerazione: " + motorino.getVelocità());

    motorino.inserisciAntifurto();
    motorino.accelera(20.4);
    console.log("Inserito l'antifurto, il motorino non accelera, la velocità è: " + motorino.getVelocità());

    // Scrivere la classe MotorinoImmatricolato sottoclasse della classe Motorino 
    // che ha in più 2 attributi: 
    // maxVelocità un numero con la virgola (coerente con la scelta fatta per l’attributo velocità) 
    // indicante la velocità massima in Km/h che il motorino può raggiungere; 
    // targa una stringa indicante la targa del motorino 
    // (ad entrambi gli attributi viene assegnato un valore nel costruttore). 
    // Aggiungere il metodo getMax il metodo stampa il valore dell’attributo maxVelocità. 
    // Ridefinire il metodo accelera in modo che prima di modificare la velocità 
    // effettui un controllo sulla velocità massima raggiunta. 
    // Il metodo definisce una variabile s (dello stesso tipo di velocità) ed assegna ad s 
    // la somma tra il valore del parametro del metodo ed il valore dell’attributo velocità; 
    // se s è minore del valore dell’attributo maxVelocità assegna il valore di s 
    // all’attributo velocità altrimenti assegna all’attributo velocità 
    // il valore dell’attributo maxVelocità.

    class MotorinoImmatricolato extends Motorino{
        maxVelocità = 100;
        targa = "AD2334AD";

        constructor(colore, tipo, velocità, antifurto, maxVelocità, targa){
            super(colore, tipo, velocità, antifurto);
            this.maxVelocità = maxVelocità;
            this.targa = targa;
        }

        getMax(){
            return this.maxVelocità;
        }

        accelera(kmAggiunti){
            if(!this.antifurto){
                let s = this.velocità + kmAggiunti;
                if(s < this.maxVelocità){
                    this.maxVelocità = s;
                } else {
                    this.velocità = this.maxVelocità;
                }
            } else {
                console.log("Impossibile accelerare, l'antifurto è stato inserito. ");
            }
        }

    }

    let motorino1 = new MotorinoImmatricolato("Nero", "Piaggio Scarabeo", 50.4, false, 100, "AD2334AD");

    console.log("Velocità attuale: " + motorino1.getVelocità());

    console.log("Velocità massima consentita: " + motorino1.getMax());

    motorino1.accelera(51);
    console.log("Velocità dopo la prima accelerazione: " + motorino1.getVelocità());

    motorino1.inserisciAntifurto();
    motorino1.accelera(10);
    console.log("Velocità dopo la seconda accelerazione: " + motorino1.getVelocità());