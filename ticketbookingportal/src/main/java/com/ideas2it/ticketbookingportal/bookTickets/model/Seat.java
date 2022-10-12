package com.ideas2it.ticketbookingportal.bookTickets.model;

import com.ideas2it.ticketbookingportal.movies.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "seat_number")
    private String seatNumber;

    @Column(name = "seat_type")
    private String seatType;

    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @OneToOne
    @JoinColumn(name = "movie_id",referencedColumnName = "id")
    private Movie movie;

    @OneToMany(mappedBy = "seat")
    private Booking booking;

}
