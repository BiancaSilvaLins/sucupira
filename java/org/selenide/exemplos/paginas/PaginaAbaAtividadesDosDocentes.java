package org.selenide.exemplos.paginas;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PaginaAbaAtividadesDosDocentes {

    public void clicaNaAbaAtividadesDosDocentes(){
        $(byXpath("//a[contains(text(),'12. Atividades dos Docentes')]")).shouldBe(visible).click();
    }

    public void selecionarDocente(String docente){
        $(byId("formBaseProposta:selecionarDocente")).shouldBe(visible).selectOption(docente);
    }

    public void preencherCampoIniciacaoCientfica(String especializacao){
        $(byId("formBaseProposta:qtIniciacao")).shouldBe(visible).sendKeys(especializacao);
    }

    public void preencherCampoEspecializacao(String especializacao){
        $(byId("formBaseProposta:qtEspecializacao")).shouldBe(visible).sendKeys(especializacao);
    }

    public void preencherCampoMestrado1(String mestrado1){
        $(byId("formBaseProposta:qtMestradoProf")).shouldBe(visible).sendKeys(mestrado1);
    }

    public void preencherCampoTrabConclusao(String trabConclusao){
        $(byId("formBaseProposta:qtTrabConclusao")).shouldBe(visible).sendKeys(trabConclusao);
    }

    public void preencherCampoDoutorado1(String doutorado1){
        $(byId("formBaseProposta:qtDoutorado")).shouldBe(visible).sendKeys(doutorado1);
    }

    public void preencherCampoMestrado2(String mestrado2){
        $(byId("formBaseProposta:qtMestradoAcademico")).shouldBe(visible).sendKeys(mestrado2);
    }

    public void preencherCampoDoutorado2(String doutorado2){
        $(byId("formBaseProposta:qtDoutoradoProf")).shouldBe(visible).sendKeys(doutorado2);
    }

    public void preencherCampoParticipacaoEmProjetos(String participacaoProjetos){
        $(byId("formBaseProposta:qtProjetoPesquisa")).shouldBe(visible).sendKeys(participacaoProjetos);
    }

    public void preencherCampoArtesCenicas(String artesCenicas){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[5]/div[1]/div/div/input")).shouldBe(visible).sendKeys(artesCenicas);
    }

    public void preencherCampoArtesVisuais(String artesVisuais){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[5]/div[2]/div/div/input")).shouldBe(visible).sendKeys(artesVisuais);
    }

    public void preencherCampoMusica(String musica){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[5]/div[3]/div/div/input")).shouldBe(visible).sendKeys(musica);
    }

    public void preencherCampoOutraProducao(String outraProd){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[6]/div[1]/div/div/input")).shouldBe(visible).sendKeys(outraProd);
    }

    public void preencherCampoArtigoJR(String artigoJR){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[6]/div[2]/div/div/input")).shouldBe(visible).sendKeys(artigoJR);
    }

    public void preencherCampoArtiqoPeriodico(String artigoPeriodico){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[6]/div[3]/div/div/input")).shouldBe(visible).sendKeys(artigoPeriodico);
    }

    public void preencherCampoLivro(String livro){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[7]/div[1]/div/div/input")).shouldBe(visible).sendKeys(livro);
    }

    public void preencherCampoOutro(String outro){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[7]/div[2]/div/div/input")).shouldBe(visible).sendKeys(outro);
    }

    public void preencherCampoPartituraMusical(String partitura){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[7]/div[3]/div/div/input")).shouldBe(visible).sendKeys(partitura);
    }

    public void preencherCampoTrabalhoAnais(String trabAnais){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[8]/div[1]/div/div/input")).shouldBe(visible).sendKeys(trabAnais);
    }


    public void preencherCampoTraducao(String traducao){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[8]/div[2]/div/div/input")).shouldBe(visible).sendKeys(traducao);
    }

    public void preencherCampoApresentacaoTrabalho(String apresentacaoTrab){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[8]/div[3]/div/div/input")).shouldBe(visible).sendKeys(apresentacaoTrab);
    }

    public void preencherCampoCartas(String cartas){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[9]/div[1]/div/div/input")).shouldBe(visible).sendKeys(cartas);
    }

    public void preencherCampoCursoCurtaDuracao(String cursoCurto){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[9]/div[2]/div/div/input")).shouldBe(visible).sendKeys(cursoCurto);
    }

    public void preencherCampoDesenvolvimentoApp(String desenvApp){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[9]/div[3]/div/div/input")).shouldBe(visible).sendKeys(desenvApp);
    }

    public void preencherCampoDesenvolvimentoMaterial(String desenvMaterial){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[10]/div[1]/div/div/input")).shouldBe(visible).sendKeys(desenvMaterial);
    }

    public void preencherCampoDesenvolvimentoProducao(String desenvProd){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[10]/div[2]/div/div/input")).shouldBe(visible).sendKeys(desenvProd);
    }

    public void preencherCampoDesenvolvimentoDeTecnica(String desenvTecnica){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[10]/div[3]/div/div/input")).shouldBe(visible).sendKeys(desenvTecnica);
    }

    public void preencherCampoEditoria(String editoria){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[11]/div[1]/div/div/input")).shouldBe(visible).sendKeys(editoria);
    }

    public void preencherCampoManutencaoDeObra(String manutencao){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[11]/div[2]/div/div/input")).shouldBe(visible).sendKeys(manutencao);
    }

    public void preencherCampoMaquete(String maquete){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[11]/div[3]/div/div/input")).shouldBe(visible).sendKeys(maquete);
    }

    public void preencherCampoOrganizacaoDeEvento(String evento){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[12]/div[1]/div/div/input")).shouldBe(visible).sendKeys(evento);
    }

    public void preencherCampoOutros(String outros){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[12]/div[2]/div/div/input")).shouldBe(visible).sendKeys(outros);
    }

    public void preencherCampoPatente(String patente){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[12]/div[3]/div/div/input")).shouldBe(visible).sendKeys(patente);
    }

    public void preencherCampoProgramaRadioTv(String radioTv){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[13]/div[1]/div/div/input")).shouldBe(visible).sendKeys(radioTv);
    }

    public void preencherCampoRelatorioDePesquisa(String relatorio){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[13]/div[2]/div/div/input")).shouldBe(visible).sendKeys(relatorio);
    }

    public void preencherCampoServicosTecnicos(String servicos){
        $(byXpath("//*[@id='formBaseProposta:docentes']/div[13]/div[3]/div/div/input")).shouldBe(visible).sendKeys(servicos);
    }

    public void clicarBotaoSalvarDados(){
        $(byId("formBaseProposta:btnSalvar")).shouldBe(visible).click();
    }

    public String mensagemSucesso(String mensagemSucess){
        return $(byXpath("//*[@id='mensagensGeraisDoSistema']/li")).shouldBe(visible).getText();
    }
}