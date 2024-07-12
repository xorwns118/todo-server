package org.example.persist;

import org.example.constants.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> { // JpaRepository 는 상속받은 인터페이스에서 메소드를 만들어주면 메소드의 이름 규칙에 따라서 쿼리를 생성해주는 기능 제공

    List<TaskEntity> findAllByDueDate(Date dueDate);
    List<TaskEntity> findAllByStatus(TaskStatus status);
}
