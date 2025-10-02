class Psicologa {
  reditoAnnuoLordo = 0;
  coefRedd = 0;
  aliquotaInps = 0;
  aliquotaIrpef = 0;

  constructor(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef) {
    this.aliquotaInps = aliquotaInps;
    this.aliquotaIrpef = aliquotaIrpef;
    this.reditoAnnuoLordo = reditoAnnuoLordo;
    this.coefRedd = coefRedd;
  }

  getUtileTasse() {
    return (this.reditoAnnuoLordo * this.coefRedd) / 100;
  }

  getIrpef() {
    return (this.aliquotaIrpef * this.getUtileTasse()) / 100;
  }

  getInps() {
    return (this.aliquotaInps * this.getUtileTasse()) / 100;
  }

  getUtileNetto() {
    return this.reditoAnnuoLordo - (this.getInps() + this.getIrpef());
  }
}

let ps1 = new Psicologa(30000, 78, 26, 15);
console.log("inps " + ps1.getInps());
console.log("irpef " + ps1.getIrpef());
console.log("utile già tassato " + ps1.getUtileNetto());

class Artigiano extends Psicologa {
  importoEccedente = 0;
  costoFissoInps = 0;

  constructor(
    reditoAnnuoLordo,
    coefRedd,
    aliquotaInps,
    aliquotaIrpef,
    importoEccedente,
    costoFissoInps
  ) {
    //parametri per la classe padre
    super(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef);

    //parametri per this
    this.importoEccedente = importoEccedente;
    this.costoFissoInps = costoFissoInps;
  }

  getInps() {
    return (
      this.getUtileTasse() * this.aliquotaInps +
      this.getUtileTasse() * this.aliquotaIrpef
    );
  }

  getUtileEccedente() {
    return (
      ((this.reditoAnnuoLordo - this.importoEccedente) * this.coefRedd) / 100
    );
  }

  getInps() {
    return (this.getUtileEccedente() * this.aliquotaInps) / 100;
  }

  getRedditoNetto() {
    console.log("annuo lordo = " + this.reditoAnnuoLordo);
    console.log("ral " + this.coefRedd);
    return (
      this.reditoAnnuoLordo -
      (this.getIrpef() + this.getInps() + this.costoFissoInps)
    );
  }
}

/**
 * 
 *  reditoAnnuoLordo,
    coefRedd,
    aliquotaInps,
    aliquotaIrpef,
    importoEccedente,
    costoFissoInps
 * 
 */

let artigiano = new Artigiano(90000, 67, 24, 15, 15000, 3500);
console.log(artigiano.getRedditoNetto());