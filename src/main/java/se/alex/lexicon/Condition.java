package se.alex.lexicon;

@FunctionalInterface
public interface Condition {
    boolean test(Product product);
}
