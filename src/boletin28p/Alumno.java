
package boletin28p;

import javax.swing.JOptionPane;

public class Alumno {
    String nome; int nota; Enderezo enderezo;
    Enderezo e =new Enderezo("ea",1);

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        enderezo = new Enderezo("nome",4);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }
    public void CambiarNota(){
    
    nota=Integer.parseInt(JOptionPane.showInputDialog(nota));
    
    }
    
    public class Enderezo{
        String rua; int numero;

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }
        
    }
    
}
