import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirSecretaria() {
        Secretaria aluno = new Secretaria(1, "Ana", new Setor("Vendas"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Secretaria{matricula=1, nome='Ana', setor='Vendas'}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente(1, "Maria", new Setor("Vendas"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gerente{matricula=1, nome='Maria', setor=Vendas}", visitor.exibir(gerente));
    }

    @Test
    void deveExibirCEO() {
        CEO CEO = new CEO("123", "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("CEO{cpf=123, nome='Pedro', salario=5000.0}", visitor.exibir(CEO));
    }

}