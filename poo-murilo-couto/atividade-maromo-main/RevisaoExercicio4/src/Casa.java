import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(){}

    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public void pinta(String cor){
        setCor(cor);
    }

    public boolean portaEstaAberta(Porta p){
        return p.estaAberta();
    }

    public int qtdPortasAbertas(){
        int count = 0;
        Boolean resp;
        List<Porta> portas = new ArrayList<>(Arrays.asList(porta1, porta2, porta3));
        for(Porta p : portas){
           resp = portaEstaAberta(p);
           if (resp){
               count++;
           }
        }
        if (count > 1) {
            System.out.println(count + " portas estão abertas.");
        } else if (count == 0){
            System.out.println("Nenhuma porta está aberta.");
        } else if (count == 1){
            System.out.println( "Apenas uma porta está aberta.");
        }
        return count;
    }
}
