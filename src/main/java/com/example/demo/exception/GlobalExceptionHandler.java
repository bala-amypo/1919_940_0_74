pacakage com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionhandler{

    @ExceptionHandler(ResourceNotFoundException.class){
        public ResponseEntity<String>handleNotFound(ResourceNotFoundException ex){
            return new ResponsiveEntity<>.(ex.getMessage(),HttpStatus.NOT_FOUND);
        } 
    }
}