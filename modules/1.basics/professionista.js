class Professionista {
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

  getAliquotaInps() {
    return (this.getUtileTasse() * this.aliquotaInps) / 100;
  }

  getAliquotaIrpef() {
    return (this.getUtileTasse() * this.aliquotaIrpef) / 100;
  }

  getRedditoAnnuoNetto() {
    return (
      this.reditoAnnuoLordo - (this.getAliquotaInps() + this.getAliquotaIrpef())
    );
  }
}

let netto = new Professionista(86000, 78, 26, 15);
console.log(netto.getRedditoAnnuoNetto());