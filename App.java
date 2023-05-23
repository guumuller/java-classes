import java.util.Scanner;

public class App {

        public String Nome;
        public String Sobrenome;
        public int Altura;
        public int Peso;
        public String CorOlhos;
        public String CorCabelo;
        public String CPF;
        
        Scanner ler = new Scanner(System.in);
        public void setNome(String nome) {
            Nome = nome;
        }
        public String getNome(){
            return Nome;
        }

        public void setSobrenome(String sobrenome){
            Sobrenome = sobrenome; 
        }
        public String getSobrenome(){
            return Sobrenome;
        }

        public void setAltura(int altura){
            Altura = altura;
        }
        public int getAltura(){
            return Altura;
        }

        public void setPeso(int peso){
            Peso = peso;
        }
        public int getPeso(){
            return Peso;
        }

        public void setCorOlhos(String corolhos){
            CorOlhos = corolhos;
        }
        public String getCorOlhos(){
            return CorOlhos;
        }

        public void setCorCabelo(String corcabelo){
            CorCabelo = corcabelo;
        }
        public String getCorCabelo(){
            return CorCabelo;
        }

        public void setCPF(String cpf){
            CPF = cpf;
        }
        public String getCPF(){
            return CPF;
        }

        public void Salvar(){
            
            System.out.println("Escreva o seu nome:");
            Nome = ler.next();
            
            System.out.println("Escreva seu sobrenome:");
            Sobrenome = ler.next();
            
            System.out.println("Escreva sua altura:");
            Altura = ler.nextInt();
            
            System.out.println("Escreva seu peso:");
            Peso = ler.nextInt();
            
            System.out.println("Escreva a cor do seus olhos:");
            CorOlhos = ler.next();

            System.out.println("Escreva a cor do seu cabelo:");
            CorCabelo = ler.next();
            
            System.out.println("Escreva seu CPF");
            CPF = ler.next();
            
            setNome(Nome);
            setSobrenome(Sobrenome);
            setAltura(Altura);
            setCPF(CPF);
            setCorCabelo(CorCabelo);
            setCorOlhos(CorOlhos);
            setPeso(Peso);
        }
 
        public void exibirDados(){
            String Nome = this.getNome();
            String Sobrenome = this.getSobrenome();
            int Altura = this.getAltura();
            int Peso = this.getPeso();
            String CorOlhos = this.getCorOlhos();
            String CorCabelo = this.getCorCabelo();
            String CPF = this.getCPF();

            System.out.println("Seu nome completo é " + Nome + " " + Sobrenome + " sua altura é " + Altura + "cm" + " peso " + Peso + "kg " + "cor dos seus olhos é " + CorOlhos + " cor do seu cabelo é " + CorCabelo + " seu CPF é " + CPF);
        }

        public void listarDados(){
            System.out.println("Nome " + "Sobrneome " + "Altura " + "Peso " + "CorOlhos " + "CorCabelo " + "CPF ");
            System.out.print("|" + Nome + "|" + Sobrenome + "|" + Altura + "|" + CorOlhos + "|" + CorCabelo + "|" + CPF + "|" );
        }

        public static void main(String[] args) throws Exception {
            
            App pessoa = new App();

            pessoa.Salvar();
            pessoa.exibirDados();
            pessoa.listarDados();


        }
}
