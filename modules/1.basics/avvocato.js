class Avvocato {

    redditoAnnuoLordo = 0;
    coeffRedd = 0;
    aliquotaInps = 0;
    aliquotaIrpef = 0;

    constructor(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef) {

        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.coeffRedd = coeffRedd;
        this.aliquotaInps = aliquotaInps;
        this.aliquotaIrpef = aliquotaIrpef;
    }

    getUtileTasse() {

        return this.redditoAnnuoLordo * this.coeffRedd / 100;
    }

    getTassaInps() {

        return this.getUtileTasse() * this.aliquotaInps / 100;
    }

    getTassaIrpef() {

        return this.getUtileTasse() * this.aliquotaIrpef / 100;
    }

    getRedditoAnnuoNetto() {

        return this.redditoAnnuoLordo - (this.getTassaInps() + this.getTassaIrpef());
    }
}

let avvocato = new Avvocato(70000, 67, 22, 15);

console.log("Utile tasse: " + avvocato.getUtileTasse() + "€");
console.log("Tassa inps: " + avvocato.getTassaInps() + "€");
console.log("Tassa irpef: " + avvocato.getTassaIrpef() + "€");
console.log("Reddito annuo netto avvocato: " + avvocato.getRedditoAnnuoNetto() + "€");

class Elettricista extends Avvocato{

    importoEccedente = 0;
    inpsFissa = 0;

    constructor(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef, importoEccedente, inpsFissa) {

        super(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef)

        this.importoEccedente = importoEccedente;
        this.inpsFissa = inpsFissa;
    }

    getUtileTasse() {

        return this.redditoAnnuoLordo * this.coeffRedd / 100;
    }

    getUtileEccedente() {

        return (this.redditoAnnuoLordo - this.importoEccedente) * this.coeffRedd / 100;
    }

    getTassaInps() {

        return this.getUtileEccedente() * this.aliquotaInps / 100;
    }

    getTassaIrpef() {

        return this.getUtileTasse() * this.aliquotaIrpef / 100;
    }

    getRedditoAnnuoNetto() {

        return this.redditoAnnuoLordo - (this.getTassaIrpef() + this.getTassaInps() + this.inpsFissa);
    }
}

let elettricista = new Elettricista(60000, 67, 22, 15, 1500, 3000);

console.log("Utile eccedente: " + elettricista.getUtileEccedente() + "€");
console.log("Tassa inps : " + elettricista.getTassaInps() + "€");
console.log("Tassa irpef: " + elettricista.getTassaIrpef() + "€");
console.log("Reddito annuo netto elettricista: " + elettricista.getRedditoAnnuoNetto() + "€");
