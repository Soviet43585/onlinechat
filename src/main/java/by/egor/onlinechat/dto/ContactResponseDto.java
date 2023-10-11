package by.egor.onlinechat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ContactResponseDto {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private boolean isProcessed;

}
