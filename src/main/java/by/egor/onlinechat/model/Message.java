package by.egor.onlinechat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String content;

    @Column
    Date time;

    @Column(name = "user_id")
    Long userId;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    ChatRoom chatId;

}

