export class Pas {
    idPas : number | undefined;
    titol : string;
    descripcio : string;
    numeroDePas : number;

    constructor(titol:string, descripcio:string, numeroDePas:number){
            this.titol = titol;
            this.descripcio = descripcio;
            this.numeroDePas = numeroDePas;
    }
}
