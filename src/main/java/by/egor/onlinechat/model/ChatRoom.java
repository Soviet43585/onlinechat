package by.egor.onlinechat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chat_rooms")
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name = "none";

    @Column
    String description = "none";

    @OneToMany(mappedBy = "chatId", cascade = CascadeType.ALL)
    List<Message> messages;

}
