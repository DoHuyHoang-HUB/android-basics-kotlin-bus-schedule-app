package com.example.busschedule.schedule

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

data class Schedule(
    @PrimaryKey val id: Int,
    @NotNull @ColumnInfo(name = "stop_name") val stopName: String,
    @NotNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
)