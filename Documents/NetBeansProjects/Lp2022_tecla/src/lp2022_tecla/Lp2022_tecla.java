/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2022_tecla;

import java.util.Scanner;

/**
 *
 * @author simao
 */
public class Lp2022_tecla {

   
    public static void main(String[] args) {
        String mensagem;
        Scanner scan =new Scanner(System.in);
        mensagem=scan.nextLine();
        mensagem=mensagem.toUpperCase();
        char[] digitar = mensagem.toCharArray();
        String resultado="";
        if(mensagem.length()>20){
            System.out.println("error20");
        }else{
            for(int i=0;i<mensagem.length();i++){
                if('A'<= digitar[i] && digitar[i]<='C'){
                    resultado+="2 ";
                    if(digitar[i]=='A'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='B'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='C'){
                        resultado+="3"+"\n";
                    }
                }
                if('D'<= digitar[i] && digitar[i]<='F'){
                    resultado+="3 ";
                    if(digitar[i]=='D'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='E'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='F'){
                        resultado+="3"+"\n";
                    }
                }
                if('G'<= digitar[i] && digitar[i]<='I'){
                    resultado+="4 ";
                    if(digitar[i]=='G'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='H'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='I'){
                        resultado+="3"+"\n";
                    }
                }
                if('J'<= digitar[i] && digitar[i]<='L'){
                    resultado+="5 ";
                    if(digitar[i]=='J'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='K'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='L'){
                        resultado+="3"+"\n";
                    }
                }
                if('M'<= digitar[i] && digitar[i]<='O'){
                    resultado+="6 ";
                    if(digitar[i]=='M'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='N'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='O'){
                        resultado+="3"+"\n";
                    }
                }
                if('P'<= digitar[i] && digitar[i]<='S'){
                    resultado+="7 ";
                    if(digitar[i]=='P'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='Q'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='R'){
                        resultado+="3"+"\n";
                    }
                    }else if(digitar[i]=='S'){
                        resultado+="4"+"\n";
                    }
                
                if('T'<= digitar[i] && digitar[i]<='V'){
                    resultado+="8 ";
                    if(digitar[i]=='T'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='U'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='V'){
                        resultado+="3"+"\n";
                    }
                }
                if('W'<= digitar[i] && digitar[i]<='Z'){
                    resultado+="9 ";
                    if(digitar[i]=='W'){
                        resultado+="1"+"\n";
                    }else if(digitar[i]=='X'){
                        resultado+="2"+"\n";
                    }else if(digitar[i]=='Y'){
                        resultado+="3"+"\n";
                    }else if(digitar[i]=='Z'){
                        resultado+="4"+"\n";
                    }
                }
               
            }
            System.out.println(resultado);
        }
    }
    
}
