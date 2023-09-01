public class Charmander {

    private double altura;
    private int peso;
    private String sexo;
    private String habilidad;
    private String tipo;
    private String[] debilidad={"Agua", "Tierra", "Roca"};

    public Charmander(double altura, int peso, String sexo, String habilidad) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.habilidad = habilidad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDebilidad(String[] debilidad) {
        this.debilidad = debilidad;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String[] getDebilidad() {
        return debilidad;
    }
}
