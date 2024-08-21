package dev.sosnovsky.superkassa.repository;

import dev.sosnovsky.superkassa.model.Obj;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

public interface ObjRepository extends JpaRepository<Obj, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Obj> findById(Long id);
}