package com.ideas2it.ticketbookingportal.bookTickets.model;

import com.ideas2it.ticketbookingportal.movies.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "screen")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "screen_name")
    private String screenName;

    @Column(name = "no_of_seats")
    private int noOfSeats;

    @Column(name = "no_of_rows")
    private int noOfRows;

    @Column(name = "no_of_columns")
    private int noOfColumns;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "screen")
    private List<TimeSchedule> timeSchedules;

    @OneToMany(mappedBy = "screen")
    private Seat seat;

}
