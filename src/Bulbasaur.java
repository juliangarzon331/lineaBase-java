public class Bulbasaur {

    private String nombre;
    private double altura;
    private int peso;
    private String sexo;
    private String habilidad;
    private String[] tipo=  {"Planta", "Veneno"};
    private String[] debilidad={"Fuego", "Psiquico", "Volador", "Hielo"};

    //CONSTRUCTOR
    public Bulbasaur(String nombre, double altura, int peso, String sexo, String habilidad, String[] tipo, String[] debilidad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.habilidad = habilidad;
        this.tipo = tipo;
        this.debilidad = debilidad;
    }

    //SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public void setDebilidad(String[] debilidad) {
        this.debilidad = debilidad;
    }

    //GET


    public String getNombre() {
        return nombre;
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

    public String[] getTipo() {
        return tipo;
    }

    public String[] getDebilidad() {
        return debilidad;
    }
}
