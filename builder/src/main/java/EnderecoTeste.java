import static org.junit.Assert.assertEquals;

public class EnderecoTeste {
    @Test
    public void builder() {
        Endereco endereco = Endereco.builder()
                .rua("Av. Julio Cesar")
                .setor("Jardim Planalto")
                .cep("74333-100")
                .numero("1")
                .cidade("Goiânia")
                .estado("Goiás")
                .bloco("SB")
                .quadra("quadra 36")
                .complemento("lote 34 casa 3")
                .build();

        assertsEquals(expected: "Av. Julio Cesar", endereco.getRua());
        assertsEquals(expected: "Jardim Planalto", endereco.getEndereco());
        assertsEquals(expected: "74333-100", endereco.getCep());
        assertsEquals(expected: "1", endereco.getNumero());
        assertsEquals(expected: "Goiânia", endereco.getCidade());
        assertsEquals(expected: "SB", endereco.getBloco());
        assertsEquals(expected: "quadra 36", endereco.getQuadra());
        assertsEquals(expected: "lote 34 casa 3", endereco.getComplemento());
    }
}
