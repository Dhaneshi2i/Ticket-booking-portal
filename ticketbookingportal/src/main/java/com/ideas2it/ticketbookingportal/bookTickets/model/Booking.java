package com.ideas2it.ticketbookingportal.bookTickets.model;

import com.ideas2it.ticketbookingportal.User.model.User;
import com.ideas2it.ticketbookingportal.movies.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "no_of_seats_booked")
    private int noOfSeatsBooked;

    @OneToMany(mappedBy = "booking")
    private List<Seat> seats;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @OneToOne(mappedBy = "booking")
    private TimeSchedule timeSchedule;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "booking")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}
