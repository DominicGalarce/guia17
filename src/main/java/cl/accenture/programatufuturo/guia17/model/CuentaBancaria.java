package cl.accenture.programatufuturo.guia17.model;

public class CuentaBancaria {

    private String idCuenta, tripoCuenta;
    private int saldo;

    public CuentaBancaria(){
        this.idCuenta="";
        this.saldo=0;
        this.tripoCuenta="";
    }
    public CuentaBancaria(String a, String b, int c){
        this.idCuenta=a;
        this.saldo=c;
        this.tripoCuenta=b;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public String getTripoCuenta() {
        return tripoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
