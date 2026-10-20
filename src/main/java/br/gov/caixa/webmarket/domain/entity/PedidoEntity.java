package br.gov.caixa.webmarket.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cliente_id", nullable = false)
    private ClienteEntity cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedidoEntity> itens = new ArrayList<>();

    @OneToMany(mappedBy = "pedido")
    private List<SituacaoPedidoEntity> situacao = new ArrayList<>();

    @Column(nullable = false)
    private Float valorTotal;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    public PedidoEntity() {}

    public PedidoEntity(ClienteEntity cliente, List<ItemPedidoEntity> itens, List<SituacaoPedidoEntity> situacao, Float valorTotal, LocalDateTime dataPedido) {
        this.cliente = cliente;
        this.itens = itens;
        this.situacao = situacao;
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedidoEntity> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoEntity> itens) {
        this.itens = itens;
    }

    public List<SituacaoPedidoEntity> getSituacao() {
        return situacao;
    }

    public void setSituacao(List<SituacaoPedidoEntity> situacao) {
        this.situacao = situacao;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
}
