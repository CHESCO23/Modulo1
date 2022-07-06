package orientacao_a_objetos_2_objeto_this.herança_e_protect;


    public class Jogador extends pessoa {
        protected boolean aindaJoga = false;
        public void dizerSeAindaJoga(){
            System.out.println("Ainda joga? " + aindaJoga);
        }
    }

