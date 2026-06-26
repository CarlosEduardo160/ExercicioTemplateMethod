public class Cha extends Bebida{
    @Override
    public void prepararIngrediente() {
        System.out.println("Mergulhando sachê...");
    }

    @Override
    public void adicionarExtras() {
        System.out.println("Adicionando limão");
    }

    @Override
    public boolean desejaExtra() {
        return false;
    }
}
