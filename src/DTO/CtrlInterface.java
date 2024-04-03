/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Interface.WindowDecorator;
import Object.Info;
import Object.ListaClassificacao;
import Tabela.Employee;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author aires
 */
public class CtrlInterface {
    private WindowDecorator windowDecorator;
    private CtrlGeral ctrlGeral;
    
    private boolean navegacao;

    public CtrlInterface(CtrlGeral ctrlGeral) {
        this.ctrlGeral = ctrlGeral;
        
        JFrame janela = new JFrame();     
        
        this.windowDecorator = Interface.WindowDecorator.decorator(janela, this);
        
        janela.show();
        
        janela.setExtendedState(janela.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }
    
    public Info getMedicao(){
        return ctrlGeral.getMedicao();
    }
    
    public ArrayList<String> getColuna(){
        return ctrlGeral.getColuna();
    }
    
    public List<ListaClassificacao> setListaClassificacao(){
        return ctrlGeral.setListaClassificacao();
    }
    
    public void gerarMetEs(){
        this.ctrlGeral.gerarMetEs();
    }
    
    public void gerarMetAR(){
        this.ctrlGeral.gerarMetAR();
    }
    
    public String gerarRelatorio(){
        return this.ctrlGeral.gerarRelatorio();
    }
    
    public void imputarValoresAr(){
        this.ctrlGeral.imputarValoresAr();
    }
    
    public void imputarValoresEs(){
        this.ctrlGeral.imputarValoresEs();
    }
    
    public void setMedicao(Info medicao){
        this.ctrlGeral.setMedicao(medicao);
    }
    
    public List<ListaClassificacao> getListaClassificacoes() {
        return this.ctrlGeral.getListaClassificacoes();
    }
    
    
    public ListaClassificacao getListaClassificacao(int index) {
        return this.ctrlGeral.getListaClassificacao(index);
    }
    
    public void setListaClassificacao(List<ListaClassificacao> listaClassificacao){
        this.ctrlGeral.setListaClassificacao(listaClassificacao);
    }
    
    public void addListaClassificacao(ListaClassificacao listaClassificacao) {
        this.ctrlGeral.addListaClassificacao(listaClassificacao);
    }
    
    public  List<Marcador> getApendice(){
        return this.ctrlGeral.getApendice();
    }
    
    public Marcador getMarcador(int index){
        return this.getMarcador(index);
    }
    
    public void reSetMedicao(){
        this.ctrlGeral.reSetMedicao();
    }
    
    public void setApendice(Guia apendice) {
        this.ctrlGeral.setApendice(apendice);
    }
    
    public List<Employee> gerarDadosTabelaOriginal(){
        return this.ctrlGeral.gerarDadosTabelaOriginal();
    }
    
    public List<Employee> gerarDadosTabelaImputados(){
        return this.ctrlGeral.gerarDadosTabelaImputados();
    }
    
    public Info lerArquivo(String caminho){
        return this.ctrlGeral.lerArquivo(caminho);
    }
    
    public void gravarEstacao(Info medicao){
        this.ctrlGeral.gravarEstacao(medicao);
    }
    
    public void gravarListaColunas(Info medicao){
        this.ctrlGeral.gravarListaColunas(medicao);
    }
    
    public List<Info> listarEstacoes(){
        return this.ctrlGeral.listarEstacoes();
    }
    
    public List<String>listarAnosDadosMedidosEstacoes( String codigoEstacao){
        return this.ctrlGeral.listarAnosDadosMedidosEstacoes(codigoEstacao);
    }
    
    public void recarregarRecuperarDecorator(){
        this.windowDecorator.montarRecuperar();
    }
    
    public void recarregarRecuperarProcessadosDecorator(){
        this.windowDecorator.montarRecuperarProcessados();
    }
    
    public void setMedicao(String codigo, String periodo){
        Info med = this.ctrlGeral.getMedicaoPeriodo(codigo, periodo);
        med.setPeriodo(periodo);
        this.ctrlGeral.setMedicao(med);
    }
    
    public void atualizarTabelaVisaoGeral(){
        this.windowDecorator.popularTabelaEstacoesVisaoGeral();
    }

    public void atualizarTabelaVisaoAuxiliar(){
        this.windowDecorator.popularTabelaEstacoesVisaoAuxiliar();
    }
    
    public void atualizarMetodologia(Integer codigo){
        this.ctrlGeral.atualizarMetodologia(codigo);
    }
    
    public void gravarEstudo(){
        this.ctrlGeral.gravarEstudo();
    }
    
    public List<Info> listarEstudos(){
        return this.ctrlGeral.listarEstudos();
    }
    
    public Info getMedicaoPeriodo(String codigo, String periodo){
        return this.ctrlGeral.getMedicaoPeriodo(codigo, periodo);
    }
    
    public void atualizarRelatorioResultdos(){
       this.windowDecorator.atualizarRelatiorioResultados();
    }
    
    public void carregarListaClassificacao(){
        this.ctrlGeral.carregarListaClassificacao();
    }
    
    public void habilitarAbaInicio(){
        this.windowDecorator.habilitarAbaInicio();
    }
    
    public void desabilitarAbaInicio(){
        this.windowDecorator.desabilitarAbaInicio();
    }
    public void habilitarAbaImportar(){
        this.windowDecorator.habilitarAbaImportar();
    }
    
    public void desabilitarAbaImportar(){
        this.windowDecorator.desabilitarAbaImportar();
    }
    
    public void habilitarAbaRecuperar(){
        this.windowDecorator.habilitarAbaRecuperar();
    }
    
    public void desabilitarAbaRecuperar(){
        this.windowDecorator.desabilitarAbaRecuperar();
    }
    
    public void habilitarAbaRecuperarProcessados(){
        this.windowDecorator.habilitarAbaRecuperarProcessados();
    }
    
    public void desabilitarAbaRecuperarprocessados(){
        this.windowDecorator.desabilitarAbaRecuperarprocessados();
    }
    
    public void habilitarAbaVisaoGeral(){
        this.windowDecorator.habilitarAbaVisaoGeral();
    }
    
    public void desabilitarAbaVisaoGeral(){
        this.windowDecorator.desabilitarAbaVisaoGeral();
    }
    
    public void habilitarAbaMetodologia(){
        this.windowDecorator.habilitarAbaMetodologia();
    }
    public void desabilitarAbaMetodologia(){
        this.windowDecorator.desabilitarAbaMetodologia();
    }
    
    public void habilitarAbaVisaoAuxiliar(){
        this.windowDecorator.habilitarAbaVisaoAuxiliar();
    }
    
    public void desabilitarAbaVisaoAuxiliar(){
        this.windowDecorator.desabilitarAbaVisaoAuxiliar();
    }
    
    public void habilitarAbaResultados(){
        this.windowDecorator.habilitarAbaResultados();
    }
    
    public void desabilitarAbaResultados(){
        this.windowDecorator.desabilitarAbaResultados();
    }
    
    public void abrirAbaInicio(){
        this.windowDecorator.abrirAbaInicio();
    }
    
    public void abrirAbaImportar(){
        this.windowDecorator.abrirAbaImportar();
    }
    
    public void abrirAbaRecuperar(){
        this.windowDecorator.abrirAbaRecuperar();
    }
    
    public void abrirAbaRecuperarProcessados(){
        this.windowDecorator.abrirAbaRecuperarProcessados();
    }
    
    public void abrirAbaVisaoGeral(){
        this.windowDecorator.abrirAbaVisaoGeral();
    }
    
    public void abrirAbaMetodologia(){
        this.windowDecorator.abrirAbaMetodologia();
    }
    
    public void abrirAbaVisaoAuxiliar(){
        this.windowDecorator.abrirAbaVisaoAuxiliar();
    }
    
    public void abrirAbaResultados(){
        this.windowDecorator.abrirAbaResultados();
    }
    
    public void atualizarAbaInicio(){
        this.windowDecorator.atualizarAbaInicio();
    }
    
    public void setWaitingCursor(){
        this.windowDecorator.setWaitingCursor();
    }
    
    public void unsetWaitingCuror(){
        this.windowDecorator.unsetWaitingCursor();
    }
    
    public void habiliaChkBoxBancoResultados(){
        this.windowDecorator.habiliaChkBoxBancoResultados();
    }
    public void desabiliaChkBoxBancoResultados(){
        this.windowDecorator.desabiliaChkBoxBancoResultados();
    }
    
   public void auxiliarFromMetodolog(){
        this.windowDecorator.auxiliarFromMetodolog();
    }
    
    public void auxiliarFromRecuperar(){
        this.windowDecorator.auxiliarFromRecuperar();
    }
    
    
}
