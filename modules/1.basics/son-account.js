class SonAccount {
  balance = 0;
  firstDeposit = 0;
  firstDraw = 0;
  secondDeposit = 0;
  secondDraw = 0;

  constructor(balance, firstDeposit, firstDraw, secondDeposit, secondDraw) {
    this.balance = balance;
    this.firstDeposit = firstDeposit;
    this.firstDraw = firstDraw;
    this.secondDeposit = secondDeposit;
    this.secondDraw = secondDraw;
  }

  getFirstDeposit() {
    return this.balance + this.firstDeposit;
  }

  getFirstDraw() {
    return this.getFirstDeposit() - this.firstDraw;
  }

  getSecondDeposit() {
    return this.getFirstDraw() + this.secondDeposit;
  }

  getTotalAccount() {
    return this.getSecondDeposit() - this.secondDraw;
  }
}

let account = new SonAccount(0, 500, 200, 100, 50);
console.log("ACCOUNT SON :"+ account.getTotalAccount() + " €");

class MotherAccount extends SonAccount {
  canoneAnnuo = 0;

  constructor(
    balance,
    firstDeposit,
    firstDraw,
    secondDeposit,
    secondDraw,
    canoneAnnuo
  ) {
    super(balance, firstDeposit, firstDraw, secondDeposit, secondDraw);

    this.canoneAnnuo = canoneAnnuo;
  }

  getFirstDeposit() {
    return this.balance + this.firstDeposit;
  }

  getFirstDraw() {
    return this.getFirstDeposit() - this.firstDraw;
  }

  getSecondDeposit() {
    return this.getFirstDraw() + this.secondDeposit;
  }

  getSecondDraw() {
    return this.getSecondDeposit() - this.secondDraw;
  }

  getCanoneAnnuo() {
    return (this.getSecondDraw() * this.canoneAnnuo) / 100;
  }

  getTotalAccount() {
    return this.getSecondDraw() - this.getCanoneAnnuo();
  }
}

let mother = new MotherAccount(0, 600, 200, 100, 50, 15);

console.log("ACCOUNT MOTHER :"+ mother.getTotalAccount() + " €");