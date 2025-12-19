package  com.example.demo.entity;
 import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
public class TimeStamp{
    @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    @PrePersist
    public void OnCreate(){
        LocalDateTime now1= LocalDateTime().now();
        this.createAt=now1;
        this.updateAt=now1;
    }
    @PreUpdate
    public void OnUpdate(){
        this.updateAt=now1;
    }

}