package fateclins.exposicao_agricola.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_produtor_rural")
public class ProdutorRural implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 100)
    private String municipio;

    @NotBlank
    @Size(max = 100)
    private String bairro;

    @NotNull
    private int telefone;

    @NotBlank
    @Email
    private String email;

    @OneToMany(mappedBy = "produtorRural")
    private List<FichaInscricao> fichasInscricao;
}