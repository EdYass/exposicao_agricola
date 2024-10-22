package fateclins.exposicao_agricola.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_julgamento")
public class Julgamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ficha_id")
    private FichaInscricao fichaInscricao;

    @ManyToOne
    @JoinColumn(name = "juiz_id")
    private Juiz juiz;

    @NotNull
    @Length(min = 1, max = 100)
    private String notas;

    @Transient
    private Double notaFinal;

    public double calcularNotaFinal() {
        String[] notasArray = notas.split(",");
        double soma = 0;
        for (String nota : notasArray) {
            soma += Double.parseDouble(nota.trim());
        }
        notaFinal = soma / notasArray.length;
        return notaFinal;
    }
}