public class PessoaVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "matricula=" + gerente.getMatricula() +
                ", nome='" + gerente.getNome() + '\'' +
                ", setor=" + gerente.getNomeSetor() +
                '}';
    }

    @Override
    public String exibirSecretaria(Secretaria secretaria) {
        return "Secretaria{" +
                "matricula=" + secretaria.getMatricula() +
                ", nome='" + secretaria.getNome() + '\'' +
                ", setor='" + secretaria.getNomeSetor() + '\'' +
                '}';
    }

    @Override
    public String exibirCEO(CEO CEO) {
        return "CEO{" +
                "cpf=" + CEO.getCPF() +
                ", nome='" + CEO.getNome() + '\'' +
                ", salario=" + CEO.getSalario() +
                '}';
    }

}
