package commons;

public interface RequiredValidator {
    default void checkRequired(String str, RuntimeException e) {

    }
}
