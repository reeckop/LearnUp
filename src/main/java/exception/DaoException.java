package exception;

/**
 *
 * @author Ricardo
 */
public class DaoException extends RuntimeException {
    public DaoException(String message) {
        super(message);
    }
}