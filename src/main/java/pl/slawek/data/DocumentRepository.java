package pl.slawek.data;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.slawek.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
