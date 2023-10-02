package tarea1Mocks;

public class Banco {
    private ASFIService asfiService;

    public Banco() {
        this.asfiService = new ASFIService();
    }

    public Banco(ASFIService asfiService) {
        this.asfiService = asfiService;
    }

    public void setAsfiService(ASFIService asfiService) {
        this.asfiService = asfiService;
    }

    public int getMaximoPrestamo(String ci) {
        String categoria = asfiService.getCategoria(ci);
        switch (categoria) {
            case "A":
                return 200000;
            case "B":
                return 100000;
            case "C":
                throw new IllegalStateException("No se puede prestar ningún monto, ALERTA!");
            default:
                throw new IllegalArgumentException("Categoría desconocida");
        }
    }
}

