package com.abc.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.empapp.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>
{

}
