class TipoCapoAbigliamento {
  marca = "";
  modello = "";
  costo = 0;

  constructor(marca, modello, costo) {
    this.marca = marca;
    this.modello = modello;
    this.costo = costo;
  }

  getCosto() {
    return this.costo;
  }

  applicaSconto(sconto) {
    return this.costo - (this.costo / 100) * sconto;
  }

  modificaCosto(newCosto) {
    this.costo = newCosto;
  }
}

let capo = new TipoCapoAbigliamento("adidas", "maglia", 29.99);

console.log("Il costo iniziale del capo è di: " + capo.getCosto() + " €");
console.log(
  "Il costo scontato del capo è di: " + capo.applicaSconto(20) + " €"
);
capo.modificaCosto(50);
console.log(
  "Il costo dopo modifica costo del capo è di: " + capo.getCosto() + " €"
);

class CapoAbbigliamento extends TipoCapoAbigliamento {
  taglia = 0;
  quantitàAcquistata = 0;
  quantitàDisponibile = 0;

  constructor(
    marca,
    modello,
    costo,
    taglia,
    quantitàAcquistata,
    quantitàDisponibile
  ) {
    super(marca, modello, costo);
    this.taglia = taglia;
    this.quantitàAcquistata = quantitàAcquistata;
    this.quantitàDisponibile = quantitàDisponibile;
  }

  getCosto() {
    return this.costo;
  }

  applicaSconto(sconto) {
    return this.costo - (this.costo / 100) * sconto;
  }

  modificaCosto(newCosto) {
    this.costo = newCosto;
  }

  venduto(quantità) {
    if (this.quantitàDisponibile > quantità) {
      this.quantitàDisponibile -= quantità;
    } else {
      console.log("Chiama il fattorino antipatico");
    }
  }

  getDettagli() {
    console.log("--------------------------------------------------------");
    console.log("MARCA: " + this.marca);
    console.log("MODELLO: " + this.modello);
    console.log("COSTO: " + this.costo + " €");
    console.log("TAGLIA: " + this.taglia);
    console.log("QUANTITA' ACQUISTATA: " + this.quantitàAcquistata);
    console.log("QUANTITA' DISPONIBILE: " + this.quantitàDisponibile);
    console.log("--------------------------------------------------------");
  }
}

let capo1 = new CapoAbbigliamento("adidas", "maglia", 29.99, "M", 35, 20);

console.log("Il costo iniziale del capo è di: " + capo1.getCosto() + " €");
console.log(
  "Il costo scontato del capo è di: " + capo1.applicaSconto(20) + " €"
);
capo1.modificaCosto(50);
console.log(
  "Il costo dopo modifica costo del capo è di: " + capo1.getCosto() + " €"
);
capo1.getDettagli();
capo1.venduto(10);
capo1.getDettagli();
capo1.venduto(15);