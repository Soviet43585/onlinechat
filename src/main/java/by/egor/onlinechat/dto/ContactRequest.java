package by.egor.onlinechat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactRequest {

    private String name;
    private String phone;
    private String email;

}
