package net.maromo.prjacampamento;

public class Farmaceutica {
    //Definir os atributos
    private int idFarmaceutica;
    private String nomeFarmaceutica;
    private String cidade;
    private String uf;

    public int getIdFarmaceutica() {
        return idFarmaceutica;
    }

    public void setIdFarmaceutica(int idFarmaceutica) {
        this.idFarmaceutica = idFarmaceutica;
    }

    public String getNomeFarmaceutica() {
        return nomeFarmaceutica;
    }

    public void setNomeFarmaceutica(String nomeFarmaceutica) {
        this.nomeFarmaceutica = nomeFarmaceutica;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void imprimir(){
        System.out.println("idFarmaceutica = " + idFarmaceutica);
        System.out.println("nomeFarmaceutica = " + nomeFarmaceutica);
        System.out.println("cidade = " + cidade);
        System.out.println("uf = " + uf);
    }
}
