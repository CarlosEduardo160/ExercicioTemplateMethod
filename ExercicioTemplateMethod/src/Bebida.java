public abstract class Bebida {

    public void prepararBebida(){
        ferverAgua();
        prepararIngrediente();
        if(desejaExtra() == true){
            adicionarExtras();
        }
        servir();
    }

    public void ferverAgua(){
        System.out.println("Fervendo a água...");
    }

    public abstract void prepararIngrediente();

    public void servir(){
        System.out.println("servindo bebida...");
    }

    public abstract void adicionarExtras();

    public abstract boolean desejaExtra();
}
