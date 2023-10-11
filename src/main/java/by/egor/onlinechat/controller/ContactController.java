package by.egor.onlinechat.controller;

import by.egor.onlinechat.dto.ContactRequest;
import by.egor.onlinechat.dto.ContactResponseDto;
import by.egor.onlinechat.model.Contact;
import by.egor.onlinechat.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ContactController {

    private final ContactService contactService;

    @GetMapping("/secured/contacts/all")
    public List<Contact> getAll() {
        return contactService.getAll();
    }

    @GetMapping("/secured/contacts/getbyid/{id}")
    public ContactResponseDto getById(@PathVariable Long id) {
        Contact contact = contactService.getById(id);
        return new ContactResponseDto(contact.getId(), contact.getName(), contact.getEmail(), contact.getPhone(), contact.isProcessed());
    }

    @PostMapping("/secured/contacts/toggleprocessed/{id}")
    public void toggleProcessedById(@PathVariable Long id) {
        contactService.toggleProcessedById(id);
    }

    @GetMapping("/secured/contacts/getbyprocessed/{isProcessed}")
    public List<Contact> getAllByProcessed(@PathVariable boolean isProcessed) {
        return contactService.getAllByProcessed(isProcessed);
    }



    @PostMapping("/contacts/post")
    public void createContact(@RequestBody ContactRequest contactRequest) {
            contactService.create(contactRequest);
    }
}
