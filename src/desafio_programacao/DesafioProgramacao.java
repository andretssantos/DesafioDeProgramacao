
package desafio_programacao;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioProgramacao {

    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Participante> participantes = new ArrayList();
    private static ArrayList<SalaEvento> salasEvento = new ArrayList();
    private static ArrayList<SalaCafe> salasCafe = new ArrayList();
    private static boolean repetirMenu = true;
    private static boolean repetirParticipante = true;
    private static boolean repetirEvento = true;
    private static boolean repetirCafe = true;
    
    public static void main(String[] args) {
    
        
                
        while(repetirMenu) {
        
            System.out.println("----------------------------");
            System.out.println("------ SEJA BEM VIND@ ------");
            System.out.println("----------------------------");
            System.out.println("------- MENU INICIAL -------");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("[1] Cadastrar Sala de Evento");
            System.out.println("[2] Cadastrar Espaço de Café");
            System.out.println("[3] Cadastrar Participante");
            System.out.println("[4] Procurar Sala de Evento");
            System.out.println("[5] Procurar Espaço de Café");
            System.out.println("[6] Procurar Participante");
            System.out.println("[7] Editar Cadastro de Participante");
            System.out.println("[8] Remover Participante");
            System.out.println("[9] Atribuir Salas / Iniciar Evento");
            System.out.println("[0] Encerrar Programa");
            System.out.print("Digite a opção desejada: ");
            String opcaoMenu = scan.nextLine();

            switch(opcaoMenu) {
            
                case "1" ->  {
                    while(repetirEvento) {
                        System.out.println("------------------------------");
                        System.out.println("- CADASTRO DE SALA DE EVENTO -");
                        System.out.println("------------------------------");
                        System.out.println("");
                        System.out.println("Digite o NOME DA SALA");
                        String nomeSala = scan.nextLine().toUpperCase();
                        System.out.println("Digite a LOTAÇÃO para a sala " + nomeSala);
                        int lotacaoSala = scan.nextInt();
                        scan.nextLine();
                        
                        SalaEvento e = new SalaEvento();
                        e.setNomeSala(nomeSala.toUpperCase());
                        e.setLotacaoSala(lotacaoSala);
                        
                        salasEvento.add(e);
                        
                        System.out.println("Deseja cadastrar outra SALA DE EVENTO? [S / N]");
                        String opcaoCadastro = scan.nextLine();
                        switch(opcaoCadastro.toUpperCase()) {
                            case "S" -> {
                                repetirEvento = true;
                            }
                            default -> {
                                repetirEvento = false;
                            }
                        }
                    }
                }
                case "2" ->  {
                    while(repetirCafe) {
                        System.out.println("------------------------------");
                        System.out.println("- CADASTRO DE ESPAÇO DE CAFÉ -");
                        System.out.println("------------------------------");
                        System.out.println("");
                        System.out.println("Digite o NOME DO ESPAÇO");
                        String nomeCafe = scan.nextLine().toUpperCase();
                        System.out.println("Digite a LOTAÇÃO para o espaço " + nomeCafe);
                        int lotacaoCafe = scan.nextInt();
                        scan.nextLine();
                        
                        SalaCafe c = new SalaCafe();
                        c.setNomeCafe(nomeCafe.toUpperCase());
                        c.setLotacaoCafe(lotacaoCafe);
                        
                        salasCafe.add(c);
                        
                        System.out.println("Deseja cadastrar outro ESPAÇO DE CAFÉ? [S / N]");
                        String opcaoCadastro = scan.nextLine();
                        switch(opcaoCadastro.toUpperCase()) {
                            case "S" -> {
                                repetirCafe = true;
                            }
                            default -> {
                                repetirCafe = false;
                            }
                        }
                    }
                }
                case "3" ->  {
                    while(repetirParticipante) {
                        System.out.println("----------------------------");
                        System.out.println("- CADASTRO DE PARTICIPANTE -");
                        System.out.println("----------------------------");
                        System.out.println("");
                        System.out.println("Digite o NOME");
                        String nome = scan.nextLine();
                        System.out.println("Digite o SOBRENOME");
                        String sobrenome = scan.nextLine();
            
                        Participante p = new Participante();
                        p.setNome(nome.toUpperCase());
                        p.setSobrenome(sobrenome.toUpperCase());
            
                        participantes.add(p);
                        
                        System.out.println("Deseja cadastrar outro participante? [S / N]");
                        String opcaoCadastro = scan.nextLine();
                        switch(opcaoCadastro.toUpperCase()) {
                            case "S" -> {
                                repetirParticipante = true;
                            }
                            default -> {
                                repetirParticipante = false;
                            }
                        }               
                    }
                }
                case "4" ->  {
                    System.out.println("-------------------------------");
                    System.out.println("------- SALAS DE EVENTO -------");
                    System.out.println("-------------------------------");
                    System.out.println("");
                    for(int i = 0; i < salasEvento.size(); i++) {
                        System.out.println("Registro: " + i + "\tNome da Sala: " + salasEvento.get(i).getNomeSala() + "\t\tLotação: " + salasEvento.get(i).getLotacaoSala());
                    }
                    System.out.println("Total de salas cadastradas: " + salasEvento.size());
                }
                case "5" ->  {
                    System.out.println("------- SALAS DE CAFÉ -------");
                    System.out.println("");
                    for(int i = 0; i < salasCafe.size(); i++) {
                        System.out.println("Registro: " + i + "\tNome da Sala: " + salasCafe.get(i).getNomeCafe() + "\t\tLotação: " + salasCafe.get(i).getLotacaoCafe());
                    }
                    System.out.println("Total de salas cadastradas: " + salasCafe.size());
                }
                case "6" ->  {
                    System.out.println("-----------------------------");
                    System.out.println("------- PARTICIPANTES -------");
                    System.out.println("-----------------------------");
                    System.out.println("");
                    System.out.println("[1] Exibir Participantes Cadastrados");
                    System.out.println("[2] Buscar Participante Por Nome");
                    System.out.println("[3] Buscar Participante Por Sobrenome");
                    String opcaoBusca = scan.nextLine();
                    switch(opcaoBusca) {
                        case "1" -> {
                            for(int i = 0; i < participantes.size(); i++) {
                            System.out.println("Registro " + i + ": " + participantes.get(i).getNome() + " " + participantes.get(i).getSobrenome());
                            }
                            System.out.println("Total de participantes cadastrados: " + participantes.size());
                        }
                        case "2" -> {
                            System.out.println("Digite o NOME");
                            String nome = scan.nextLine();
                            boolean encontrado = false;
                            for(int i = 0; i < participantes.size(); i++) {
                                if(nome.toUpperCase().equals(participantes.get(i).getNome())) {
                                    System.out.println(participantes.get(i).getNome() + " " + participantes.get(i).getSobrenome());
                                    encontrado = true;
                                } 
                            }
                            if(encontrado == false) {
                                System.out.println("Nenhum participante encontrado para o nome " + nome);
                            }                             
                        }
                        case "3" -> {
                            System.out.println("Digite o SOBRENOME");
                            String sobrenome = scan.nextLine();
                            boolean encontrado = false;
                            for(int i = 0; i < participantes.size(); i++) {
                                if(sobrenome.toUpperCase().equals(participantes.get(i).getSobrenome())) {
                                    System.out.println(participantes.get(i).getNome() + " " + participantes.get(i).getSobrenome());
                                    encontrado = true;
                                }
                            }
                            if(encontrado == false) {
                                System.out.println("Nenhum participante encontrado para o sobrenome " + sobrenome);
                            }
                        }
                    }
                }    
                case "7" ->  {
                    System.out.println("-------------------------------------");
                    System.out.println("-- EDITAR CADASTRO DE PARTICIPANTE --");
                    System.out.println("-------------------------------------");
                    System.out.println("");
                    for(int i = 0; i < participantes.size(); i++) {
                        System.out.println("Registro " + i + ": " + participantes.get(i).getNome() + " " + participantes.get(i).getSobrenome());
                    }
                    System.out.println("Digite o número do registro: ");
                    int registro = scan.nextInt();
                    scan.nextLine();
                    if(registro < participantes.size()) {
                        System.out.println("Digite o NOME");
                        String novoNome = scan.nextLine();
                        System.out.println("Digite o SOBRENOME");
                        String novoSobrenome = scan.nextLine();
                        Participante p = participantes.get(registro);
                        p.setNome(novoNome.toUpperCase());
                        p.setSobrenome(novoSobrenome.toUpperCase());
                    } else {
                        System.out.println("Número de registro inexistente");
                    }                  
                }
                case "8" ->  {
                    System.out.println("--------------------------------------");
                    System.out.println("-- REMOVER CADASTRO DE PARTICIPANTE --");
                    System.out.println("--------------------------------------");
                    System.out.println("");
                    for(int i = 0; i < participantes.size(); i++) {
                        System.out.println("Registro " + i + ": " + participantes.get(i).getNome() + " " + participantes.get(i).getSobrenome());
                    }
                    System.out.println("Digite o número do registro: ");
                    int registro = scan.nextInt();
                    scan.nextLine();
                    if(registro < participantes.size()) {
                        participantes.remove(registro);
                    } else {
                        System.out.println("Número de registro inexistente");
                    }
                }
                case "9" ->  {
                    System.out.println("------------------------------");
                    System.out.println("------- INICIAR EVENTO -------");
                    System.out.println("------------------------------");
                    System.out.println("Deseja iniciar o evento?\n" + "Ao iniciar o evento, ser\u00e3o atribu\u00eddas SALAS DE EVENTO\n" + "e ESPA\u00c7OS DE CAF\u00c9 para todos os PARTICIPANTES");
                    System.out.println("[S] Atribuir Salas E Iniciar Evento");
                    System.out.println("[N] Retornar Ao Menu Principal");
                    String opcaoInicio = scan.nextLine().toUpperCase();
                    switch(opcaoInicio) {
                        case "S" -> {
                            int menorLotacaoEvento = 1000;
                            int menorLotacaoCafe = 1000;
                            for(int i = 0; i < salasEvento.size(); i++) {
                                menorLotacaoEvento = salasEvento.get(i).getLotacaoSala();
                                if(salasEvento.get(i).getLotacaoSala() < menorLotacaoEvento) {
                                    menorLotacaoEvento = salasEvento.get(i).getLotacaoSala();
                                }
                            }
                            for(int i = 0; i < salasCafe.size(); i++) {
                                menorLotacaoCafe = salasCafe.get(i).getLotacaoCafe();
                                if(salasCafe.get(i).getLotacaoCafe() < menorLotacaoCafe) {
                                    menorLotacaoCafe = salasCafe.get(i).getLotacaoCafe();
                                }
                            }
                            if((participantes.size() / salasEvento.size()) > menorLotacaoEvento) {
                                System.out.println("Impossível distribuir PARTICIPANTES igualmente entre as SALAS DE EVENTO");
                                System.out.println("Adicione SALAS DE EVENTO ou altere as LOTAÇÕES e tente novamente");
                            } else if((participantes.size() / salasCafe.size()) > menorLotacaoCafe) {
                                System.out.println("Impossível distribuir PARTICIPANTES igualmente entre os ESPAÇOS DE CAFÉ");
                                System.out.println("Adicione ESPAÇOS DE CAFÉ ou altere as LOTAÇÕES e tente novamente");
                            } else {
                                for(int i = 0; i < salasEvento.size(); i++) {
                                    String nomeSala1 = salasEvento.get(i).getNomeSala();
                                    for(int j = 0; j < (participantes.size() / salasEvento.size()); j++) {
                                        participantes.get(j).setNomeSala1(nomeSala1);
                                    }
                                } 
                                for(int i = 0; i < salasCafe.size(); i++) {
                                    String nomeCafe1 = salasCafe.get(i).getNomeCafe();
                                    for(int j = 0; j < (participantes.size() / salasCafe.size()); j++) {
                                        participantes.get(j).setNomeCafe1(nomeCafe1);
                                    }
                                }
                            }
                            System.out.println("NOME\tSOBRENOME\tSALA 1\tSALA 2\tCAFÉ 1\tCAFÉ 2");
                            for (int i = 0; i < participantes.size(); i++) {
                                System.out.println(participantes.get(i).getNome() + "\t" + participantes.get(i).getSobrenome() + "\t" + 
                                        participantes.get(i).getNomeSala1() + "\t" + participantes.get(i).getNomeSala2() + "\t" + 
                                        participantes.get(i).getNomeCafe1() + "\t" + participantes.get(i).getNomeCafe2());
                            }
                        }
                    }              
                }
                default ->  {
                    repetirMenu = false;
                }
            
            }
        
        }
        
        
        
    }
    
}
