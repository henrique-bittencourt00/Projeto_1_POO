public class Main {
    public static void main(String[] args){
        Cachorro pug = new Cachorro();
        pug.setNome("Pug");
        pug.setRaca("maltes");
        pug.setHabitat("condominio");
        pug.setIdade(10);
        pug.setPeso(12);

        System.out.printf("\n Nome: " + pug.getNome() + "\n Raca: " + pug.getRaca() + "\n Habitat: " + pug.getHabitat() + "\n Idade: " + pug.getIdade() + "\n Peso: " + pug.getPeso() + "\n" + pug.emitirSom() + "\n" + pug.alimentar());

        Gato garfield = new Gato();
        garfield.setHabitat("condominio");
            garfield.setIdade(8);
        garfield.setNome("Garfield");
        garfield.setPeso(7);
        garfield.setCor("Marrom");

        System.out.printf("\n\n Nome: " + garfield.getNome() + "\nHabitat: " + garfield.getHabitat() + "\n Idade: " + garfield.getIdade() + "\n Peso: " + garfield.getPeso() + "\n Cor: " + garfield.getCor() + "\n" + garfield.emitirSom() + "\n" + garfield.alimentar());

        Leao simba = new Leao();
        simba.setNome("Simba");
        simba.setHabitat("savana");
        simba.setIdade(14);
        simba.setPeso(42);
        simba.setTamanhoJuba(4);

        System.out.printf("\n\n Nome: " + simba.getNome() + "\n Raca:" + simba.getHabitat() + "\n Idade:" + simba.getIdade() + "\n Peso: " + simba.getPeso() + "\n tamanhoJuba: " + simba.getTamanhoJuba() + "\n" + simba.emitirSom() + "\n" + simba.alimentar());
    }
}