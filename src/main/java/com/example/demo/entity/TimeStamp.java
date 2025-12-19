package  com.example.demo.entity;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
public class TimeStamp{
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}