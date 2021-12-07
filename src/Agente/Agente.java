package Agente;

import Models.Datos;
import Views.FrmLogin;
import Views.PanelAdmin;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;


public class Agente extends GuiAgent {
    
    private String parametro;
    private int id, tipoUser;
    private int numeroReg, numeroAd, numeroInf, numeroAtr, tamD=0;
    private int primerValor, valor=0;
    private FrmLogin gui;

    Datos msga=new Datos();
        
        public void setup() {
        System.out.println("Bienvenido! Agente-Reactivo "+getAID().getName()+" se esta ejecutando ");
        gui = new FrmLogin(this);
        gui.setVisible(true);

    }
    
    protected void takeDown() {
        System.out.println("Agente Reactivo "+getAID().getName()+" terminado.");
    }
    
    @Override
    protected void onGuiEvent(GuiEvent ge) {
        //parametro de la interfaz ingreso
        parametro=(String) ge.getParameter(0);
        
        //identificacion del ambiente (Percepciones)
        id=msga.getId();
        numeroReg=msga.getAduana();
        numeroAd=msga.getDepto();
        numeroAtr=msga.getKilos();
        numeroInf=msga.getMes();
       
        
        //Acciones de agente
                
        if(numeroAd != 0)
        {
            
            System.out.println("Ejecutando Mensaje de Advertencia");
            
            if(numeroAtr !=0)
            {
                PanelAdmin ca= new PanelAdmin();
                   ca.setVisible(true);
                System.out.println("Ejecutando Mensaje el incremento es mayor al 10 %");
                
                if(numeroInf != 0)
                {
                    
                    
                        PanelAdmin mi= new PanelAdmin();
                         mi.setVisible(true);
                        System.out.println("Ejecutando Mensaje de Informe");
                      
                }
            }
            else
            {
                if(numeroInf != 0)
                {
                                        
                        PanelAdmin mi= new PanelAdmin();                       
                        mi.setVisible(true);
                        System.out.println("Ejecutando Mensaje de Informe");
                     
                }
            }
        }
        else
        {
            if(numeroAtr !=0)
            {
                PanelAdmin ca= new PanelAdmin();
                ca.setVisible(true);
                System.out.println("Ejecutando Mensaje Variacion exsesiva");
                
                if(numeroInf != 0)
                {
                   
                        PanelAdmin mi= new PanelAdmin();
                        mi.setVisible(true);
                        System.out.println("Ejecutando Mensaje de Informe");
                     
                }
            }
            else
            {
                if(numeroInf != 0)
                {
                    {
                        PanelAdmin ca= new PanelAdmin();
                        ca.setVisible(true);
                        System.out.println("Ejecutando Mensaje de Informe");
                    }  
                }
            }
        }
        addBehaviour(new CyclicBehaviour()
        {
            @Override
            public void action() {
                 primerValor=valor;
                //System.out.println("Ejecutando el comportamiento ciclico");
            }
        });
    }

    
    
    
}







