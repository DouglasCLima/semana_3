public class semana3Atividades {
        public static void main(String[] args) {
            System.out.println("SEJA Bem vindo ao COMEX");

            int anoAtual = 2023;
            String cliente1 = "Fulano";
            int dataDeNascimentoCliente1 = 1990;
            int idadeCliente1 = anoAtual - dataDeNascimentoCliente1;
            String cliente2 = "Sicrano";
            int dataDeNascimentoCliente2 = 2000;
            int idadeCliente2 = anoAtual - dataDeNascimentoCliente2;


            System.out.println(">>>> Listagem dos Clientes");
            System.out.println("_______________________________________");
            System.out.println("Nome: " + cliente1);
            System.out.println("Data de Nascimento: " + dataDeNascimentoCliente1);
            System.out.println(idadeCliente1);
            if (idadeCliente1 <= 17){
                System.out.println("Caracteristíca Etária: Adolescente");
            }else if (idadeCliente1 >=18 && idadeCliente1 <=29){
                System.out.println("Caracteristíca Etária: Jovem");
            }else if (idadeCliente1>=30 && idadeCliente1 <=59){
                System.out.println("Caracteristíca Etária: Adulto");
            }else{
                System.out.println("Caracteristíca Etária: Idoso");
            }
            System.out.println("_______________________________________");
            System.out.println("Nome: " + cliente2);
            System.out.println("Data de Nascimento: " + dataDeNascimentoCliente2);
            System.out.println(idadeCliente2);
            if (idadeCliente2 <= 17){
                System.out.println("Caracteristíca Etária: Adolescente");
            } else if (idadeCliente2 >=18 && idadeCliente2<=29) {
                System.out.println("Caracteristíca Etária: Jovem");
            }else if (idadeCliente2>=30 &&  idadeCliente2 <=59){
                System.out.println("Caracteristíca Etária: Adulto");
            }else{
                System.out.println("Caracteristíca Etária: Idoso");
            }

            String produto1 = "Livro";
            double precoProduto1 = 49.95;
            String produto2 = "Celular";
            double precoProduto2 = 1470.76;

            System.out.println("\n>>>> Listagem Dos Produtos");
            System.out.println("_______________________________________");
            System.out.println("Nome: "+ produto1);
            System.out.println("Preço: R$" + precoProduto1);
            System.out.println("_______________________________________");
            System.out.println("Nome: "+ produto2);
            System.out.println("Preço: R$" + precoProduto2);
        }
    }
