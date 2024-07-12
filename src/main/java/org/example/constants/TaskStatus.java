package org.example.constants;

public enum TaskStatus {
    TODO, // 아직 진행되지 않은 상태
    IN_PROGRESS, // 현재 진행중이지만 아직 완료되지 않은 상태
    ON_HOLD, // 홀딩 상태
    COMPLETED, // 완료된 상태
    CANCELLED // 취소된 상태
}
