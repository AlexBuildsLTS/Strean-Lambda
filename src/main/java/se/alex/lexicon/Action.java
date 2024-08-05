package se.alex.lexicon;

@FunctionalInterface
interface Action<Product> {
    void execute(Product product);
}