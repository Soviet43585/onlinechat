package by.egor.onlinechat.service;

import by.egor.onlinechat.dto.ContactRequest;
import by.egor.onlinechat.dto.ContactResponseDto;
import by.egor.onlinechat.model.Contact;

import java.util.List;

public interface ContactService {
    
    List<Contact> getAll();

    List<Contact> getAllByProcessed(boolean isProcessed);

    Contact getById(Long id);

    Contact addContact(Contact contact);

    Contact update(ContactRequest contactRequest);

    Contact getByPhone(String phone);

    Contact create(ContactRequest contactRequest);

    void toggleProcessedById(Long id);

}
