package Pastaatividades8;

class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data entradabanco;
    String rg;
    void recebeAumento(double aumento) {
        if( departamento.equals("faxineira")) {
            aumento = 150;
            salario = salario + aumento;
        }else if(departamento.equals("caixa")) {
            aumento = 250;
            salario = salario + aumento;
        }
    }
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada do Banco: ");
        this.entradabanco.imprimir();
        System.out.println("RG: " + this.rg);
    }
    public double calculaGanhoAnual(){
        return salario*12;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getEntradabanco() {
        return entradabanco;
    }

    public void setEntradabanco(Data entradabanco) {
        this.entradabanco = entradabanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
