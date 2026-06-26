public class Cafe extends Bebida{
    @Override
    public void prepararIngrediente() {
        System.out.println("Coando café...");
    }

    @Override
    public void adicionarExtras() {
        System.out.println("Adicionando açúcar...");
    }

    @Override
    public boolean desejaExtra() {
        return true;
    }
}
