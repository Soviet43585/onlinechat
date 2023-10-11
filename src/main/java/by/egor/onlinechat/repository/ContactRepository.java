package by.egor.onlinechat.repository;

import by.egor.onlinechat.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findAllByIsProcessed(boolean isProcessed);

    Contact findByPhone(String phone);

}
