package com.ideas2it.ticketbookingportal.bookTickets.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "time_schedules")
public class TimeSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int time_schedule_id;

    @Column(name = "time_slots")
    private LocalTime timeSlot;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "time_schedules_booking",
            joinColumns = @JoinColumn(name = "time_schedule_id"),
            inverseJoinColumns = @JoinColumn(name = "booking_id"))
    private Booking booking;

}
