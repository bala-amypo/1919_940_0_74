pacakage com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice
public class GlobalExceptionhandler{

    @ExceptionHandler(ResourceNotFoundException.class)//runtime exception
        public ResponseEntity<String>handleNotFound(ResourceNotFoundException ex){
            return new ResponsiveEntity<>.(ex.getMessage(),HttpStatus.NOT_FOUND);
        } 
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>>
}