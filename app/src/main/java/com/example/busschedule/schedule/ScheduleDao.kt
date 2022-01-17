package com.example.busschedule.schedule

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ScheduleDao {
    @Query("select * from schedule order by arrival_time ASC")
    fun getAll(): List<Schedule>
    @Query("select * from schedule where stop_name = :stopName order by arrival_time ASC")
    fun getByStopName(stopName: String): List<Schedule>
}