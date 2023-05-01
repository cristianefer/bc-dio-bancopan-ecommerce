package br.com.cris.pan.ecommerce.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class VendaItem  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;

    private Double subTotal;

    @OneToOne
    private Produto produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="venda_id")
    private Venda venda;

}
