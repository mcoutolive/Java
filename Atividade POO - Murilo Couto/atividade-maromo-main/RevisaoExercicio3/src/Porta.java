public class Porta {
    private Boolean aberta;
    private String cor;
    private Double dimX;
    private Double dimY;
    private Double dimz;

    public Porta(){}

    public Porta(Boolean aberta, String cor, Double dimX, Double dimY, Double dimz) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimX = dimX;
        this.dimY = dimY;
        this.dimz = dimz;
    }

    public Boolean getAberta() {
        return aberta;
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getDimX() {
        return dimX;
    }

    public void setDimX(Double dimX) {
        this.dimX = dimX;
    }

    public Double getDimY() {
        return dimY;
    }

    public void setDimY(Double dimY) {
        this.dimY = dimY;
    }

    public Double getDimz() {
        return dimz;
    }

    public void setDimz(Double dimz) {
        this.dimz = dimz;
    }

    public void abre(){
        setAberta(true);
    }

    public void fecha(){
        setAberta(false);
    }

    public void pinta(String novaCor){
        setCor(novaCor);
    }

    public boolean estaAberta(){
        if (getAberta() == true){
            System.out.println("A porta está aberta!");
            return true;
        } else {
            System.out.println("A porta está fechada!");
            return false;
        }
    }

    public void alterarDim(Double dimX, Double dimY, Double dimZ){
        setDimX(dimX);
        setDimX(dimY);
        setDimX(dimZ);
    }
}
