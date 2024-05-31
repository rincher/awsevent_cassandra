package com.example.awsevent.repository;

import com.example.awsevent.domain.Event;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface DocumentRepository extends CassandraRepository<Event, UUID> {
    @AllowFiltering
    List<Event> findByCreatedAtBefore(LocalDateTime date);
    void deleteByCreatedAtBefore(LocalDateTime date);
}
