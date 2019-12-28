package br.com.sindicoonline.frm;

import br.com.sindicoonline.DAO.BoletoDAO;
import br.com.sindicoonline.Utilits.Utilidades;
import javax.swing.UIManager;

public class TrabalhoFaculdade {
    
    public static void main(String[] args) {
        
        try {
          
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Teste adicionar Predio
//        Predio predio = new Predio();
//        PredioDAO daoPredio = new PredioDAO();
//
//        predio.setNomePredio("Borboleta");
//        predio.setBlocoPredio("B");
//        predio.setValorCondominio(550);
//
//        try {
//
//            daoPredio.adicionarPredio(predio);
//            System.out.println("Salvo com sucesso.");
//        } catch (Exception ex) {
//            System.out.println("ERRO ao SALVAR");
//        }
        //adicionar sindico
//        Sindico sindico = new Sindico();
//        SindicoDAO daoSindico = new SindicoDAO();
//        Predio predio = new Predio();
//        predio.setIdPredio(1);
//
//        sindico.setNomeSindico("Laila");
//        sindico.setLoginSindico("laila");
//        sindico.setSenhaSindico("123");
//        sindico.setIdPredio(predio);
//
//        try {
//            daoSindico.adicionarSindico(sindico);
//            System.out.println("Salvo com sucesso.");
//        } catch (Exception ex) {
//            System.out.println("ERRO ao SALVAR");
//        }
//                  Deletar Predio
//                Predio predio = new Predio();
//                predio.setIdPredio( Colocar ID do PREdio );
//                PredioDAO daoPredio = new PredioDAO();
//                daoPredio.deletePredio(predio);
//                  Deletar sindico
//                Sindico sindico = new Sindico();
//                sindico.setIdSindico(2);
//                
//                SindicoDAO daosindico = new SindicoDAO();
//                daosindico.deleteSindico(sindico);

// Atualizar Predio
//        Predio predio = new Predio();
//        PredioDAO daoPredio = new PredioDAO();
//        predio.setIdPredio(1);
//        predio.setNomePredio("Borboleta");
//        predio.setBlocoPredio("B");
//        predio.setValorCondominio(550);
//        
//        try {
//            
//            daoPredio.updatePredio(predio);
//            System.out.println("Atualizado com sucesso.");
//        } catch (Exception ex) {
//            System.out.println("ERRO ao atualizar");
//        }
        

//        Predio predio = new Predio();
//        PredioDAO daoPredio = new PredioDAO();
//        
//        predio.setIdPredio(1);
//        
//        daoPredio.readPredio(predio);
//        
//        System.out.println(predio.getNomePredio());
        
                

        

//                
//Predio predio = new Predio();
//PredioDAO daoPredio = new PredioDAO();
//
//predio.setNomePredio("UNG");
//try {
//daoPredio.adicionarPredio(predio);
//}catch(Exception e){
//    
//}
//try {
//    predio.setIdPredio(5);
//   daoPredio.deletePredio(predio);

   

//}catch(Exception ex){}


//Bloco bloco = new Bloco();
//BlocoDAO daobloco = new BlocoDAO();
//
//bloco.setNumeroBloco("J");
//bloco.setValorCondominio(1500.00);
//bloco.setIdPredio(5);
//
//daobloco.adicionarBloco(bloco);




//Apto apto = new Apto();
//AptoDAO daoApto = new AptoDAO();
//apto.setNumeroApto(1001);
//apto.setIdBloco(1);

//daoApto.adicionarApto(apto);

//apto.setIdApto(5);
//daoApto.deleteApto(apto);

//
//apto.setIdApto(2);
//apto.setNumeroApto(9999);
//apto.setIdBloco(9);
//
//daoApto.updateApto(apto);

//Morador morador = new Morador();
//MoradorDAO daoMorador = new MoradorDAO();
//
//morador.setIdMorador(5);
//
//morador.setNomeMorador("VINICIUS");
//morador.setCpfMorador(String.valueOf(987654321));
//morador.setLoginMorador("VINI");
//morador.setSenhaMorador("123");
//morador.setIdApto(1);

//daoMorador.adicionarMorador(morador);
//daoMorador.updateApto(morador);
//
//
//
//        frmPrincipal prin = new frmPrincipal();
//        prin.setVisible(true);
//
frmLogin login = new frmLogin();
login.setVisible(true);
//        
//        
//
//    Utilidades util = new Utilidades();
//        System.out.println(util.achaCodigoPredioParaAviso("2"));
    }
    
}
