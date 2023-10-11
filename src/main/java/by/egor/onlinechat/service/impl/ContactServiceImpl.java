package by.egor.onlinechat.service.impl;

import by.egor.onlinechat.dto.ContactRequest;
import by.egor.onlinechat.dto.ContactResponseDto;
import by.egor.onlinechat.model.Contact;
import by.egor.onlinechat.repository.ContactRepository;
import by.egor.onlinechat.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getById(Long id) {
        return contactRepository.getReferenceById(id);
    }

    @Override
    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllByProcessed(boolean isProcessed) {
        return contactRepository.findAllByIsProcessed(isProcessed);
    }

    @Override
    public Contact update(ContactRequest contactRequest) {
        Contact contact = contactRepository.findByPhone(contactRequest.getPhone());
        contact.setName(contactRequest.getName());
        contact.setEmail(contactRequest.getEmail());
        contact.setProcessed(false);
        return contactRepository.save(contact);
    }

    @Override
    public Contact getByPhone(String phone) {
        return contactRepository.findByPhone(phone);
    }

    @Override
    public Contact create(ContactRequest contactRequest) {
        try {
            Contact contact = contactRepository.findByPhone(contactRequest.getPhone());
            contact.setName(contactRequest.getName());
            contact.setEmail(contactRequest.getEmail());
            contact.setProcessed(false);
            return contactRepository.save(contact);
        } catch (NullPointerException e) {
            Contact contact = new Contact();
            contact.setName(contactRequest.getName());
            contact.setEmail(contactRequest.getEmail());
            contact.setPhone(contactRequest.getPhone());
            return contactRepository.save(contact);
        }
    }

    public void toggleProcessedById(Long id) {
        Contact contact = getById(id);
        if(contact.isProcessed()) {
            contact.setProcessed(false);
        } else {
            contact.setProcessed(true);
        }
        contactRepository.save(contact);
    }

}
