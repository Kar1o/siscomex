package com.kar1o.springsecurity.model;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "XML_CHECK")
public class Xml {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="USER_NAME", nullable=false)
    private String userName;

    @Column(name = "VALOR_MERCADORIA", nullable=false)
    private int valorMercadoria;

    @Column(name = "PESO_BRUTO", nullable=false)
    private int pesoBruto;

    @Column(name = "PESO_LIQUIDO", nullable=false)
    private int pesoLiquido;

    @Column(name = "DATA_EMBARQUE", nullable=false)
    private Date dataEmbarque;

    @Column(name = "DATA_CHEGADA", nullable=false)
    private Date dataChegada;

    @Column(name = "LOCAL_ORIGEM", nullable=false)
    private String localOrigem;

    @Column(name = "LOCAL_DESTINO", nullable=false)
    private String localDestino;

    @Column(name = "EMPRESA_ORIGEM")
    private String empresaOrigem;

    @Column(name = "EMPRESA_DESTINO")
    private String empresaDestino;

    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getValorMercadoria() {
			return valorMercadoria;
		}

		public void setValorMercadoria(int valorMercadoria) {
			this.valorMercadoria = valorMercadoria;
		}

		public int getPesoBruto() {
			return pesoBruto;
		}

		public void setPesoBruto(int pesoBruto) {
			this.pesoBruto = pesoBruto;
		}

		public int getPesoLiquido() {
			return pesoLiquido;
		}

		public void setPesoLiquido(int pesoLiquido) {
			this.pesoLiquido = pesoLiquido;
		}

		public Date getDataEmbarque() {
			return dataEmbarque;
		}

		public void setDataEmbarque(Date dataEmbarque) {
			this.dataEmbarque = dataEmbarque;
		}

		public Date getDataChegada() {
			return dataChegada;
		}

		public void setDataChegada(Date dataChegada) {
			this.dataChegada = dataChegada;
		}

		public String getLocalOrigem() {
			return localOrigem;
		}

		public void setLocalOrigem(String localOrigem) {
			this.localOrigem = localOrigem;
		}

		public String getLocalDestino() {
			return localDestino;
		}

		public void setLocalDestino(String localDestino) {
			this.localDestino = localDestino;
		}

		public String getEmpresaOrigem() {
			return empresaOrigem;
		}

		public void setEmpresaOrigem(String empresaOrigem) {
			this.empresaOrigem = empresaOrigem;
		}

		public String getEmpresaDestino() {
			return empresaDestino;
		}

		public void setEmpresaDestino(String empresaDestino) {
			this.empresaDestino = empresaDestino;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Xml other = (Xml) obj;
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Xml [id=" + id + ", valorMercadoria=" + valorMercadoria + ", pesoBruto=" + pesoBruto
					+ ", pesoLiquido=" + pesoLiquido + ", dataEmbarque=" + dataEmbarque + ", dataChegada=" + dataChegada
					+ ", localOrigem=" + localOrigem + ", localDestino=" + localDestino + ", empresaOrigem="
					+ empresaOrigem + ", empresaDestino=" + empresaDestino + "]";
		}

}