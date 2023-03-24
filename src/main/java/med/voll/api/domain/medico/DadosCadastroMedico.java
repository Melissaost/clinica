package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank // nao é nulo nem vazio
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //expressao regular, d de digitos e 4 a 6 caracter
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid // validar o outro dto tambem
        DadosEndereco endereco) {
}
