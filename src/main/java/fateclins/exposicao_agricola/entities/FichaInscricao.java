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
@Table(name = "tb_ficha_inscricao")
public class FichaInscricao implements Serializable {

    private static final long  serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private int numero;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TiposProduto tiposProduto;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private ProdutorRural produtorRural;

    @OneToMany(mappedBy = "fichaInscricao")
    private List<Julgamento> julgamentos;
}
