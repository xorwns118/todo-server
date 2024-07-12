package org.example.service;

import org.example.constants.TaskStatus;
import org.example.persist.TaskEntity;
import org.example.persist.TaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/*
    unittest 란
    - 함수나 메서드 등의 단위를 테스트 하는 것
    - 개발자가 작성한 코드가 기대한 대로 동작하는 지를 확인하고 버그를 찾는 작업 -> 코드 품질 향상
    독립적이고 명확하고 커버리지 수준이 의미있어야 좋은 Unittest
*/
@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    @DisplayName("할 일 추가 기능 테스트")
    void add() {
        var title = "test";
        var description = "test description";
        var dueDate = LocalDate.now();

        when(taskRepository.save(any(TaskEntity.class)))
                .thenAnswer(invocationOnMock -> {
                    var e = (TaskEntity) invocationOnMock.getArgument(0);
                    e.setId(1L);
                    e.setCreatedAt(new Timestamp(System.currentTimeMillis()));
                    e.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
                    return e;
                });

        var actual = taskService.add(title, description, dueDate);

        verify(taskRepository, times(1)).save(any());

        assertEquals(1L, actual.getId());
        assertEquals(title, actual.getTitle());
        assertEquals(dueDate.toString(), actual.getDueDate());
        assertEquals(TaskStatus.TODO, actual.getStatus());
        assertNotNull(actual.getCreatedAt());
        assertNotNull(actual.getUpdatedAt());
    }
}