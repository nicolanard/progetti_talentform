// class BankAccounts{
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Smartphone = /** @class */ (function () {
    function Smartphone() {
    }
    return Smartphone;
}());
var Cellulare = /** @class */ (function (_super) {
    __extends(Cellulare, _super);
    function Cellulare(unaCarica) {
        var _this = _super.call(this) || this;
        _this.carica = unaCarica;
        _this.numeroChiamate = 0;
        return _this;
    }
    Cellulare.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    Cellulare.prototype.chiama = function (minutiDurata) {
        var costoPerMinuto = 0.2;
        var costoTotale = minutiDurata * costoPerMinuto;
        if (costoTotale <= this.carica) {
            this.carica -= costoTotale;
            this.numeroChiamate++;
        }
        else {
            console.log("Il credito per effettuare la chiamata non è sufficiente. Effettua una ricarica.");
        }
    };
    Cellulare.prototype.numero404 = function () {
        return this.carica;
    };
    Cellulare.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    Cellulare.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return Cellulare;
}(Smartphone));
var cellulare = new Cellulare(20);
cellulare.chiama(10);
console.log("Credito residuo: €", cellulare.numero404());
console.log("Numero chiamate effettuate: ", cellulare.getNumeroChiamate());
cellulare.ricarica(10);
console.log("Nuovo credito telefonico: €", cellulare.numero404());
cellulare.azzeraChiamate();
console.log("Numero chiamate effettuate dopo l'azzeramento: ", cellulare.getNumeroChiamate());
