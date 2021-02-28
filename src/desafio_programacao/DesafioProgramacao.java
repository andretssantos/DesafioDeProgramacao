
package desafio_programacao;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioProgramacao {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        ArrayList<Participante> participantes = new ArrayList();
        ArrayList<SalaEvento> salasEvento = new ArrayList();
        ArrayList<SalaCafe> salasCafe = new ArrayList();
        boolean repetirMenu = true;
        boolean repetirParticipante = true;
        boolean repetirEvento = true;
        boolean repetirCafe = true;
                
        while(repetirMenu) {
        
            System.out.println("----------------------------");
            System.out.println("------ SEJA BEM VIND@ ------");
            System.out.println("----------------------------");
            System.out.println("------- MENU INICIAL -------");
            System.out.println("");
            System.out.println("[1] Cadastrar Sala de Evento");
            System.out.println("[2] Cadastrar Sala de Café");
            System.out.println("[3] Cadastrar Participante");
            System.out.println("[4] Procurar Sala de Evento");
            System.out.println("[5] Procurar Sala de Café");
            System.out.println("[6] Procurar Participante");
            System.out.println("[7] Editar Cadastro de Participante");
            System.out.println("[8] Remover Participante");
            System.out.println("[9] Encerrar Programa");
            System.out.print("Digite a opção desejada: ");
            String opcaoMenu = scan.nextLine();

            switch(opcaoMenu) {
            
                case "1" ->  {
                    while(repetirEvento) {
                        System.out.println("- CADASTRO DE SALA DE EVENTO -");
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
                        System.out.println("- CADASTRO DE SALA DE CAFÉ -");
                        System.out.println("");
                        System.out.println("Digite o NOME DA SALA");
                        String nomeCafe = scan.nextLine().toUpperCase();
                        System.out.println("Digite a LOTAÇÃO para a sala " + nomeCafe);
                        int lotacaoCafe = scan.nextInt();
                        scan.nextLine();
                        
                        SalaCafe c = new SalaCafe();
                        c.setNomeCafe(nomeCafe.toUpperCase());
                        c.setLotacaoCafe(lotacaoCafe);
                        
                        salasCafe.add(c);
                        
                        System.out.println("Deseja cadastrar outra SALA DE CAFÉ? [S / N]");
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
                    System.out.println("------- SALAS DE EVENTO -------");
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
                    System.out.println("Digite o NOME");
                    String novoNome = scan.nextLine();
                    System.out.println("Digite o SOBRENOME");
                    String novoSobrenome = scan.nextLine();
                    Participante p = participantes.get(registro);
                    p.setNome(novoNome.toUpperCase());
                    p.setSobrenome(novoSobrenome.toUpperCase());
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
                    participantes.remove(registro);
                }
                case "9" ->  {
                    repetirMenu = false;
                }
            
            }
        
        }
        
        
        
    }
    
}
