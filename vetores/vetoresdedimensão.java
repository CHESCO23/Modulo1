package vetores;

class VetoresMaisDe2Dimensoes {
        public static void main(String[] args) {
            Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
            Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro };
            Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };
            Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };
        }
    }

