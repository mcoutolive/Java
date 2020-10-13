package net.maromo.prjacampamento;

public class GerenciarFarmaceutica {

    public static void main(String[] args) {
	    //Definir uma farmaceutica
        Farmaceutica lab = new Farmaceutica();
        lab.setNomeFarmaceutica("Laboratório Cristália");
        lab.setIdFarmaceutica(1);
        lab.setCidade("Itapira");
        lab.setUf("SP");

        //Atrelar a essa farmaceutica dois medicamentos
        Medicamento medicamento1 = new Medicamento();
        medicamento1.setId(1);
        medicamento1.setMedicamento("Aspirina");
        medicamento1.setForma("Comprimido");
        medicamento1.setConcentracao("5g");
        medicamento1.setNumRegistro("123456");
        medicamento1.setPreco(4.89);
        medicamento1.registrarData();
        medicamento1.alterarPreco();
        medicamento1.setDetentora(lab);

        Medicamento medicamento2 = new Medicamento();
        medicamento2.setId(2);
        medicamento2.setMedicamento("Dipirona");
        medicamento2.setForma("Gotas");
        medicamento2.setConcentracao("1g");
        medicamento2.setNumRegistro("333333");
        medicamento2.setPreco(22.89);
        medicamento2.registrarData();
        medicamento2.alterarPreco();
        medicamento2.setDetentora(lab);

        System.out.println("Impressão do primeiro medicamento: ");
        medicamento1.imprimir();

        System.out.println();
        System.out.println("Impressão do segundo medicamento: ");
        medicamento2.imprimir();




    }
}
